package app;
import java.util.*;
import app.artefactos.*;
import app.personajes.*;
import app.poderes.*;
import app.poderes.hechizos.*;
import app.transportes.*;

public class JuegoHP {
     
    public List<Personaje> personajes = new ArrayList<>();
    public List<Hechizo> hechizosAprender = new ArrayList<>();

    public void inicializarJuego(){

        Poder metamorfosis = new Metamorfosis("Metamorfosis", "Puede cambiar de forma");
        Poder invisibilidad = new Invisibilidad("Invisibilidad", "Nadie puede verlo");
        Poder parseTongue = new ParseTongue("Parsel Tongue", "Puede hablar con Serpientes");
        Poder hechizo = new Hechizo("Hechizo", "Habilidad para hechizar");

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
        varitaMagica.setAmplificadorDeDanio(100);
        varitaMagica.setAmplificadorDeCuracion(50);
        varitaMagica.setPoder(hechizo); //no se bien que va aca, es de tipo poder

        Transporte escobaHarry = new Escoba();
        escobaHarry.setNombre("Saeta de Fuego");
        
        Wizard bellatrix = new Wizard();
        bellatrix.setNombre("Bellatrix");
        bellatrix.setSalud(100);
        bellatrix.setEdad(40);
        bellatrix.setEnergiaMagica();
        bellatrix.setArtefacto(varitaMagica); 
        bellatrix.magoOscuro();
        bellatrix.aprender(avada);
        bellatrix.aprender(brack);
        bellatrix.aprender(crucio);
        bellatrix.atacar();

        Wizard harry = new Wizard();
        harry.setNombre("Harry");
        harry.setSalud(100);
        harry.setEdad(17);
        harry.setEnergiaMagica();
        harry.setArtefacto(varitaMagica); 
        harry.setTransporte (escobaHarry);
        harry.aprender(ss);
        harry.aprender(exp);
        harry.aprender(cavel);
        harry.atacar();

        Wizard voldemort = new Wizard();
        voldemort.setNombre("Voldemort");
        voldemort.setSalud(100);
        voldemort.setEdad(90);
        voldemort.setEnergiaMagica();
        voldemort.setArtefacto(varitaMagica); 
        voldemort.magoOscuro();
        voldemort.aprender(brack);
        voldemort.aprender(crucio);
        voldemort.aprender(avada);
        voldemort.atacar();

        Wizard hermione = new Wizard();
        hermione.setNombre("Harry");
        hermione.setSalud(100);
        hermione.setEdad(17);
        hermione.setEnergiaMagica();
        hermione.setArtefacto(varitaMagica);
        hermione.aprender(cavel);
        hermione.aprender(wing);
        hermione.aprender(accio);
        hermione.atacar();//no se que va aca

        Elfo dobby = new Elfo();
        dobby.setNombre("Dobby");
        dobby.setEnergiaMagica();
        dobby.setSalud(100);
        dobby.atacar();
        
        Elfo kreacher = new Elfo();
        kreacher.setNombre("Kreacher");
        kreacher.setEnergiaMagica();
        kreacher.setSalud(100);
        kreacher.atacar();


       // public static void agregarPoderes() {
   
            // Hacemos uso del constructor en la clase poder,
            // dandole valor a los atributos nombre y descripcion de PODER
    
            //Poder metamorfosis = new Metamorfosis("Metamorfosis", "Puede cambiar de forma");
            //Poder invisibilidad = new Invisibilidad("Invisibilidad", "Nadie puede verlo");
            //Poder parseTongue = new ParseTongue("Parsel Tongue", "Puede hablar con Serpientes");
            //Poder hechizo = new Hechizo("Hechizo", "Habilidad para hechizar");
    
        }
        
       

    public void empezarJuego() { //esto hace falta si ya inicializamos el juego antes???

    }
}


