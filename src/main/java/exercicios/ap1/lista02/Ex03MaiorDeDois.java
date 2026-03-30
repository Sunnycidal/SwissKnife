package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex03MaiorDeDois {
    public static void main(String[] args) {executar();}

    public static void executar() {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe dois números");
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.printf(x == y ? "São iguais" : "%d É o maior número", Math.max(x,y));
        input.close();
    }
}


