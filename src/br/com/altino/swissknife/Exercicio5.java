package br.com.altino.swissknife;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        //VALOR DO CARRO

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preco de fabrica do carro");
        double price = scan.nextDouble();
        System.out.println("Digite o percentual de lucro do distribuidor");
        double profit  = scan.nextDouble();
        System.out.println("Digite o percentual de imposto sobre o carro");
        double taxes = scan.nextDouble();

        double profitafter = price*(profit/100.0);
        double taxesafter = price*(taxes/100.0);

        System.out.println("Lucro do distribuidor: " + profitafter);
        System.out.println("Valor dos impostos: " + taxesafter);
        System.out.println("Preco final do carro: " + (price + profitafter + taxesafter));

    }

}
