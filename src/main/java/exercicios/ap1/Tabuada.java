package exercicios.ap1;
import java.util.Scanner;
public class Tabuada {

    public static void main(String[] args)
    {
        long inicio, duracao;
        inicio = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        isPrimo(n);
//        neoTabuada(n);
        System.out.println(isPrimo(n));
        duracao = System.currentTimeMillis() - inicio;
        System.out.println(duracao);
    }

    public static void neoTabuada(int n)
    {
        for (int i = 1; i <= 10; i++)

            System.out.printf
                    ("""
                    %2d x %-2d = %-3d
                    """, n, i, n*i
                    );

    }

    public static boolean isPrimo(int n)
    {
        int divisores = 0;
        for (int i = 1; i<= n; i++)
        {
            if(n%i==0)
            {
                divisores++;
                if(divisores>2)
                {
                    break;
                }
            }
        }
        return divisores <= 2;
    }


}

