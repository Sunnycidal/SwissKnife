package exercicios.ap1;
public class ChileOS {
    public static void carregar() {


        String reset =      "\u001B[0m";
        String bold =       "\u001B[1m";
        String white =      "\u001B[37m";
        String brightGray = "\u001B[97m";
        String r =          "\u001B[31m";
        String blue =       "\u001B[34m";
        String italic =     "\u001B[3m";

        String l1  = bold + r + "Prof:" + reset + white + "José Roberto Chile Silva" + reset;
        String l2  = bold + r + "OS:" + reset + white + "ChileOS v.38 (LTSC)" + reset;
        String l3  = bold + r + "Kernel:" + reset + white + "Eng_Computacao_Univesp" + reset;
        String l4  = bold + r + "Uptime:" + reset + white + "14y 07m 12d 04h (ENSINANDO)" + reset;
        String l5  = bold + r + "Packages:" + reset + white + "Java, Python, C#, Spring, SQL" + reset;
        String l6  = bold + r + "Shell:" + reset + white + "Quadro Branco" + reset;
        String l7  = bold + r + "Resolution:" + reset + white + "32K (30720×17280)" + reset;
        String l8  = bold + r + "CPU:" + reset + white + "Neuralcore @ 8,6 × 10¹⁰ cores" + reset;
        String l9  = bold + r + "GPU:" + reset + white + "BioRender Neural Unit (RTX)" + reset;
        String l10 = bold + r + "Memory:" + reset + white + "324 GB / 2.5 PB)" + reset;
        String l11 = bold + r + "Local IP:" + reset + white + "sala-k483.predio2.toda.segunda" + reset;

        String blocks = "\u001B[41m   \u001B[43m   \u001B[42m   \u001B[44m   \u001B[45m   \u001B[46m   " + reset;

        System.out.println(blue +   " ____                                                 ____   " + reset);
        System.out.println(blue +   "( __ )" + reset + "                                               " + blue + "( __ ) " + l1);
        System.out.println(blue +   " |  |=================================================|  |  " + l2);
        System.out.println(white +  " |  |                        █▄                       |  |  " + l3);
        System.out.println(white +  " |  |   ▄█████▄   ▄█    █▄       ▄█       ▄██████▄    |  |  " + l4);
        System.out.println(white +  " |  |  ███    █▀  ██    ██   ██▌ ██       ███    █▀   |  |  " + l5);
        System.out.println(r +      " |  |  ██        ▄██▄▄▄▄██▄▄ ██▌ ██      ▄███▄▄▄      |  |  " + l6);
        System.out.println(r +      " |  |  ██       ▀▀██▀▀▀▀██▀  ██▌ ██     ▀▀███▀▀▀      |  |  " + l7);
        System.out.println(r +      " |  |  ███    ██  ██    ██   ██  ██▌   ▄  ███    ██   |  |  " + l8);
        System.out.println(r +      " |  |   █████▀    ██    █▀   █▀  ███▄▄██  █████████   |  |  " + l9);
        System.out.println(r +      " |  |                                                 |  |  " + l10);
        System.out.println(blue +   " |__|=================================================|__|  " + l11);
        System.out.println(blue +   "(____)                                               (____) " + blocks);

        System.out.println("\n" + italic + brightGray + "  \"Muitos buscam o REA como terra prometida, mas esquecem que o deserto");
        System.out.println("   não perdoa os que não plantaram no semestre. No Senac, o REA não é");
        System.out.println("   um portal de saída, é o espelho que revela o código que você não escreveu.\"" + reset);
        System.out.println(white + "                                         — Silva, J. R. C." + reset);



    }

    public static void main(String[] args) {carregar();}
    //[Console]::OutputEncoding = [System.Text.Encoding]::UTF8

}