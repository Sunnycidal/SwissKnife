package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex15Calculadora {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        double a = input.nextDouble();
        System.out.println("Informe o segundo número:");
        double b = input.nextDouble();
        System.out.println("Informe a operação (1-Soma 2-Subtração 3-Multiplicação 4-Divisão):");
        int op = input.nextInt();

        if(op == 1){
            System.out.println("Resultado: " + (a + b));
        } else if(op == 2){
            System.out.println("Resultado: " + (a - b));
        } else if(op == 3){
            System.out.println("Resultado: " + (a * b));
        } else if(op == 4){
            if(b == 0){
                System.out.println("Erro: divisão por zero.");
            } else {
                System.out.println("Resultado: " + (a / b));
            }
        } else {
            System.out.println("Operação inválida.");
        }
        input.close();
    }
}