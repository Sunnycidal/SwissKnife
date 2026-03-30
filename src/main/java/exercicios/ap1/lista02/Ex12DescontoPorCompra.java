package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex12DescontoPorCompra {
    public static void main(String[] args) {executar();}

    public static void executar(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double compra = input.nextDouble();

        if (compra > 500.0){
            compra = compra * 0.90;
            System.out.printf("A compra deu R$%.2f (10%% off)\n", compra);
        } else if (compra >= 200.0 && compra <= 500.0){
            compra = compra * 0.95;
            System.out.printf("A compra deu R$%.2f (5%% off)\n", compra);
        } else {
            System.out.println("Não há descontos abaixo de R$200.00");
        }
        input.close();
    }
}