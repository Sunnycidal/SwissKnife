package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex04MaiorDeTres {
    public static void main(String[] args) {executar();}

    public static void executar() {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe 3 números:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int maior;

        if (a>=b && a>=c){
            maior=a;
        } else if (b>=c) {
            maior=b;
        }else{
            maior=c;
        }
        System.out.println("Maior número é: "+maior);

        input.close();
    }
}
//        OU
//        System.out.println("Informe três números");
//
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//
//        int d = (Math.max(c,(Math.max(a,b))));
//        System.out.printf("%d É o maior número", d);