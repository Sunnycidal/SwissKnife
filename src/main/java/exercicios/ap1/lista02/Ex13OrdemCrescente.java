package exercicios.ap1.lista02;
import java.util.Scanner;
public class Ex13OrdemCrescente {
    public static void main(String[] args) {executar();}
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double c = sc.nextDouble();

        double menor, meio, maior;

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) { meio = b; maior = c; }
            else        { meio = c; maior = b; }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) { meio = a; maior = c; }
            else        { meio = c; maior = a; }
        } else {
            menor = c;
            if (a <= b) { meio = a; maior = b; }
            else        { meio = b; maior = a; }
        }

        System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior);
    }
}