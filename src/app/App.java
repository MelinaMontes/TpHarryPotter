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

    public static void main (String[] args) throws Exception{
        
        //Añadimos una leyenda de bienvenida que se imprime en pantalla
        System.out.println();
        System.out.println();
        
        System.out.println(ANSI_RED+"****     **                                               **********                                                     "+ANSI_RESET);
        System.out.println(ANSI_RED+"  **     **   ***    ******     ******     ***      ***     **      **    ****   ******** ********  ********  ******     "+ANSI_RESET);
        System.out.println(ANSI_RED+"  **     **  ** **    **   ***   **   ***    **    **       **       **  **  **     **       **      **        **   ***  "+ANSI_RESET);
        System.out.println(ANSI_YELLOW+"  ** *** ** **   **   **   **    **   **      **  **        **      **  **    **    **       **      ******    **   **   "+ANSI_RESET);
        System.out.println(ANSI_YELLOW+"  **     ** *******   ** **      ** **          **          ** ****     **    **    **       **      **        ** **     "+ANSI_RESET);
        System.out.println(ANSI_RED+"  **     ** **   **   **   **    **   **       **           **           **  **     **       **      **        **   **   "+ANSI_RESET);
        System.out.println(ANSI_RED+"  **     ** **   **   **    ***  **    ***    **            **            ****      **       **      ********  **     ***"+ANSI_RESET);
        System.out.println(ANSI_RED+"  ***    ***                                                ***                                                          "+ANSI_RESET);
       
        System.out.println("");
        System.out.println("");

        System.out.println(ANSI_GREEN+  "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ *¡¡Preparen  sus  varitas!!*_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_"+ANSI_RESET);

        System.out.println("");

        JuegoHP juego = new JuegoHP();

        final String avatarElegido = "El avatar elegido es ";

        System.out.println("Jugador 1, seleccione avatar: '1' Harry,  '2' Hermione,'3' Voldemort, '4' Bellatrix, '5' Dobby, '6' Kreacher"); //aca irian las opciones a elegir, dependiendo de los personajes instanciados
        int avatar1 = Teclado.nextInt();

        Personaje jugador1 = juego.generarWizardYElfo(avatar1);
        System.out.println(avatarElegido + jugador1.getNombre());
 
        //elije personaje2 sin repetir 
        int avatar2;
        Personaje jugador2;
        
        while(true){
            System.out.println("Jugador 2, seleccione avatar: '1' Harry,  '2' Hermione,'3' Voldemort, '4' Bellatrix, '5' Dobby, '6' Kreacher"); //aca irian las opciones a elegir, dependiendo de los personajes instanciados
            avatar2 = Teclado.nextInt();

            if((avatar1 != avatar2)){
                jugador2 = juego.generarWizardYElfo(avatar2);
                System.out.println(avatarElegido + jugador2.getNombre());
                break;
            }
            else {  
                System.out.println("Elija otro personaje...");
            }
            
        }
        
        //Para ver si selecciono bien los personajes
       // System.out.println(jugador1.getNombre() + " " + jugador2.getNombre());
     

       System.out.println(" Hora de la batalla!");
       boolean turnoJugador1 = true; 

       if ( avatar1 <= 2 ){
       System.out.println(ANSI_CYAN + jugador1.getNombre() + " llega en su saeta de fuego" + ANSI_RESET );
    }
       else if ( avatar1 <= 4){
           System.out.println(ANSI_PURPLE + jugador1. getNombre() + " aparece volando envuelto en humo negro" + ANSI_RESET);
       }
       
       if ( avatar2 <= 2 ){
        System.out.println(ANSI_CYAN + jugador2.getNombre() + " llega en su saeta de fuego" + ANSI_RESET );
     }
        else if ( avatar2 <= 4){
            System.out.println(ANSI_PURPLE + jugador2. getNombre() + " aparece volando envuelto en humo negro" + ANSI_RESET);
        }
        

       while (jugador1.getSalud()>0 && jugador2.getSalud()>0){
         Personaje atacante;
         Personaje oponente; 
         
           if (turnoJugador1){    
              atacante=jugador1;
              oponente=jugador2;
            }
           else { 
             atacante=jugador2;
             oponente=jugador1;
            }
            
           

           juego.turnoJugador(atacante, oponente);
           System.out.println( atacante.getNombre() + " ataca a " + oponente.getNombre());
           System.out.println(" A "+ oponente.getNombre() + " le queda "+ oponente.getSalud()+" de salud!" );

           Thread.sleep(1000);
           turnoJugador1 = !turnoJugador1;
        }
        if (jugador1.getSalud() > 0){
         System.out.println(ANSI_RED + jugador1.getNombre() + " Ha ganado esta batalla!!" + ANSI_RESET);
        }
        else{
         System.out.println(ANSI_RED + jugador2.getNombre() + " Es el ganador del dia!!" + ANSI_RESET);
        }

        
    }

      /*  System.out.println(" Hora de la batalla!");
        while (avatar1.getSalud>0 && avatar2.salud>0){
            Personaje atacante;
            Personaje Oponente;

            if (turnoAvatar1){
                atacante=avatar1;
                Oponente=avatar2;
            }
            int max 10;
            int min=0;
            int danio=(int) (math.random()* (max-min)+1)) + min;

            System.out.println(atacante.color + atacante.nombre + "ataca a " + oponente.nombre);
            atacante.atacarA(oponente, danio);
            System.out.println(" A "+oponente.nombre+ "le queda"+ oponente.salud+"de salud!" );

            turnoAvatar1=!turnoAvatar1;

        }
        if (avatar1.salud > 0){
            System.out.println(avatar1.color + avatar1.nombre + " Ha ganado esta batalla!!");
        }
        else{
            System.out.println(avatar2.color + avatar2.nombre + " Es el ganador del dia!!");
        */

     

}


