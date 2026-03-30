package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex08DivisivelPor3e4 {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int x = input.nextInt();

        System.out.printf(x % 3 == 0 && x % 4 == 0 ?
                "O número é divisível por 3 e 4!" : "Não é divisível por 3 e 4!");
    input.close();
    }
}
