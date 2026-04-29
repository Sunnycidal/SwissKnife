//package exercicios.ap1;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class charat {
//
//    public static void main(String[] args)
//    {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("digite um número");
//
//        int multi = 1;
//        int n = input.nextInt();
//
//        while (n<1 || n>10)
//        {
//            System.out.println("Valor incorreto, digite um número de 1 à 10.");
//            n = input.nextInt();
//        }
//
//        do
//        {
//            System.out.printf("%2d x %2d = %3d%n", n, multi, n * multi);
//            multi++;
//        }
//        while (multi<=10);
//
//
//    }
//
//
//    package com.pi;
//import java.util.Random;
//import java.util.Scanner;
//    public class Lalala
//    {
//        static Scanner scan = new Scanner(System.in);
//        static Random rand = new Random();
//
//        public static void main(String[] args)
//        {
//            aeiou();
//            //        int contador = 0;
////        String caractere;
////
////        do
////        {
////            System.out.println("Informe um caractere e pressione ENTER: ");
////            char carac = (char) rand.nextInt(46, 127);
////            caractere = carac+"";
////            contador++;
////        }while(!caractere.equals("."));
////        System.out.printf("Foram digitados %d caracteres.", contador);
//        }
//
//        static void aeiou()
//        {
//            int contador = 0;
//            String palavra = scan.nextLine().toLowerCase();
//
//            for (int i = 0 ; i < palavra.length() ; i++)
//            {
//                if (palavra.charAt(i) == 'a' || (palavra.charAt(i) == 'e') ||
//                        (palavra.charAt(i) == 'i' || (palavra.charAt(i) == 'o') ||
//                                (palavra.charAt(i) == 'u')))
//                {
//                    contador++;
//                }
//            }
//            System.out.printf("Tem %d vogais", contador);
//        }
//    }
////lenght e charAt
//
//}

//package com.pi;
//
//public class Desenhos
//{
//
//    public static void main(String[] args)
//    {
//        quadrado(25);
//    }
//
//    public Desenhos() {
//    }
//
//    public static void quadrado(int tamanho)
//    {
//        for (int linha = 0;linha < tamanho;linha++)
//        {
//            for (int coluna = 0;coluna < tamanho;coluna++)
//            {
//                System.out.print("█");
//            }
//            System.out.println();
//        }
//    }
//}
