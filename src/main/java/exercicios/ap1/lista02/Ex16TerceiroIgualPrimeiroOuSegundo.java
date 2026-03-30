package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex16TerceiroIgualPrimeiroOuSegundo {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe três números:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if(c == a || c == b){
            System.out.println("O terceiro número é igual ao primeiro ou ao segundo.");
        } else {
            System.out.println("O terceiro número não é igual a nenhum dos anteriores.");
        }
        input.close();
    }
}