package br.com.altino.swissknife;

public class Teste {


    public static void main(String[] args) {

        somar(3, 4);
        double b = somarRetorno(4, 6);

    }

    public static void somar(int a, int b){

        System.out.println(a+b);

    }

    public static double somarRetorno(double a, double b){

        return a+b;
    }



}


