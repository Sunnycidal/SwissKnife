package programas.prova;

import java.util.Scanner;

public class Doideira {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====Transportadora do caralho=====\n\n\n");
        System.out.println("============CATÁLOGO==============\n");
        System.out.println("""
                CÓDIGO   PRODUTO                    PREÇO UNITÁRIO
                --------------------------------------------------
                201      TECLADO MECÂNICO           R$320,00
                202      MOUSE GAMER                R$180,00
                203      HD EXTERNO 1TB             R$450,00
                204      ROTEADOR WIRELESS          R$270,00
                205      WEBCAM FULL HD             R$390,00
                """);

        String carrinho;
        double $1 = 320.00, $2 = 180.00, $3 = 450.00, $4 = 270.00, $5 = 390.00,
                subTotal = 0;

        //OPÇÕES (ACHO QUE SERIA MAIS PRODUTIVO TER UTILIZADO O SWITCH DO QUE ESSE TRABALHO SUÍNO COM EXPRESSÕES REGULARES)
        //-----------------------------------------------------------------------------------------------------------------

        System.out.println("Escolha o código de um produto!");
        carrinho = sc.next().trim();

        if(carrinho.matches("^201$")) {
            System.out.println("TECLADO");
            System.out.println("Informe a quantidade(Máx 20): ");
            if (sc.hasNextInt())
            {
                int quantidade = sc.nextInt();
                if(quantidade >0 && quantidade <21){subTotal = quantidade * $1;}
                else{System.out.println("Quantidade inválida");return;}
            }
            else
            {System.out.println("Quantidade inválida");return;}
        }


        else if(carrinho.matches("^202$")) {
            System.out.println("MOUSE GAMER");
            System.out.println("Informe a quantidade(Máx 20): ");
            if (sc.hasNextInt())
            {
                int quantidade = sc.nextInt();
                if(quantidade >0 && quantidade <21){subTotal = quantidade * $2;}
                else{System.out.println("Quantidade inválida"); return;}
            }
            else{System.out.println("Quantidade inválida");return;}
        }


        else if(carrinho.matches("^203$")) {
            System.out.println("HD EXTERNO 1TB");
            System.out.println("Informe a quantidade(Máx 20): ");
            if (sc.hasNextInt())
            {
                int quantidade = sc.nextInt();
                if(quantidade >0 && quantidade <21){subTotal = quantidade * $3;}
                else{System.out.println("Quantidade inválida");return;}
            }
            else{System.out.println("Quantidade inválida");return;}
        }


        else if(carrinho.matches("^204$")) {
            System.out.println("ROTEADOR WIRELESS");
            System.out.println("Informe a quantidade(Máx 20): ");
            if (sc.hasNextInt())
            {
                int quantidade = sc.nextInt();
                if(quantidade >0 && quantidade <21){subTotal = quantidade * $4;}
                else{System.out.println("Quantidade inválida");return;}
            }
            else{System.out.println("Quantidade inválida");return;}
        }


        else if(carrinho.matches("^205$")) {
            System.out.println("WEBCAM FULL HD");
            System.out.println("Informe a quantidade(Máx 20): ");
            if (sc.hasNextInt())
            {
                int quantidade = sc.nextInt();
                if(quantidade >0 && quantidade <21){subTotal = quantidade * $5;}
                else{System.out.println("Quantidade inválida");return;}
            }
            else{System.out.println("Quantidade inválida");return;}
        }
        else {System.out.println("Opção de código inválida");return;}

//REGIÃO
//-------------------------------------------------------------------------------------------

        System.out.println("Informe sua região\n");
        System.out.println("""
                1. Sul (6%)
                2. Sudeste (4%)
                3. Centro-Oeste (8%)
                4. Nordeste (11%)
                5. Norte (14%)
                """);

        String regiao = sc.next().toUpperCase();
        double adicionalRegional = 0;
        double subTotalAntigo = subTotal;

        if (regiao.matches("^1$")){adicionalRegional = subTotal * 0.06;}
        else if (regiao.matches("^2$")){adicionalRegional = subTotal * 0.04;}
        else if (regiao.matches("^3$")){adicionalRegional = subTotal * 0.08;}
        else if (regiao.matches("^4$")){adicionalRegional = subTotal * 0.11;}
        else if (regiao.matches("^5$")){adicionalRegional = subTotal * 0.14;}
        else {System.out.println("Opção inválida!");return;}


//ADICIONAIS
//-----------------------------------------------------------------------------------------------

        System.out.println("""
                --------SERVIÇOS ADICIONAIS--------
                -----------------------------------
                SEGURO DE CARGA.................+6%
                RASTREAMENTO EM TEMPO REAL......+4%
                ESCOLTA ARMADA.................+12%
                """);

        double adicional = 0;

        System.out.println("Deseja acrescentar o seguro? (S/N)");
        String respostaSeguro = sc.next().toUpperCase();
        if (respostaSeguro.matches("^S$")){
            adicional += subTotal * 0.06;
            System.out.println("Adiconamos o seguro!");
        }
        else{System.out.println("Seguro não adicionado");}

        System.out.println("Deseja acrescentar o Rastreamento? (S/N)");
        String respostaRastreamento = sc.next().toUpperCase();
        if (respostaRastreamento.matches("^S$")){
            adicional += subTotal * 0.04;
            System.out.println("Adicionamos o rastreamento");}
        else{System.out.println("Rastreamento não adicionado");}

        System.out.println("Deseja acrescentar a escolta armada? (S/N)");
        String respostaEscolta = sc.next().toUpperCase();
        if (!(regiao.equals("1") || regiao.equals("2"))){
            if (respostaEscolta.matches("^S$") ){
                adicional += subTotal * 0.12;
                System.out.println("Adicionamos a escolta armada!");
            }
            else{System.out.println("Escolta não adicionada");}
        }
        else{System.out.println("Escolta não disponível para as suas regiões");}

//EMBALAGENS
//------------------------------------------------------------------------------------------

        System.out.println("""
                1. Caixa simples.........R$12,00
                2. Caixa reforçada.......R$22,00
                3. Caixa térmica.........R$30,00
                4. Envelope plástico.....R$06,00
                \n""");
        System.out.println("Informe a embalagem: ");

        String embalagem = sc.next().toUpperCase();
        double adicionalEmbalagem = 0;

        if (embalagem.matches("^1$")){adicionalEmbalagem = 12;}
        else if (embalagem.matches("^2$")){adicionalEmbalagem = 22;}
        else if (embalagem.matches("^3$")){adicionalEmbalagem = 30;}
        else if (embalagem.matches("^4$")){adicionalEmbalagem = 6;}
        else {System.out.println("Opção inválida!");return;}


//DESCONTOS
//--------------------------------------------------------------------------------------------

        double valorDesconto = 0;
        if(subTotal>2000.00)
        {
            valorDesconto = subTotal * 0.05;
            subTotal = subTotal - valorDesconto;
        }

//SAIDA
//---------------------------------------------------------------------------------------------

        double valorFinal = subTotal+adicionalRegional+adicionalEmbalagem+adicional;

        System.out.println("\n--------- RESUMO DO PEDIDO ---------");
        System.out.printf("Subtotal:              R$ %10.2f%n", subTotalAntigo);
        System.out.printf("Custo Frete:           R$ %10.2f%n", adicionalRegional);
        System.out.printf("Custo Embalagem:       R$ %10.2f%n", adicionalEmbalagem);
        System.out.printf("Serviços Adicionais:   R$ %10.2f%n", adicional);
        if (valorDesconto>0)
        {
            System.out.printf("Valor do desconto:     R$ %10.2f%n", valorDesconto);
        }
        System.out.println("------------------------------------");
        System.out.printf("VALOR TOTAL:           R$ %10.2f%n", valorFinal);


        sc.close();
    }

}
