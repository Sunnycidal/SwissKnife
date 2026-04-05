package exercicios.ap1.lista01;
import java.util.Scanner;
public class calculoIMC {

    public static void main(String[] args){

        //expressões regulares(regex): "inicia(^) > [parâmetros aceitos] > {quantificador} >encerra($)"
        //parâmetros: \d (0-9), A-Za-zÀ-Ÿà-ÿ
        //espaço: "\\s+"

        Scanner in = new Scanner(System.in);
        final String ERRO = "\u001B[31m";
        final String CIANO = "\u001B[36m";
        final String RESET = "\u001B[0m";
        System.out.println(CIANO + "Bem-vindo a calculadora de índice de massa corporal (IMCalc)\n" + RESET);


        //CAPTURA E VALIDAÇÃO DE DADOS

        String nome;
        int idade;
        double peso, altura, imc;

        System.out.println(CIANO + "Informe seu primeiro nome: " + RESET);
        nome = in.nextLine().trim().replaceAll("\\s+"," ").toUpperCase();

        if (nome.length()<2 || nome.length()>50)
        {System.out.println(ERRO + """
                Erro: nome com tamanho inválido!
                Tamanho mínimo => 2 caracteres
                Tamanho máximo => 50 caracteres
                Encerrando o programa...""" + RESET); return;}

        if (!nome.matches("^[A-ZÀ-Ÿ ]+$"))
        {System.out.println(ERRO + """
                Erro: caracteres inválidos!
                Encerrando o programa...""" + RESET); return;}

        System.out.println(nome);


        System.out.println(CIANO + "Informe sua idade: " + RESET);

        if(in.hasNextInt())
        {idade = in.nextInt();}
        else
        {System.out.println(ERRO + """
                Tipo de dado inválido!
                Encerrando o programa...""" + RESET); return;}

        if(idade<=0 || idade>120)
        {System.out.println(ERRO + """
                Idade inválida!
                Encerrando o programa...""" + RESET); return;}

        System.out.println(idade);


        System.out.println(CIANO + "Informe o seu peso: " + RESET);

        if(in.hasNextDouble())
        {peso = in.nextDouble();}
        else
        {System.out.println(ERRO + """
               Tipo de dado inválido!
               Encerrando o programa...""" + RESET); return;}
        if(peso<=0 || peso>600)
        {System.out.println(ERRO + """
                    Peso inválido!
                    Encerrando o programa...""" + RESET); return;}

        System.out.println(peso);



    }

}