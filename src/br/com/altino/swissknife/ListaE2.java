package br.com.altino.swissknife;

import java.util.Scanner;

public class ListaE2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora de area de formas geometricas 2000!");
        System.out.println("Pressione ENTER para continuar");
        input.nextLine();

        System.out.println("Informe a base do retangulo (cm)");
        double baseRetangulo = input.nextDouble();
        System.out.println("Informe a altura do retangulo (cm)");
        double alturaRetangulo = input.nextDouble();

        System.out.println("Informe a base do triangulo (cm)");
        double baseTriangulo = input.nextDouble();
        System.out.println("Informe a altura do triangulo (cm)");
        double alturaTriangulo = input.nextDouble();

        double areaRetangulo = baseRetangulo * alturaRetangulo;
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2 ;

        System.out.printf("Area do retangulo: %5.2fcm² %n", areaRetangulo);
        System.out.printf("Area do triangulo: %5.2fcm² %n", areaTriangulo);

        input.close();


    }

}
