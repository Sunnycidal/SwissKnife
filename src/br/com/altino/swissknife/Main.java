package br.com.altino.swissknife;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Exercicio1 exe1 = new Exercicio1();


        int option = input.nextInt();

        switch (option) {

            case 1:
                System.out.println(exe1.somar(1,2));

            break;
        }

    }

}

