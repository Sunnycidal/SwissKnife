package br.com.altino.swissknife;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        //CONVERSOR DE MEDIDAS FEET

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a medida: (ft)");
        double f = scan.nextDouble();

        double pol = f*12;
        double yards = f/3.0;
        double miles = f/5280.0;

        System.out.println("Segue as conversões:");
        System.out.println("Milhas: " + miles);
        System.out.println("Jardas: " + yards);
        System.out.println("Polegadas: " + pol);
    }

}
