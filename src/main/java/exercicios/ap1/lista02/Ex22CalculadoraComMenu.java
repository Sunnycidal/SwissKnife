package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex22CalculadoraComMenu {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Escolha a operação:");
        int opcao = input.nextInt();

        System.out.println("Informe o primeiro número:");
        double a = input.nextDouble();
        System.out.println("Informe o segundo número:");
        double b = input.nextDouble();

        if(opcao == 1){
            System.out.println("Resultado: " + (a + b));
        } else if(opcao == 2){
            System.out.println("Resultado: " + (a - b));
        } else if(opcao == 3){
            System.out.println("Resultado: " + (a * b));
        } else if(opcao == 4){
            if(b == 0){
                System.out.println("Erro: divisão por zero.");
            } else {
                System.out.println("Resultado: " + (a / b));
            }
        } else {
            System.out.println("Opção inválida.");
        }
        input.close();
    }
}