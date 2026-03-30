package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex14NotaParaConceito {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a nota (0 a 10):");
        double nota = input.nextDouble();

        if(nota >= 9){
            System.out.println("Nota A!");
        } else if(nota >= 8){
            System.out.println("Nota B!");
        } else if(nota >= 7){
            System.out.println("Nota C!");
        } else if(nota >= 6){
            System.out.println("Nota D!");
        } else {
            System.out.println("Nota E!");
        }
        input.close();
    }
}