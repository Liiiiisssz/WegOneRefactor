package br.com.senai.centroweg.wegone.repository;

import br.com.senai.centroweg.wegone.model.Categoria;
import br.com.senai.centroweg.wegone.model.Orientacoes;
import br.com.senai.centroweg.wegone.util.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrientacoesRepositoryImpl implements OrientacoesRepository{
    @Override
    public Orientacoes cadastrar(Orientacoes orientacao) throws SQLException {
        String query = """
                INSERT INTO orientacoes
                (titulo, conteudo, categoria)
                VALUES (?,?,?)
                """;
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)){
            stmt.setString(1, orientacao.getTitulo());
            stmt.setString(2, orientacao.getConteudo());
            stmt.setString(3, orientacao.getCategoria().toString());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                orientacao.setId(rs.getInt(1));
                return orientacao;
            }
        }
        throw new SQLException("Erro no cadastro!");
    }

    @Override
    public Orientacoes pesquisar(int id) throws SQLException {
        String query = """
                SELECT id,
                       titulo,
                       conteudo,
                       categoria
                FROM orientacoes
                WHERE id = ?
                """;
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Orientacoes(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("conteudo"),
                        Categoria.valueOf(rs.getString("categoria"))
                );
            }
        }
        throw new SQLException("Orientação não encontrada.");
    }

    @Override
    public List<Orientacoes> todas() throws SQLException {
        List<Orientacoes> orientacoes = new ArrayList<>();
        String query = """
                SELECT id,
                       titulo,
                       conteudo,
                       categoria
                FROM orientacoes
                """;
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                orientacoes.add(new Orientacoes(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("conteudo"),
                        Categoria.valueOf(rs.getString("categoria"))
                ));
            }
        }
        return orientacoes;
    }

    @Override
    public void editar(Orientacoes orientacao) throws SQLException {
        String query = """
                UPDATE orientacoes
                SET titulo = ?,
                    conteudo = ?,
                    categoria = ?
                WHERE id = ?
                """;
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setString(1, orientacao.getTitulo());
            stmt.setString(2, orientacao.getConteudo());
            stmt.setString(3, orientacao.getCategoria().toString());
            stmt.setInt(4, orientacao.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public void excluir(int id) throws SQLException {
        String query = """
                DELETE FROM orientacoes
                WHERE id = ?
                """;
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    @Override
    public boolean existe(int id) throws SQLException {
        String query = """
                SELECT titulo
                FROM orientacoes
                WHERE id = ?
                """;
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            return rs.next() ? true : false;
        }
    }
}
