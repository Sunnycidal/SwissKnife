package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex11TipoTriangulo {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe os tamanho dos 3 lados do triângulo: ");

        double base = input.nextDouble();
        double ladoE = input.nextDouble();
        double ladoD = input.nextDouble();

        if(ladoE+ladoD>base && base+ladoE>ladoD && base+ladoD>ladoE){
            System.out.println("O triângulo é válido");

            if(base == ladoE && ladoE == ladoD){
                System.out.println("O triângulo é equilátero");}
            else if (!(base==ladoE) && !(ladoE==ladoD) && !(base==ladoD)){
                System.out.println("O triângulo é escaleno");
            }else{
                System.out.println("O triângulo é isósceles");}
        }else{
            System.out.println("O triângulo não é válido");
        }
    input.close();
    }
}
