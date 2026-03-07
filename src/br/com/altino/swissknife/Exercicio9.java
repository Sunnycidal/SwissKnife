package br.com.altino.swissknife;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio do circulo (cm):");
        double r = scan.nextDouble();

        double a = Math.PI * Math.pow(r, 2);
        System.out.printf("Area do circulo: %.2f cm²%n",  a );

    }

}
