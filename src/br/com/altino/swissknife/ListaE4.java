package br.com.altino.swissknife;

import java.util.Scanner;

public class ListaE4 {

    public static void main(String[] args) {

        //Solicite o valor da hora trabalhada e o total de horas no mês. Calcule e exiba os salários mensal e anual.

        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora de salarios v1.0");
        System.out.println("Pressione ENTER para continuar!");
        input.nextLine();

        System.out.println("Informe o valor em R$ da sua hora trabalhada:");
        double horaTrabalhada = input.nextDouble();

        System.out.println("Informe quantas horas voce trabalha por mes:");
        int qtdHorasTrabalhadas = input.nextInt();

        double valorTrabalhoMensal = horaTrabalhada * qtdHorasTrabalhadas;
        double valorTrabalhoAnual = valorTrabalhoMensal * 12.0;

        System.out.printf("Seu salario mensal é: R$ %5.2f %n", valorTrabalhoMensal);
        System.out.printf("Seu salario anual é: R$ %5.2f %n", valorTrabalhoAnual);

        input.close();
    }

}
