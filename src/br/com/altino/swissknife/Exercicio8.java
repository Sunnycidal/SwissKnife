package br.com.altino.swissknife;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        //CALCULADORA DE RAÇÃO PRA GATO

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o quanto de racao voce comprou em KG:");
        double pacoteDeRacaoKG = scan.nextDouble();
        System.out.println("Informe em gramas quanto de racao o frajola come");
        double pote1G = scan.nextDouble();
        System.out.println("Informe em gramas quanto de racao o laranjo come");
        double pote2G = scan.nextDouble();

        double consumoDias5 = 5*(pote1G/1000 + pote2G/1000);
        double novoPacoteDeRacaoKG = pacoteDeRacaoKG - consumoDias5;

        System.out.println(
                "A quantidade de racao depois de 5 dias sera: " + novoPacoteDeRacaoKG + "KG"
        );


    }

}
