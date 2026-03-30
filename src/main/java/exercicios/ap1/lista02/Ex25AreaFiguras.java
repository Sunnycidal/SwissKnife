package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex25AreaFiguras {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("1 - Círculo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Retângulo");
        System.out.println("Escolha a figura:");
        int opcao = input.nextInt();

        if(opcao == 1){
            System.out.println("Informe o raio:");
            double raio = input.nextDouble();
            System.out.printf("Área: %.2f%n", Math.PI * raio * raio);
        } else if(opcao == 2){
            System.out.println("Informe o lado:");
            double lado = input.nextDouble();
            System.out.printf("Área: %.2f%n", lado * lado);
        } else if(opcao == 3){
            System.out.println("Informe a base:");
            double base = input.nextDouble();
            System.out.println("Informe a altura:");
            double altura = input.nextDouble();
            System.out.printf("Área: %.2f%n", base * altura);
        } else {
            System.out.println("Opção inválida.");
        }
        input.close();
    }
}