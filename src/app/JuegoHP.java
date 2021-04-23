package app;
import java.util.ArrayList;
import java.util.List;

import app.artefactos.*;
import app.personajes.*;
import app.poderes.*;
import app.poderes.hechizos.*;
import app.poderes.hechizos.hechizosAtaque.*;
import app.poderes.hechizos.hechizosDefensa.*;
import app.poderes.hechizos.hechizosCuracion.*;
import app.poderes.hechizos.hechizosOcio.*;
import app.transportes.*;

public class JuegoHP {
     
    public List<Personaje> personajes = new ArrayList<>();
    public List<Hechizo> hechizosAprender = new ArrayList<>();
    public List<Transporte> transportes = new ArrayList<>();
    public List<Artefacto> artefactos = new ArrayList<>();


    public void inicializarJuego(){

        Poder metamorfosis = new Metamorfosis("Metamorfosis", "Puede cambiar de forma");
        Poder invisibilidad = new Invisibilidad("Invisibilidad", "Nadie puede verlo");
        Poder parseTongue = new ParseTongue("Parsel Tongue", "Puede hablar con Serpientes");
        

        SectumSempra ss = new SectumSempra("Sectum Sempra", "Potente Hechizo de Ataque");
        ss.energiaYDanio(35, 40);
        ss.setEnergiaMagica(40);
        this.hechizosAprender.add(ss);
         
        Cavelnimicum cavel = new Cavelnimicum("Cavelnimicum", "Potente Hechizo de Curacion");
        cavel.energiaYDanio(30, 10);
        cavel.setNivelCuracion(35);
        this.hechizosAprender.add(cavel);
   
        VulneraSanentur vulnera = new VulneraSanentur("Vulnera Sanentur", "Hechizo de Curacion");
        vulnera.energiaYDanio(35, 0);
        vulnera.setNivelCuracion(45);
        this.hechizosAprender.add(vulnera);
   
        WingardumLeviosa wing = new WingardumLeviosa("Wingardium Leviosa", "Hechizo de ocio para elevar objetos");
        wing.energiaYDanio(10, 0);
        this.hechizosAprender.add(wing);
   
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
   
   
        ExpectoPatronum patronum = new ExpectoPatronum("Expecto Patronum", "Gran Hechizo de Defensa");
        patronum.energiaYDanio(35, 15);
        patronum.setNivelCuracion(45);
        this.hechizosAprender.add(patronum);
   
        BrackiumEmendo brack = new BrackiumEmendo("Brackium Emendo", "Poderoso Hechizo de Curacion");
        brack.energiaYDanio(35, 0);
        brack.setNivelCuracion(55);
        this.hechizosAprender.add(brack);

        Artefacto varitaMagica = new Varita();
        varitaMagica.setNombre("Varita Magica");
        varitaMagica.setAmplificadorDeDanio(1);
        varitaMagica.setAmplificadorDeCuracion(0.5);
        //varitaMagica.setPoder(hechizo); //no se bien que va aca, es de tipo poder
        this.artefactos.add(varitaMagica);

        Transporte escobaHarry = new Escoba();
        escobaHarry.setNombre("Saeta de Fuego");
        this.transportes.add(escobaHarry);
            
       
        
    }


    public Personaje generarWizardYElfo (int numeroDePersonaje){
       this.inicializarJuego();
        Wizard mago = new Wizard();
        Elfo elfo = new Elfo();
        switch(numeroDePersonaje) {       
             case 1:

              mago.setNombre("Harry");
              mago.setSalud(100);
              mago.setEdad(17);
             /* mago.setArtefacto(); 
              mago.setTransporte (escobathis);
              mago.aprender(ss);
              mago.aprender(exp);
              mago.aprender(cavel); */
              mago.hechizos.addAll(hechizosAprender);
                //this.atacar();
              mago.setNumeroDePersonaje(2);
             return mago;
    
             case 2:
             mago.setNombre("Voldemort");
             mago.setSalud(100);
             mago.setEdad(90);
            /* mago.setEnergiaMagica();
             mago.setArtefacto(varitaMagica); 
             mago.magoOscuro();
             mago.aprender(brack);
             mago.aprender(crucio);
             mago.aprender(avada); */
             mago.hechizos.addAll(hechizosAprender);
                //this.atacar();
                mago.setNumeroDePersonaje(3);
                return mago;

             case 3:
             mago.setNombre("Hermione");
             mago.setSalud(100);
             mago.setEdad(17);
            /* mago.setEnergiaMagica();
             mago.setArtefacto(varitaMagica);
             mago.aprender(cavel);
             mago.aprender(wing);
             mago.aprender(accio); */
             mago.hechizos.addAll(hechizosAprender);
                //this.atacar();//no se que va aca
                mago.setNumeroDePersonaje(4);
                return mago;
            

             case 4:
             mago.setNombre("Bellatrix");
             mago.setSalud(100);
             mago.setEdad(40);
             /*mago.setEnergiaMagica();
             mago.setArtefacto(varitaMagica); 
             mago.magoOscuro();
             mago.aprender(avada);
             mago.aprender(brack);
             mago.aprender(crucio); */
             //this.atacar();
             mago.hechizos.addAll(hechizosAprender);
             mago.setNumeroDePersonaje(1);
             return mago;

             case 5:
             elfo.setNombre("Dobby");
            //elfo.setEnergiaMagica();
             elfo.setSalud(80);
             //elfo.atacar(); 
             elfo.hechizos.addAll(hechizosAprender);
             elfo.setNumeroDePersonaje(5);
             return elfo;
          
             case 6:
             elfo.setNombre("Kreacher");
             //elfo.setEnergiaMagica();
             elfo.setSalud(80);
            // elfo.atacar();
             elfo.setNumeroDePersonaje(6);
             elfo.hechizos.addAll(hechizosAprender);
             return elfo;

             default:
             return null;

             }
    
    }

    public Hechizo hechizoRandom(Personaje atacante){

      int max = 40;
      int min = 1;
      if (atacante instanceof Wizard) {
         Wizard wizard = (Wizard) atacante;
         max = wizard.hechizos.size();
         int random = (int) (Math.random() * ((max - min) + 1)) + min;
         return wizard.hechizos.get(random - 1);
      }
      else if (atacante instanceof Elfo) {
         Elfo elfo = (Elfo) atacante;
         max = elfo.hechizos.size();
         int random = (int) (Math.random() * ((max - min) + 1)) + min;
         return elfo.hechizos.get(random - 1);
      }     
      return null;  
  }


    public void turnoJugador(Personaje atacante, Personaje oponente) {
           Hechizo h = this.hechizoRandom(atacante);
           atacante.setSalud(atacante.getSalud() + h.getNivelCuracion());
           if(atacante.getSalud()>= 100) {
               atacante.setSalud(100);
           }
           oponente.setSalud(oponente.getSalud() - h.getNivelDanio());
    }

    /*public Hechizo hechizoRandom(Personaje atacante){

        int max;
        int min = 1;
        if (atacante instanceof Wizard) {
           Wizard wizard = (Wizard) atacante;
           max = wizard.hechizos.size();
           int random = (int) (Math.random() * ((max - min) + 1)) + min;
           return wizard.hechizos.get(random - 1);
        }
        else if (atacante instanceof Elfo) {
           Elfo elfo = (Elfo) atacante;
           max = elfo.hechizos.size();
           int random = (int) (Math.random() * ((max - min) + 1)) + min;
           return elfo.hechizos.get(random - 1);
        }     
        return null; */ 
    }






