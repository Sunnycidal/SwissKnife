package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex07MultiploDeCinco {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número: ");

        int x = input.nextInt();
        System.out.printf(x % 5 == 0 ? "%d É múltiplo de 5" : "%d Não é múltiplo de 5", x);

        input.close();
    }
}
