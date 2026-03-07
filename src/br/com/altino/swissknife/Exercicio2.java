package br.com.altino.swissknife;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        //RECEBER DOIS NÚMEROS E ELEVAR UM PELO OUTRO

        Scanner scan = new Scanner(System.in);

        System.out.println("insert the first number");
        double n1 = scan.nextDouble();
        if (n1<=0)
        {
            System.out.println("IT SHOULD BE >0 DUMBASS");
            return;
        }
        System.out.println("insert the second number");
        double n2 = scan.nextDouble();
        if (n2<=0)
        {
            System.out.println("IT SHOULD BE >0 DUMBASS");
            return;
        }
        double e1 = Math.pow(n1, n2);
        double e2 = Math.pow(n2, n1);

        System.out.println(n1 + " elevado a " + n2+ " =" + e1);
        System.out.println(n2 + " elevado a " + n1+ " =" + e2);

    }

}
