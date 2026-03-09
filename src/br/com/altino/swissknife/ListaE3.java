package br.com.altino.swissknife;

import java.util.Scanner;

public class ListaE3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calculador de area de circulo 3000!");
        System.out.println("Pressione ENTER para continuar");
        input.nextLine();

        System.out.println("Informe o raio do circulo (cm)");
        double raio = input.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A area do seu circulo é %5.2fcm²  %n", area);

        input.close();

    }

}
