package br.com.altino.swissknife;
import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;
public class Main {

 /*   public static void main(String[] args) {

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

  */

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

    public static void main4(String[] args) {

        //CALCULADORA DE ANO

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano atual");
        int y = scan.nextInt();
        System.out.println("Digite o seu ano de nascimento");
        int b = scan.nextInt();

        int a = y-b;
        int a2050 = 2050-b;

        System.out.println("Sua idade atual: " + a);
        System.out.println("Sua idade em 2050 sera: " + a2050);
    }

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

    public static void main(String[] args) {

        //CALCULADORA DE TAXAS

        Scanner scan = new Scanner(System.in);

        final double TAXA_CPMF = 0.0038;

        System.out.println("Informe o valor do salario:");
        double salario = scan.nextDouble();

        System.out.println("Informe o valor do cheque 1:");
        double cheque1 = scan.nextDouble();

        System.out.println("Cheque 2:");
        double cheque2 = scan.nextDouble();

        double debito1 = cheque1 * (1 + TAXA_CPMF);
        double debito2 = cheque2 * (1 + TAXA_CPMF);

        double saldoAtual = salario - debito1 - debito2;

        System.out.printf("Saldo atual: R$ %.2f%n", saldoAtual);

    }

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

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio do circulo (cm):");
        double r = scan.nextDouble();

        double a = Math.PI * Math.pow(r, 2);
        System.out.printf("Area do circulo: %.2f cm²%n",  a );

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char a = "z";
    }

}


