package br.com.senai.centroweg.wegone.repository;

import br.com.senai.centroweg.wegone.exception.RepositoryException;
import br.com.senai.centroweg.wegone.model.Categoria;
import br.com.senai.centroweg.wegone.model.Orientacao;
import br.com.senai.centroweg.wegone.util.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrientacoesRepositoryImpl implements OrientacoesRepository{
    @Override
    public Orientacao cadastrar(Orientacao orientacao){
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

            try(ResultSet rs = stmt.getGeneratedKeys()){
                if (rs.next()) {
                    orientacao.setId(rs.getInt(1));
                }
            }
            return orientacao;
        } catch (SQLException e){
            throw new RepositoryException("Erro no cadastro.", e);
        }
    }

    @Override
    public Optional<Orientacao> pesquisar(int id){
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

            try(ResultSet rs = stmt.executeQuery()){
                if (rs.next()) {
                    return Optional.of(new Orientacao(
                            rs.getInt("id"),
                            rs.getString("titulo"),
                            rs.getString("conteudo"),
                            Categoria.valueOf(rs.getString("categoria")))
                    );
                }

            }
            return Optional.empty();
        } catch (SQLException e){
            throw new RepositoryException("Erro ao consular orientação.", e);
        }
    }

    @Override
    public List<Orientacao> todas() {
        List<Orientacao> orientacoes = new ArrayList<>();
        String query = """
                SELECT id,
                       titulo,
                       conteudo,
                       categoria
                FROM orientacoes
                """;
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery()){

            while(rs.next()){
                orientacoes.add(new Orientacao(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("conteudo"),
                        Categoria.valueOf(rs.getString("categoria"))
                ));
            }
        } catch (SQLException e){
            throw new RepositoryException("Erro ao buscar informações.", e);
        }
        return orientacoes;
    }

    @Override
    public void editar(Orientacao orientacao) {
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
            int linhas = stmt.executeUpdate();

            if(linhas == 0){
                throw new RepositoryException("Nenhuma orientação encontrada.");
            }
        } catch (SQLException e){
            throw new RepositoryException("Erro ao editar orientação.", e);
        }
    }

    @Override
    public void excluir(int id) {
        String query = """
                DELETE FROM orientacoes
                WHERE id = ?
                """;
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setInt(1, id);
            int linhas = stmt.executeUpdate();

            if(linhas == 0){
                throw new RepositoryException("Nenhuma orientação encontrada.");
            }
        } catch (SQLException e){
            throw new RepositoryException("Erro ao excluir orientação.", e);
        }
    }
}
