package programas.prova;

public class Teste {

    public static void main(String[] args) {

        double subTotal = 100;

        if(subTotal>10.00){
            double valorDesconto = subTotal * 0.05;
            System.out.println(valorDesconto);
            subTotal = subTotal - valorDesconto;
        }

        System.out.println(subTotal);

    }

}
