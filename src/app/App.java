package app;
import java.util.Scanner;

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

        System.out.println(ANSI_PURPLE+"****     **                                               **********                                                     "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  **     **   ***    ******     ******     ***      ***     **      **    ****   ******** ********  ********  ******     "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  **     **  ** **    **   ***   **   ***    **    **       **       **  **  **     **       **      **        **   ***  "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  ** *** ** **   **   **   **    **   **      **  **        **      **  **    **    **       **      ******    **   **   "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  **     ** *******   ** **      ** **          **          ** ****     **    **    **       **      **        ** **     "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  **     ** **   **   **   **    **   **       **           **           **  **     **       **      **        **   **   "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  **     ** **   **   **    ***  **    ***    **            **            ****      **       **      ********  **     ***"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  ***    ***                                                ***                                                          "+ANSI_RESET);
       
        System.out.println(ANSI_BLUE+  "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_Preparen  sus  varitas_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-"+ANSI_RESET);

      
    }
}
        