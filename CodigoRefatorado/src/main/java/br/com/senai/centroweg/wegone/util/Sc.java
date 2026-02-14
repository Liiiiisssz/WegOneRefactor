package br.com.senai.centroweg.wegone.util;

import java.util.Scanner;

public class Sc {
    private static final Scanner sc = new Scanner(System.in);

    public static int lerInt(){
        System.out.print("> ");
        String entrada = sc.nextLine();
        try{
            return Integer.parseInt(entrada);
        } catch (NumberFormatException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public static String lerString(){
        return sc.nextLine();
    }
}
