package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex01ParOuImpar {

    public static void main(String[] args) {
        executar();
    }

    public static void executar() {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite qualquer número inteiro:");
        int x = input.nextInt();

        System.out.printf(x % 2 == 0 ? "%d É par! %n" : "%d É ímpar%n", x);
        System.out.printf(x % 3 == 0 ? "%d É múltiplo de 3!%n" : "%d Não é múltiplo de 3%n", x);
        System.out.printf(x % 5 == 0 ? "%d É divisível por 5!%n" : "%d Não é divisível por 5!%n", x);

        input.close();
    }
}