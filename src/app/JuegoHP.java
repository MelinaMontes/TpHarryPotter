package app;
import java.util.*;
import app.artefactos.*;
import app.personajes.*;
import app.poderes.*;
import app.poderes.hechizos.HechizoAtaque.*;
import app.poderes.hechizos.HechizoDefensa.*;
import app.poderes.hechizos.HechizoOcio.*;
import app.poderes.hechizos.HechizoCuracion.*;
import app.transportes.*;

public class JuegoHP {
     
    public List<Personaje> personajes = new ArrayList<>();
    public List<Hechizo> hechizosAprender = new ArrayList<>();

    public void inicializarJuego(){

        Poder metamorfosis = new Metamorfosis("Metamorfosis", "Puede cambiar de forma");
        Poder invisibilidad = new Invisibilidad("Invisibilidad", "Nadie puede verlo");
        Poder parseTongue = new ParseTongue("Parsel Tongue", "Puede hablar con Serpientes");
        

        SectumSempra ss = new SectumSempra("Sectum Sempra", "Potente Hechizo de Ataque");
        ss.energiaYDanio(35, 40);
        ss.setEnergiaMagica(40);
         
        Cavelnimicum cavel = new Cavelnimicum("Cavelnimicum", "Potente Hechizo de Curacion");
        cavel.energiaYDanio(30, 10);
        cavel.setNivelCuracion(35);
   
        VulneraSanentur vulnera = new VulneraSanentur("Vulnera Sanentur", "Hechizo de Curacion");
        vulnera.energiaYDanio(35, 0);
        vulnera.setNivelCuracion(45);
   
        WingardumLeviosa wing = new WingardumLeviosa("Wingardium Leviosa", "Hechizo de ocio para elevar objetos");
        wing.energiaYDanio(10, 0);
   
        Crucio crucio = new Crucio("Crucio", "Hechizo Oscuro de Ataque");
        crucio.energiaYDanio(45, 60);
        crucio.setEnergiaMagica(50);
        crucio.setEsOscuro(true);
        this.hechizosAprender.add(crucio);
   
        AvadaKedavra avada = new AvadaKedavra("Avada Kedavra", "Hechizo Oscuro mortal");
        avada.energiaYDanio(60, 100);
        avada.setEnergiaMagica(65);
        avada.setEsOscuro(true);
        this.hechizosAprender.add(avada);
   
        Expelliarmus exp = new Expelliarmus("Expelliarmus", "Hechizo de Ataque que permite anular el artefacto del enemigo");
        exp.energiaYDanio(30, 10);
        exp.setEnergiaMagica(35);
        this.hechizosAprender.add(exp);
   
        ExpectoPatronum patronum = new ExpectoPatronum("Expecto Patronum", "Gran Hechizo de Defensa");
        patronum.energiaYDanio(35, 15);
        patronum.setNivelCuracion(45);
        this.hechizosAprender.add(patronum);
   
        BrackiumEmendo brack = new BrackiumEmendo("Brackium Emendo", "Poderoso Hechizo de Curacion");
        brack.energiaYDanio(35, 0);
        brack.setNivelCuracion(55);
        this.hechizosAprender.add(brack);
   
        AccioArtefacto accio = new AccioArtefacto("Accio Artefacto", "Hechizo que permite adquirir un artefacto");
        accio.energiaYDanio(30, 0);
        this.hechizosAprender.add(accio);


        Artefacto varitaMagica = new Varita();
        varitaMagica.setNombre("Varita Magica");
        varitaMagica.setAmplificadorDeDanio(1);
        varitaMagica.setAmplificadorDeCuracion(0.5);
        //varitaMagica.setPoder(hechizo); //no se bien que va aca, es de tipo poder

        Transporte escobaHarry = new Escoba();
        escobaHarry.setNombre("Saeta de Fuego");
        


       // public static void agregarPoderes() {
   
            // Hacemos uso del constructor en la clase poder,
            // dandole valor a los atributos nombre y descripcion de PODER
    
            //Poder metamorfosis = new Metamorfosis("Metamorfosis", "Puede cambiar de forma");
            //Poder invisibilidad = new Invisibilidad("Invisibilidad", "Nadie puede verlo");
            //Poder parseTongue = new ParseTongue("Parsel Tongue", "Puede hablar con Serpientes");
            //Poder hechizo = new Hechizo("Hechizo", "Habilidad para hechizar");
        
            
       
        
    }


    public Personaje generarWizardYElfo (int numeroDePersonaje){
        Wizard mago;
        Elfo elfo;
        switch(numeroDePersonaje) {       
             case 1:
               mago = new Wizard();

              mago.setNombre("Harry");
              mago.setSalud(100);
              mago.setEdad(17);
              mago.setEnergiaMagica();
              mago.setArtefacto(varitaMagica); 
              mago.setTransporte (escobathis);
              mago.aprender(ss);
              mago.aprender(exp);
              mago.aprender(cavel);
                //this.atacar();
                mago.setNumeroDePersonaje(2);
             return mago;
    
             case 2:
                this.setNombre("Voldemort");
                this.setSalud(100);
                this.setEdad(90);
                this.setEnergiaMagica();
                this.setArtefacto(varitaMagica); 
                this.magoOscuro();
                this.aprender(brack);
                this.aprender(crucio);
                this.aprender(avada);
                //this.atacar();
                this.setNumeroDePersonaje(3);
             break;

             case 3:
                this.setNombre("Hermione");
                this.setSalud(100);
                this.setEdad(17);
                this.setEnergiaMagica();
                this.setArtefacto(varitaMagica);
                this.aprender(cavel);
                this.aprender(wing);
                this.aprender(accio);
                //this.atacar();//no se que va aca
                this.setNumeroDePersonaje(4);
             break;

             case 4:
             this.setNombre("Bellatrix");
             this.setSalud(100);
             this.setEdad(40);
             this.setEnergiaMagica();
             this.setArtefacto(varitaMagica); 
             this.magoOscuro();
             this.aprender(avada);
             this.aprender(brack);
             this.aprender(crucio);
             //this.atacar();
             this.setNumeroDePersonaje(1);
             break;

             case 5:
             this.setNombre("Dobby");
             this.setEnergiaMagica();
             this.setSalud(80);
             this.atacar();
             this.setNumeroDePersonaje(5);
             break;
          
             case 6:
             this.setNombre("Kreacher");
             this.setEnergiaMagica();
             this.setSalud(80);
             this.atacar();
             this.setNumeroDePersonaje(6);
             break;

             default:
             break;

             }
   }
/*
    public void comenzarJuego() {

        this.inicializarJuego();

       Personaje avatar1 = new Personaje();
       Personaje avatar2 = new Personaje();

        this.listarPersonajes();
        avatar1 = this.elegirJugador();
        avatar2 = this.elegirJugador();
        System.out.println("\n");
    }

    // Va en comenzarJuego
    public void listarPersonajes(){
        //Listar personajes
        System.out.println("Personajes: ");
        for (Personaje personaje : this.personajes) {
            System.out.println("# " + personaje.getNombre());
        }
        System.out.println("Elegir personajes diferentes");
        System.out.println("\n");
    }

    // Va en comenzarJuego
    public Personaje elegirJugador() {
        System.out.println("Ingrese el nombre del jugador elegido: ");
        String nombre = Teclado.nextLine();
        for (Personaje personaje : this.personajes) {
            if (personaje.getNombre().equals(nombre)){
                return personaje;
            }
        }
        return null;
    }
    */
}


