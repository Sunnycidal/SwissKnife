package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex19ClassificacaoIMC {
    public static void main(String[] args) {executar();}
    public static void executar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o peso (kg):");
        double peso = input.nextDouble();
        System.out.println("Informe a altura (m):");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f%n", imc);

        if(imc < 18.5){
            System.out.println("Abaixo do peso.");
        } else if(imc < 25){
            System.out.println("Normal.");
        } else if(imc < 30){
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidade.");
        }
        input.close();
    }
}