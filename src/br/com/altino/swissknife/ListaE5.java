package br.com.altino.swissknife;

import java.util.Scanner;

public class ListaE5 {

    public static void main(String[] args) {

        //Solicite a idade em anos e converta para dias (desconsidere anos bissextos).

        Scanner input = new Scanner(System.in);

        System.out.println("Conversor de idade mundano...");
        System.out.println("Informe sua idade em anos:");

        int idade = input.nextInt();

        int idadeEmDias = idade * 365;

        System.out.printf("Sua idade em dias é %d", idadeEmDias);


    }


}
