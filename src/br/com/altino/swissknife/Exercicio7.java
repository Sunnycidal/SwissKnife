package br.com.altino.swissknife;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        //CALCULADORA DE TAXAS

        Scanner scan = new Scanner(System.in);

        final double TAXA_CPMF = 0.0038;

        System.out.println("Informe o valor do salario:");
        double salario = scan.nextDouble();

        System.out.println("Informe o valor do cheque 1:");
        double cheque1 = scan.nextDouble();

        System.out.println("Cheque 2:");
        double cheque2 = scan.nextDouble();

        double debito1 = cheque1 * (1 + TAXA_CPMF);
        double debito2 = cheque2 * (1 + TAXA_CPMF);

        double saldoAtual = salario - debito1 - debito2;

        System.out.printf("Saldo atual: R$ %.2f%n", saldoAtual);

    }

}
