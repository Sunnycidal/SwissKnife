package swissknife;
import java.util.Scanner;
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {}




        static void imc()
        {
            double peso, altura, imc;
            peso   = sc.nextDouble();
            altura = sc.nextDouble();
            imc    = peso/Math.pow(altura, 2);

        }

        static void ascii()
        {
            //"Arte" gerada por IA

            String[] art = {
                    "███████╗██╗    ██╗██╗███████╗███████╗██╗  ██╗███╗   ██╗██╗███████╗███████╗",
                    "██╔════╝██║    ██║██║██╔════╝██╔════╝██║ ██╔╝████╗  ██║██║██╔════╝██╔════╝",
                    "███████╗██║ █╗ ██║██║███████╗███████╗█████╔╝ ██╔██╗ ██║██║█████╗  █████╗  ",
                    "╚════██║██║███╗██║██║╚════██║╚════██║██╔═██╗ ██║╚██╗██║██║██╔══╝  ██╔══╝  ",
                    "███████║╚███╔███╔╝██║███████║███████║██║  ██╗██║ ╚████║██║██║     ███████╗",
                    "╚══════╝ ╚══╝╚══╝ ╚═╝╚══════╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝╚═╝     ╚══════╝"
            };

            // Configuração das cores do degradê (RGB)
            // Cor inicial (Esquerda) - Ciano
            int rStart = 0;
            int gStart = 255;
            int bStart = 255;

            // Cor final (Direita) - Rosa/Magenta
            int rEnd = 255;
            int gEnd = 0;
            int bEnd = 200;

            // Pegamos o comprimento da primeira linha como base para calcular a transição
            int maxLength = art[0].length();

            for (String line : art) {
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);

                    // Calcula a proporção da posição atual (de 0.0 a 1.0)
                    float ratio = (float) i / Math.max(1, maxLength - 1);

                    // Interpolação linear para encontrar a cor exata daquele caractere
                    int r = (int) (rStart + ratio * (rEnd - rStart));
                    int g = (int) (gStart + ratio * (gEnd - gStart));
                    int b = (int) (bStart + ratio * (bEnd - bStart));

                    // Imprime o código ANSI com a cor calculada e em seguida o caractere
                    System.out.printf("\033[38;2;%d;%d;%dm%c", r, g, b, c);
                }
                // Reseta a cor do terminal ao final de cada linha e pula para a próxima
                System.out.println("\033[0m");
            }

        }

    }

