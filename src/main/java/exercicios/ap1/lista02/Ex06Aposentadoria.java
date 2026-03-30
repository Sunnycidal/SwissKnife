package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex06Aposentadoria {
    public static void main(String [] args) {executar();}

    public static void executar() {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = input.nextInt();

        if (idade >= 65 && idade <130){
            System.out.println("Você pode se aposentar!");
        } else if (idade<=3) {
            System.out.println("Como você chegou aqui?");
        }else if (idade>=130){
                System.out.println("Você deveria estar morto!");
        }else{
            System.out.println("Você não pode se aposentar!");
        }
        input.close();
    }

}
