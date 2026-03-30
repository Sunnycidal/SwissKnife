package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex05NotaAluno {
    public static void main(String[] args) {executar();}

        public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe sua nota:");
        int nota = input.nextInt();

        if(nota>=7){
            System.out.println("Você foi aprovado!");
        }else{
            System.out.println("Você foi reprovado!");
        }
        input.close();
    }
}
