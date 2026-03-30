package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex17MesmaParidade {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe dois números inteiros:");
        int a = input.nextInt();
        int b = input.nextInt();

        if(a % 2 == b % 2){
            System.out.println("Os dois têm a mesma paridade.");
        } else {
            System.out.println("Paridades diferentes.");
        }
        input.close();
    }
}