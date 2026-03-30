package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex21CafeDaManha {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("=== Cardápio ===");
        System.out.println("1 - Pão com manteiga");
        System.out.println("2 - Café com leite");
        System.out.println("3 - Suco de laranja");
        System.out.println("4 - Omelete");
        System.out.println("Escolha uma opção:");
        int opcao = input.nextInt();

        if(opcao == 1){
            System.out.println("Você escolheu: Pão com manteiga.");
        } else if(opcao == 2){
            System.out.println("Você escolheu: Café com leite.");
        } else if(opcao == 3){
            System.out.println("Você escolheu: Suco de laranja.");
        } else if(opcao == 4){
            System.out.println("Você escolheu: Omelete.");
        } else {
            System.out.println("Opção inválida.");
        }
        input.close();
    }
}