package app;

import java.util.Scanner;
import app.personajes.Elfo;
import app.personajes.Personaje;
import app.JuegoHP;
import app.personajes.Wizard;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    // for color

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) throws Exception {

        // Añadimos una leyenda de bienvenida que se imprime en pantalla
        System.out.println();
        System.out.println();

        System.out.println(ANSI_RED
                + "****     **                                               **********                                                     "
                + ANSI_RESET);
        System.out.println(ANSI_RED
                + "  **     **   ***    ******     ******     ***      ***     **      **    ****   ******** ********  ********  ******     "
                + ANSI_RESET);
        System.out.println(ANSI_RED + "  **     **  ** **    **   ***   **   ***    **    **       **       **  **  **     **       **      **        **   ***  " + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "  ** *** ** **   **   **   **    **   **      **  **        **      **  **    **    **       **      ******    **   **   " + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "  **     ** *******   ** **      ** **          **          ** ****     **    **    **       **      **        ** **     " + ANSI_RESET);
        System.out.println(ANSI_RED + "  **     ** **   **   **   **    **   **       **           **           **  **     **       **      **        **   **   " + ANSI_RESET);
        System.out.println(ANSI_RED + "  **     ** **   **   **    ***  **    ***    **            **            ****      **       **      ********  **     ***" + ANSI_RESET);
        System.out.println(ANSI_RED + "  ***    ***                                                ***                                                          " + ANSI_RESET);

        System.out.println("");
        System.out.println("");

        System.out.println(ANSI_GREEN + "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ *¡¡Preparen  sus  varitas!!*_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_"+ ANSI_RESET);

        System.out.println("");

        JuegoHP juego = new JuegoHP();

        final String avatarElegido = "El avatar elegido es ";

        System.out.println(ANSI_YELLOW + "Jugador 1, seleccione avatar: '1' Harry,  '2' Hermione,'3' Voldemort, '4' Bellatrix, '5' Dobby, '6' Kreacher"+ ANSI_RESET); 
        int avatar1 = Teclado.nextInt();

        Personaje jugador1 = juego.generarWizardYElfo(avatar1);
        System.out.println(avatarElegido + jugador1.getNombre());

        // elije personaje2 sin repetir
        int avatar2;
        Personaje jugador2;

        while (true) {
            System.out.println(ANSI_YELLOW +  "Jugador 2, seleccione avatar: '1' Harry,  '2' Hermione,'3' Voldemort, '4' Bellatrix, '5' Dobby, '6' Kreacher"+ ANSI_RESET); 
            avatar2 = Teclado.nextInt();

            if ((avatar1 != avatar2)) {
                jugador2 = juego.generarWizardYElfo(avatar2);
                System.out.println(avatarElegido + jugador2.getNombre());
                break;
            } else {
                System.out.println(ANSI_YELLOW + "Elija otro personaje..."+ ANSI_RESET);
            }

        }

        System.out.println("");
        System.out.println( ANSI_RED + "Hora de la batalla!"+ ANSI_RESET);
        System.out.println("");
        boolean turnoJugador1 = true;

        if (avatar1 <= 2) {
            System.out.println(ANSI_CYAN + jugador1.getNombre() + " llega en su saeta de fuego" + ANSI_RESET);
            System.out.println("");
        } else if (avatar1 <= 4) {
            System.out.println(
                    ANSI_PURPLE + jugador1.getNombre() + " aparece volando envuelto en humo negro" + ANSI_RESET);
            System.out.println("");
        }

        if (avatar2 <= 2) {
            System.out.println(ANSI_CYAN + jugador2.getNombre() + " llega en su saeta de fuego" + ANSI_RESET);
            System.out.println("");
        } else if (avatar2 <= 4) {
            System.out.println(
                    ANSI_PURPLE + jugador2.getNombre() + " aparece volando envuelto en humo negro" + ANSI_RESET);
            System.out.println("");
        }

        while (jugador1.getSalud() > 0 && jugador2.getSalud() > 0) {
            Personaje atacante;
            Personaje oponente;

            if (turnoJugador1) {
                System.out.println();
                atacante = jugador1;
                oponente = jugador2;
            } else {
                atacante = jugador2;
                oponente = jugador1;
            }

            juego.turnoJugador(atacante, oponente);
            System.out.println(atacante.getNombre() + " ataca a " + oponente.getNombre());
            System.out.println("");
            System.out.println(" A " + oponente.getNombre() + " le queda " + oponente.getSalud() + " de salud!");
            System.out.println("");

            Thread.sleep(1000);
            turnoJugador1 = !turnoJugador1;
        }
        if (jugador1.getSalud() > 0) {
            System.out.println(ANSI_RED + jugador1.getNombre() + " Ha ganado esta batalla!!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + jugador2.getNombre() + " Es el ganador del dia!!" + ANSI_RESET);
        }

        System.out.println(ANSI_YELLOW + "Gracias por Jugar :)");
    }

}
