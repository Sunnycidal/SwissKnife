package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex20ClassificacaoNumero {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número:");
        double n = input.nextDouble();

        if(n > 0){
            System.out.println("Positivo");
        } else if(n < 0){
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }

        if((int) n % 2 == 0 && n == (int) n){
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        if(n == (int) n){
            System.out.println("Inteiro");
        } else {
            System.out.println("Decimal");
        }
        input.close();
    }
}