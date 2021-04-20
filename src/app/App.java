package app;
import java.util.Scanner;
import app.personajes.Personaje;
import app.JuegoHP;
import app.personajes.Wizard;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    //for color

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main (String[] args) throws Exception{
        
        //Añadimos una leyenda de bienvenida que se imprime en pantalla
        System.out.println();
        System.out.println();
        
        System.out.println(ANSI_PURPLE+"****     **                                               **********                                                     "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  **     **   ***    ******     ******     ***      ***     **      **    ****   ******** ********  ********  ******     "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  **     **  ** **    **   ***   **   ***    **    **       **       **  **  **     **       **      **        **   ***  "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  ** *** ** **   **   **   **    **   **      **  **        **      **  **    **    **       **      ******    **   **   "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  **     ** *******   ** **      ** **          **          ** ****     **    **    **       **      **        ** **     "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  **     ** **   **   **   **    **   **       **           **           **  **     **       **      **        **   **   "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  **     ** **   **   **    ***  **    ***    **            **            ****      **       **      ********  **     ***"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  ***    ***                                                ***                                                          "+ANSI_RESET);
       
        System.out.println();
        System.out.println();

        System.out.println(ANSI_BLUE+  "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_Preparen  sus  varitas_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-"+ANSI_RESET);

        System.out.println();
        System.out.println();
        
        JuegoHP juego = new juegoHp();

        System.out.println("Jugador 1, seleccione avatar: '1' Harry, '2' Voldemort, '3' Hermione, '4' Bellatrix, '5' Dobby, '6' Kreacher"); //aca irian las opciones a elegir, dependiendo de los personajes instanciados

        int avatar1 = Teclado.nextInt();


        final String avatarElegido = "El avatar elegido es ";

        int avatar1 = Teclado.nextInt();
        switch(avatar1){
            case 1: System.out.println(avatarElegido + "Harry");
            break;
            case 2: System.out.println(avatarElegido + "Voldemort");
            break;
            case 3: System.out.println(avatarElegido + "Hermione");
            break;
            case 4: System.out.println(avatarElegido + "Bellatrix");
            break;
            case 5: System.out.println(avatarElegido + "Dobby");
            break;
            case 6: System.out.println(avatarElegido + "Kreacher");
            break;
            

        System.out.println("Jugador 2, seleccione avatar: '1' Harry, '2' Voldemort, '3' Hermione, '4' Bellatrix, '5' Dobby, '6' Kreacher"); //aca irian las opciones a elegir, dependiendo de los personajes instanciados
        int avatar2 = Teclado.nextInt();
        switch(avatar2){
            case 1: System.out.println(avatarElegido + "Harry");
            break;
            case 2: System.out.println(avatarElegido + "Voldemort");
            break;
            case 3: System.out.println(avatarElegido + "Hermione");
            break;
            case 4: System.out.println(avatarElegido + "Bellatrix");
            break;
            case 5: System.out.println(avatarElegido + "Dobby");
            break;
            case 6: System.out.println(avatarElegido + "Kreacher");
            break;
        }

        if( avatar1 == avatar2){
            System.out.println("Elija otro personaje. Seleccione avatar: '1' Harry, '2' Voldemort, '3' Hermione, '4' Bellatrix, '5' Dobby, '6' Kreacher");
            int avatar2bis = Teclado.nextInt();
            switch(avatar2bis){
                case 1: System.out.println(avatarElegido + "Harry");
                break;
                case 2: System.out.println(avatarElegido + "Voldemort");
                break;
                case 3: System.out.println(avatarElegido + "Hermione");
                break;
                case 4: System.out.println(avatarElegido + "Bellatrix");
                break;
                case 5: System.out.println(avatarElegido + "Dobby");
                break;
                case 6: System.out.println(avatarElegido + "Kreacher");
                break;

        }
        

         
        

    }  
}
}


        