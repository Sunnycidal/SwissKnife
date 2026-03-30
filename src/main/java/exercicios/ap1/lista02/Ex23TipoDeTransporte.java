package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex23TipoDeTransporte {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("1 - Carro");
        System.out.println("2 - Bicicleta");
        System.out.println("3 - Ônibus");
        System.out.println("4 - Avião");
        System.out.println("Escolha o transporte:");
        int opcao = input.nextInt();

        if(opcao == 1){
            System.out.println("Velocidade média: 80 km/h");
        } else if(opcao == 2){
            System.out.println("Velocidade média: 20 km/h");
        } else if(opcao == 3){
            System.out.println("Velocidade média: 60 km/h");
        } else if(opcao == 4){
            System.out.println("Velocidade média: 900 km/h");
        } else {
            System.out.println("Opção inválida.");
        }
        input.close();
    }
}