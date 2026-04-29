package swissknife;
import java.util.Scanner;
public class Test {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        int caractere;
        int contador = 0;

        caractere = palavra.length();

//        System.out.println(caractere);

        for (int i=0; i < caractere ; i++)
        {
            char saida = palavra.charAt(i);
            if (saida == 'E' || saida == 'O'){
                contador ++;
            }

        }
        System.out.println(contador);
    }

}

//Peça uma palavra e conte quantas vogais ela contém
// (sem usar array, apenas com repetição e charAt).