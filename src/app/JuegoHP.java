package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
   public static final String ANSI_RESET = "\u001B[0m";
   public static final String ANSI_GREEN = "\u001B[32m";

   Scanner Teclado = new Scanner(System.in);
   public List<Personaje> personajes = new ArrayList<>();
   public List<Hechizo> hechizosAprender = new ArrayList<>();
   public List<Transporte> transportes = new ArrayList<>();
   public List<Artefacto> artefactos = new ArrayList<>();

   public void inicializarJuego() {

      new Metamorfosis("Metamorfosis", "Puede cambiar de forma");
      new Invisibilidad("Invisibilidad", "Nadie puede verlo");
      new ParseTongue("Parsel Tongue", "Puede hablar con Serpientes");

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
      this.artefactos.add(varitaMagica);

      Transporte escobaHarry = new Escoba();
      escobaHarry.setNombre("Saeta de Fuego");
      this.transportes.add(escobaHarry);

   }

   public Personaje generarWizardYElfo(int numeroDePersonaje) {
      this.inicializarJuego();
      Wizard mago = new Wizard();
      Elfo elfo = new Elfo();
      switch (numeroDePersonaje) {
      case 1:

         mago.setNombre("Harry");
         mago.setSalud(100);
         mago.setEdad(17);

         mago.setNumeroDePersonaje(1);
         return mago;

      case 2:
         mago.setNombre("Hermione");
         mago.setSalud(100);
         mago.setEdad(17);

         mago.setNumeroDePersonaje(2);
         return mago;

      case 3:
         mago.setNombre("Voldemort");
         mago.setSalud(100);
         mago.setEdad(90);

         mago.setNumeroDePersonaje(3);
         mago.magoOscuro();
         return mago;

      case 4:
         mago.setNombre("Bellatrix");
         mago.setSalud(100);
         mago.setEdad(40);

         mago.setNumeroDePersonaje(4);
         mago.magoOscuro();
         return mago;

      case 5:
         elfo.setNombre("Dobby");
         elfo.setSalud(80);

         elfo.setNumeroDePersonaje(5);
         return elfo;

      case 6:
         elfo.setNombre("Kreacher");
         elfo.setSalud(80);
         elfo.setNumeroDePersonaje(6);

         return elfo;

      default:
         return null;

      }

   }

   public void imprimirHechizo() {

      System.out.println(ANSI_GREEN + "Ingrese el hechizo elegido" + ANSI_RESET);
      int contador = 1;

      for (int i = 0; i < hechizosAprender.size() / 2; i++) {
         System.out.println(contador++ + ")" + hechizosAprender.get(i).getNombre());

      }
   }

   public Hechizo getOpcionElegida() {

      int opcion = Teclado.nextInt();
      Hechizo hechizo = hechizosAprender.get(opcion - 1);
      Teclado.nextLine();
      return hechizo;

   }

   public void turnoJugador(Personaje atacante, Personaje oponente) {
      this.imprimirHechizo();
      Hechizo hechizo = this.getOpcionElegida();
      atacante.setSalud(atacante.getSalud() + hechizo.getNivelCuracion());
      if (atacante.getSalud() >= 100) {
         atacante.setSalud(100);
      }
      oponente.setSalud(oponente.getSalud() - hechizo.getNivelDanio());
   }

}
