package app;
import java.util.*;
import app.personajes.*;
import app.poderes.*;
import app.poderes.Poder;
import app.poderes.hechizos.*;

public class JuegoHP {

    public void inicializarJuego() {

        public List<Personaje> personajes = new ArrayList<>();

    Wizard bellatrix = new Wizard();
    bellatrix.setNombre("Bellatrix");
    bellatrix.setSalud(100);
    bellatrix.setEdad(90);


    public List<Hechizo> hechizosPersonaje = new ArrayList<>();
    // hechizos base(wingardium,sectumsempra,vulnerasanentur,cavelnimicum)
    // y 'add' los que aprenda(crear metodo)

    public List<Hechizo> hechizosAprender = new ArrayList<>();
    // para mostrar/imprimir

    public void inicializarHechizos() {
        // instanciar variables dentro de un metodo

        SectumSempra ss = new SectumSempra(35, 40);
        ss.setNombre("Sectum Sempra");
        ss.setDescripcion("Potente Hechizo de Ataque");
        ss.setEnergiaMagicaMinima(40);
        hechizosPersonaje.add(ss);

        Cavelnimicum cavel = new Cavelnimicum(30, 10);
        cavel.setNivelCuracion(35);
        cavel.setNombre("Cavelnimicum");
        cavel.setDescripcion("Potente Hechizo de Curacion");
        hechizosPersonaje.add(cavel);

        VulneraSanentur vulnera = new VulneraSanentur(35, 0);
        vulnera.setNivelCuracion(45);
        vulnera.setNombre("Vulnera Sanentur");
        vulnera.setDescripcion("Hechizo de Curacion");
        hechizosPersonaje.add(vulnera);

        WingardiumLeviosa wing = new WingardiumLeviosa(10, 0);
        wing.setNombre("Wingardium Leviosa");
        wing.setDescripcion("Hechizo de ocio para elevar objetos");
        hechizosPersonaje.add(wing);

        Crucio crucio = new Crucio(45, 60);
        crucio.setNombre("Crucio");
        crucio.setDescripcion("Hechizo Oscuro de Ataque");
        crucio.setEnergiaMagicaMinima(50);
        crucio.setEsOscuro(true);
        hechizosAprender.add(crucio);

        AvadaKedavra avada = new AvadaKedavra(60, 100);
        avada.setNombre("Avada Kedavra");
        avada.setDescripcion("Hechizo Oscuro mortal");
        avada.setEnergiaMagicaMinima(65);
        avada.setEsOscuro(true);
        hechizosAprender.add(avada);

        Expelliarmus exp = new Expelliarmus(30, 10);
        exp.setNombre("Expelliarmus");
        exp.setDescripcion("Hechizo de Ataque que permite anular el artefacto del enemigo");
        exp.setEnergiaMagicaMinima(35);
        hechizoAprender.add(exp);

        ExpectoPatronum patronum = new ExpectoPatronum(35, 15);
        patronum.setNivelCuracion(45);
        patronum.setNombre("Expecto Patronum");
        patronum.setDescripcion("Gran Hechizo de Defensa");
        hechizosAprender.add(patronum);

        BrackiumEmendo brack = new BrackiumEmendo(35, 0);
        brack.setNivelCuracion(55);
        brack.setNombre("Brackium Emendo");
        brack.setDescripcion("Poderoso Hechizho de Curacion");
        hechizosAprender.add(brack);

        AccioArtefacto accio = new AccioArtefacto(30, 0);
        accio.setNombre("Accio Artefacto");
        accio.setDescripcion("Hechizo que permite adquirir un artefacto");
        hechizosAprender.add(accio);
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


