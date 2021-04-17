package app;
import java.util.*;
import app.personajes.*;
import app.poderes.*;
import app.poderes.Poder;
import app.poderes.hechizos.*;

public class JuegoHP {
     
    public List<Personaje> personajes = new ArrayList<>();
    public List<Hechizo> hechizosAprender = new ArrayList<>();

    public void inicializarJuego() {

        /*
        Creo que tendriamos que instanciar los objetos mas o menos en este orden, 
        por lo que escribi entre ()
        1-Transporte/Poder/Hechizo
        2-Artefacto(tiene un atributo poder, pero creo que es opcional ponerle uno)
        3-Personaje(lleva todo lo anterior)
        muri:D
        */

    Wizard bellatrix = new Wizard();
    bellatrix.setNombre("Bellatrix");
    bellatrix.setSalud(100);
    bellatrix.setEdad(90);

        // Hechizos
        SectumSempra ss = new SectumSempra("Sectum Sempra", "Potente Hechizo de Ataque");
        ss.energiaYDanio(35, 40);
        ss.setEnergiaMagicaMinima(40);
      
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
        crucio.setEnergiaMagicaMinima(50);
        crucio.setEsOscuro(true);
        this.hechizosAprender.add(crucio);

        AvadaKedavra avada = new AvadaKedavra("Avada Kedavra", "Hechizo Oscuro mortal");
        avada.energiaYDanio(60, 100);
        avada.setEnergiaMagicaMinima(65);
        avada.setEsOscuro(true);
        this.hechizosAprender.add(avada);

        Expelliarmus exp = new Expelliarmus("Expelliarmus", "Hechizo de Ataque que permite anular el artefacto del enemigo");
        exp.energiaYDanio(30, 10);
        exp.setEnergiaMagicaMinima(35);
        this.hechizosAprender.add(exp);

        ExpectoPatronum patronum = new ExpectoPatronum("Expecto Patronum", "Gran Hechizo de Defensa");
        patronum.energiaYDanio(35, 15);
        patronum.setNivelCuracion(45);
        this.hechizosAprender.add(patronum);

        BrackiumEmendo brack = new BrackiumEmendo("Brackium Emendo", "Poderoso Hechizho de Curacion");
        brack.energiaYDanio(35, 0);
        brack.setNivelCuracion(55);
        this.hechizosAprender.add(brack);

        AccioArtefacto accio = new AccioArtefacto("Accio Artefacto", "Hechizo que permite adquirir un artefacto");
        accio.energiaYDanio(30, 0);
        this.hechizosAprender.add(accio);
    }

    public static void agregarPoderes() {

        // Hacemos uso del constructor en la clase poder,
        // dandole valor a los atributos nombre y descripcion de PODER

        Poder metamorfosis = new Metamorfosis("Metamorfosis", "Puede cambiar de forma");
        Poder invisibilidad = new Invisibilidad("Invisibilidad", "Nadie puede verlo");
        Poder parseTongue = new ParseTongue("Parsel Tongue", "Puede hablar con Serpientes");
        Poder hechizo = new Hechizo("Hechizo", "Habilidad para hechizar");

    }

   
    

    public void empezarJuego() {

    }
}


