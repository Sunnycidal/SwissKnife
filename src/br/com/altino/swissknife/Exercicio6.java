package br.com.altino.swissknife;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        //SALÁRIO A RECEBER

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor do salario minimo");
        double salariomin = scan.nextDouble();
        System.out.println("Insira a quantidade de horas trabalhadas");
        int horastrabalhadas = scan.nextInt();
        double valorhortrabalhadas = salariomin/2;

        double salariobruto = horastrabalhadas*valorhortrabalhadas;

        double salarioreceber = salariobruto - (salariobruto * 0.03);

        System.out.println("Seu salário a receber é R$"+salarioreceber);


    }

}
