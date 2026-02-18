package br.com.senai.centroweg.wegone.exception;

public class RepositoryException extends RuntimeException{

    public RepositoryException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
    public RepositoryException(String message) {
        super(message);
    }

}
