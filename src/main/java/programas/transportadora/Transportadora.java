package programas.transportadora;

import java.util.Scanner;

public class Transportadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====Transportadora do caralho=====\n\n\n");
        System.out.println("============CATÁLOGO==============\n");

        System.out.println("""
                CÓDIGO   PRODUTO                    PREÇO UNITÁRIO
                --------------------------------------------------
                001      MOUSE ÓPITCO USB           R$35,00
                002      SSD 240GB                  R$200,00
                003      ADAPTADOR WIRELESS USB     R$75,00
                004      PENDRIVE 16GB              R$20,00
                005      WEBCAM                     R$159,00
                """);

        String carrinho;
        double $1 = 35.00, $2 = 200.00, $3 = 75.00, $4 = 20.00, $5 = 159.00,
        subTotal = 0;

        System.out.println("Escolha o código de um produto!");

        carrinho = sc.next().trim();

        if(carrinho.matches("^1$"))
        {
            System.out.println("Mouse");
            System.out.println("Informe a quantidade(Máx 10): ");
            if (sc.hasNextInt()){
                int quantidade = sc.nextInt();
                if(quantidade >0 && quantidade <11){subTotal = quantidade * $1;}
                else{System.out.println("Quantidade inválida");return;}

            }else{
                System.out.println("Quantidade inválida");
                return;
            }
        }

        else if(carrinho.matches("^2$"))
        {
            System.out.println("SSD");
            System.out.println("Informe a quantidade(Máx 10): ");
            if (sc.hasNextInt()){
                int quantidade = sc.nextInt();
                if(quantidade >0 && quantidade <11){subTotal = quantidade * $2;}
                else{System.out.println("Quantidade inválida"); return;}

            }else{
                System.out.println("Quantidade inválida");
                return;
            }
        }

        else if(carrinho.matches("^3$"))
        {
            System.out.println("Adaptador wireless");
            System.out.println("Informe a quantidade(Máx 10): ");
            if (sc.hasNextInt()){
                int quantidade = sc.nextInt();
                if(quantidade >0 && quantidade <11){subTotal = quantidade * $3;}
                else{System.out.println("Quantidade inválida");return;}

            }else{
                System.out.println("Quantidade inválida");
                return;
            }
        }

        else if(carrinho.matches("^4$"))
        {
            System.out.println("Pendrive");
            System.out.println("Informe a quantidade(Máx 10): ");
            if (sc.hasNextInt()){
                int quantidade = sc.nextInt();
                if(quantidade >0 && quantidade <11){subTotal = quantidade * $4;}
                else{System.out.println("Quantidade inválida");return;}

            }else{
                System.out.println("Quantidade inválida");
                return;
            }
        }

        else if(carrinho.matches("^5$"))
        {
            System.out.println("WEBCAM");
            System.out.println("Informe a quantidade(Máx 10): ");
            if (sc.hasNextInt()){
                int quantidade = sc.nextInt();
                if(quantidade >0 && quantidade <11){subTotal = quantidade * $5;}
                else{System.out.println("Quantidade inválida");return;}

            }else{
                System.out.println("Quantidade inválida");
                return;
            }
        }
        else {
            System.out.println("Opção inválida");
            return;
        }


        System.out.println("""
                SERVIÇOS ADICIONAIS
                -------------------
                SEGURO............+5%
                RASTREAMENTO......+3%
                ESCOLTA ARMADA...+10%
                """);

        double adicional = 0;

        System.out.println("Deseja acrescentar o seguro? (S/N)");
        String respostaSeguro = sc.next().toUpperCase();
        if (respostaSeguro.matches("^S$")){adicional += subTotal * 0.05;}

        System.out.println("Deseja acrescentar o Rastreamento? (S/N)");
        String respostaRastreamento = sc.next().toUpperCase();
        if (respostaRastreamento.matches("^S$")){adicional += subTotal * 0.03;}

        System.out.println("Deseja acrescentar a escolta armada? (S/N)");
        String respostaEscolta = sc.next().toUpperCase();
        if (respostaEscolta.matches("^S$")){adicional += subTotal * 0.10;}


        System.out.println("Informe sua região\n");
        System.out.println("""
                1. Sul (7%)
                2. Sudeste (5%)
                3. Centro-Oeste (9%)
                4. Nordeste (12%)
                5. Norte (15%)
                """);

        String regiao = sc.next().toUpperCase();
        double adicionalRegional = 0;

        if (regiao.matches("^1$")){adicionalRegional = subTotal * 0.07;}
        else if (regiao.matches("^2$")){adicionalRegional = subTotal * 0.05;}
        else if (regiao.matches("^3$")){adicionalRegional = subTotal * 0.09;}
        else if (regiao.matches("^4$")){adicionalRegional = subTotal * 0.12;}
        else if (regiao.matches("^5$")){adicionalRegional = subTotal * 0.15;}
        else {
            System.out.println("Opção inválida!");
            return;
        }

        System.out.println("""
                1. Caixa de papelão grande comum....R$10,00
                2. Caixa de papelão grande triplex..R$20,00
                3. Plástico bolha...................R$12,00
                4. Saco plástico....................R$05,00
                \n""");
        System.out.println("Informe a embalagem: ");

        String embalagem = sc.next().toUpperCase();
        double adicionalEmbalagem = 0;

        if (embalagem.matches("^1$")){adicionalEmbalagem = 10;}
        else if (embalagem.matches("^2$")){adicionalEmbalagem = 20;}
        else if (embalagem.matches("^3$")){adicionalEmbalagem = 12;}
        else if (embalagem.matches("^4$")){adicionalEmbalagem = 5;}
        else {
            System.out.println("Opção inválida!");
            return;
        }

        double valorFinal = subTotal+adicionalRegional+adicionalEmbalagem+adicional;

        System.out.println("\n--- RESUMO DO PEDIDO ---");
        System.out.printf("Subtotal:              R$ %10.2f%n", subTotal);
        System.out.printf("Serviços Adicionais:   R$ %10.2f%n", adicional);
        System.out.printf("Taxa Regional:         R$ %10.2f%n", adicionalRegional);
        System.out.printf("Custo Embalagem:       R$ %10.2f%n", adicionalEmbalagem);
        System.out.println("----------------------------------");
        System.out.printf("VALOR TOTAL:           R$ %10.2f%n", valorFinal);









    }
}








