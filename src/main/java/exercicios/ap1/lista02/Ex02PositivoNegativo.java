package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex02PositivoNegativo {

    public static void main(String[] args) {executar();}

    public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número:");
        int x = input.nextInt();

       if (x > 0) {
           System.out.println("O número é positivo");
       } else {
           System.out.println(x == 0 ? "O número é neutro (0)" : "O número é negativo");
       }
       input.close();
    }

}
