package br.com.senai.centroweg.wegone.util;

import java.util.Scanner;

public class Sc {
    private final Scanner sc;
    public Sc(Scanner sc) {
        this.sc = sc;
    }

    public int sc(){
        System.out.print("> ");
        String entrada = sc.nextLine();
        try{
            return Integer.parseInt(entrada);
        } catch (NumberFormatException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
