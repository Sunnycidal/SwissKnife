package br.com.altino.swissknife;

import java.util.Scanner;

public class ListaE6 {

    //Receba um valor em metros e converta para centímetros, milímetros e quilômetros.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora Centimilimetricometra v3980309128310.0!");
        System.out.println("Pressione ENTER para continuar!");
        input.nextLine();

        System.out.println("Informe qualquer valor em metros:");
        double m = input.nextDouble();

        double cm = m * 100;
        double mm = m * 1000;
        double km = m / 1000;

        System.out.println("Seus metros em: CM, MM, e KM; respectivamente");
        System.out.printf("Centimetros: %5.2f %n Milimetros: %5.2f %n Quilometros: %5.2f", cm, mm, km);



    }




}
