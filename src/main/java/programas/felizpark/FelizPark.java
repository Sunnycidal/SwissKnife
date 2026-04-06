package programas.felizpark;
import java.time.Duration;
import java.util.Scanner;
import java.time.LocalTime;

public class FelizPark {

    public static void main(String[] args) {

        System.out.println("Estacionamento FelizPark");
        Scanner in = new Scanner(System.in);

        //CAPTURA E VALIDAÇÃO DE DADOS ===========================================================
        String rawHoraEntrada, rawHoraSaida, placa;
        LocalTime horaEntrada, horaSaida;

        System.out.println("Informe a placa do seu carro ex: (ABC1D34): ");
        placa = in.nextLine().trim().replaceAll("\\s","").toUpperCase();
        if(!placa.matches("^([A-Z]{3}[0-9]{4})|([A-Z]{3}[0-9][A-Z][0-9]{2})$")){
            System.out.println("Erro: Placa inválida!\nEncerrando app...");
            return;
        }

        System.out.println("Informe o horário de entrada no formato 24h(HH:mm): ");
        rawHoraEntrada = in.next();
        if(rawHoraEntrada.matches("^([01]\\d|2[0-3]):[0-5]\\d$")){
            horaEntrada = LocalTime.parse(rawHoraEntrada);
            if (horaEntrada.isBefore(LocalTime.of(6, 0)) ||
                    horaEntrada.isAfter(LocalTime.of(22, 0))) {
                System.out.println("Erro: Fora do horário de funcionamento (06:00 - 22:00)");
                return;
            }
        }else{
            System.out.println("Erro: Horário inválido!\nEncerrando o app...");
            return;
        }

        System.out.println("Informe o horário de saída no formato 24h(HH:mm): ");
        rawHoraSaida = in.next();
        if(rawHoraSaida.matches("^([01]\\d|2[0-3]):[0-5]\\d$")){
            horaSaida = LocalTime.parse(rawHoraSaida);
            if (horaSaida.isBefore(LocalTime.of(6, 0)) ||
                    horaSaida.isAfter(LocalTime.of(22, 0))) {
                System.out.println("Erro: Fora do horário de funcionamento (06:00 - 22:00)\n" +
                        "Encerrando o app...");
                return;
            }
        }
        else{
            System.out.println("Erro: Horário inválido!\nEncerrando o app...");
            return;
        }

        boolean cobertura;
        System.out.println("Vaga coberta? (S/N): ");
        String respostaCoberta = in.next().trim().toUpperCase();
        if(respostaCoberta.matches("^S$")){
            cobertura = true;
        }
        else if (respostaCoberta.matches("^N$")) {
            cobertura = false;
        }
        else {
            System.out.println("Erro: Resposta inválida!");
            return;
        }


        //========================================================================================
        //PROCESSAMENTO DE REGRAS=================================================================

        Duration duracao = Duration.between(horaEntrada, horaSaida);
        long minutosReais = duracao.toMinutes();
        double valorFinal = 0;

        if (minutosReais >= 10) {
            long minutosParaCalculo = minutosReais;

            if (minutosParaCalculo < 60) {
                minutosParaCalculo = 60;
            }
            else if (minutosParaCalculo > 300) {
                minutosParaCalculo = 300;
            }

            valorFinal = minutosParaCalculo * (7.0 / 60.0);
        }

        if (cobertura) {
            valorFinal = valorFinal * 1.20;
        }

        //SAÍDA DE DADOS
        //===================================================================================

        long horas = minutosReais / 60;
        long minutos = minutosReais % 60;

        String tipoVaga = cobertura ? "Coberta" : "Descoberta";

        System.out.printf("""
                ========== RECIBO FELIZPARK ==========
                Placa:         %s
                Entrada:       %s
                Saída:         %s
                Tempo:         %d hora(s) e %d minuto(s)
                Tipo de vaga:  %s
                Valor a pagar: R$ %.2f
                ======================================
                """, placa, rawHoraEntrada, rawHoraSaida, horas, minutos, tipoVaga, valorFinal);

        in.close();
    }
}