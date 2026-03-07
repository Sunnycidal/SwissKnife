package br.com.altino.swissknife;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        //CALCULADORA DE ANO

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano atual");
        int y = scan.nextInt();
        System.out.println("Digite o seu ano de nascimento");
        int b = scan.nextInt();

        int a = y-b;
        int a2050 = 2050-b;

        System.out.println("Sua idade atual: " + a);
        System.out.println("Sua idade em 2050 sera: " + a2050);
    }

}
