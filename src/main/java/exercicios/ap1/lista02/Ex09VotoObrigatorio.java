package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex09VotoObrigatorio {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = input.nextInt();

        System.out.printf(idade >= 18 && idade <=70 ?
                "Seu voto é obrigatório!" : "Seu voto não é obrigatório!");
    input.close();
    }
}
