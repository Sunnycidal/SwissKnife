package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex24ConversorDeMoeda {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);

        double dolar = 5.00;
        double euro  = 5.50;

        System.out.println("1 - Real para Dólar");
        System.out.println("2 - Real para Euro");
        System.out.println("3 - Dólar para Real");
        System.out.println("Escolha a conversão:");
        int opcao = input.nextInt();

        System.out.println("Informe o valor:");
        double valor = input.nextDouble();

        if(opcao == 1){
            System.out.printf("Resultado: U$ %.2f%n", valor / dolar);
        } else if(opcao == 2){
            System.out.printf("Resultado: € %.2f%n", valor / euro);
        } else if(opcao == 3){
            System.out.printf("Resultado: R$ %.2f%n", valor * dolar);
        } else {
            System.out.println("Opção inválida.");
        }
        input.close();
    }
}