package br.com.altino.swissknife;

import java.util.Scanner;

public class ListaE1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o seu nome");
        String nome = input.nextLine();

        System.out.println("Informe a sua idade");
        int idade = input.nextInt();

        System.out.println("Informe o seu peso em KG");
        double peso = input.nextDouble();

        System.out.println("Informe a sua altura em metros");
        double altura = input.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("Olá %s você tem %d anos e seu IMC é %5.2f\n", nome, idade, imc);

        input.close();

    }

}
