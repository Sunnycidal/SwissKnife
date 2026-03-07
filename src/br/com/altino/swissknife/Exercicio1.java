package br.com.altino.swissknife;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        //2. CALCULOS MATEMÁTICOS DE UM NÚMERO RANDÔMICO

        Scanner scan = new Scanner(System.in);

        System.out.println("insert the number (it should be >0)");
        double n1 = scan.nextDouble();
        if (n1<=0)
        {
            System.out.println("IT SHOULD BE >0 DUMBASS");
            return;
        }

        double sqrt = Math.sqrt(n1);
        double cbrt = Math.cbrt(n1);
        double square = Math.pow(n1, 2);
        double cube = Math.pow(n1, 3);

        System.out.println("--- Dados matematicos do seu numero ---");
        System.out.println("Elevado ao quadrado: " + square);
        System.out.println("Elevado ao cubo: " + cube);
        System.out.println("Raiz quadrada: " + sqrt);
        System.out.println("Raiz cubica: " + cbrt);
    }

}
