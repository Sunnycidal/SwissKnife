import java.time.Duration;
import java.time.LocalTime;

public class TestadorRapido {

    public static void main(String[] args) {
        System.out.println("=== TESTANDO FELIZPARK - TODOS OS CASOS ===\n");

        // Teste 1: Caso do exemplo da prova - 2h30min coberta
        testar("ABC1234", "08:15", "10:45", true);

        // Teste 2: Mesmo tempo, descoberta
        testar("ABC1234", "08:15", "10:45", false);

        // Teste 3: Menos de 10 minutos (não cobra)
        testar("XYZ9876", "10:00", "10:05", false);

        // Teste 4: Exatamente 10 minutos (cobra mínimo 1h)
        testar("DEF5678", "14:00", "14:10", false);

        // Teste 5: 45 minutos (cobra 1h)
        testar("GHI9012", "09:00", "09:45", false);

        // Teste 6: Exatamente 1 hora
        testar("JKL3456", "10:00", "11:00", false);

        // Teste 7: Mais de 5 horas (cobra máximo 5h)
        testar("MNO7890", "10:00", "17:00", false);

        // Teste 8: Mais de 5 horas com cobertura
        testar("PQR1234", "10:00", "17:00", true);

        // Teste 9: 3 horas exatas descoberta
        testar("STU5678", "14:00", "17:00", false);

        // Teste 10: 3 horas exatas coberta
        testar("VWX9012", "14:00", "17:00", true);

        // Teste 11: 1h30min descoberta
        testar("AAA1111", "10:00", "11:30", false);

        // Teste 12: 1h30min coberta
        testar("BBB2222", "10:00", "11:30", true);

        // Teste 13: Exatamente 5 horas
        testar("CCC3333", "10:00", "15:00", false);

        // Teste 14: 30 minutos (cobra 1h)
        testar("DDD4444", "15:00", "15:30", false);

        // Teste 15: 6 horas (cobra máximo 5h)
        testar("EEE5555", "08:00", "14:00", false);

        System.out.println("\n=== TESTES CONCLUÍDOS ===");
    }

    public static void testar(String placa, String entrada, String saida, boolean cobertura) {
        LocalTime horaEntrada = LocalTime.parse(entrada);
        LocalTime horaSaida = LocalTime.parse(saida);

        // ===== LÓGICA DE CÁLCULO (COPIADA DO SEU FELIZPARK) =====
        Duration duracao = Duration.between(horaEntrada, horaSaida);
        long minutosReais = duracao.toMinutes();
        double valorFinal = 0;

        // Só cobra se ficar mais de 10 minutos
        if (minutosReais >= 10) {
            long minutosParaCalculo = minutosReais;

            // Mínimo: 1 hora (60 minutos)
            if (minutosParaCalculo < 60) {
                minutosParaCalculo = 60;
            }
            // Máximo: 5 horas (300 minutos)
            else if (minutosParaCalculo > 300) {
                minutosParaCalculo = 300;
            }

            // Calcula: R$ 7,00 por hora = 7/60 por minuto
            valorFinal = minutosParaCalculo * (7.0 / 60.0);
        }

        // Acréscimo de 20% para vaga coberta
        if (cobertura) {
            valorFinal = valorFinal * 1.20;
        }

        // ===== FORMATAÇÃO DO RECIBO =====
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
                
                """, placa, entrada, saida, horas, minutos, tipoVaga, valorFinal);
    }
}