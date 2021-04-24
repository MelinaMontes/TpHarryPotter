package app.personajes;
import java.util.*;
import app.*;
import app.artefactos.Artefacto;
import app.poderes.*;
import app.poderes.hechizos.Hechizo;
import app.transportes.Escoba;
import app.interfaces.IHaceMagia;

public class Wizard extends Personaje implements IHaceMagia {
     private int energiaMagica = 150;
     private Escoba escoba;
     private Poder poderInicial;
     private Artefacto artefacto;
     public List<Hechizo> hechizos = new ArrayList<>(); 

     public boolean magoOscuro(){
         return true;
     }

     @Override
     public int getEnergiaMagica() {
          return 0;
     }

     @Override //esto es necesario si ya establecimos arriba que todos los wizard tienen energia magica 150??
     public void setEnergiaMagica(int energiaMagica) {
   
     }

     @Override
     public Poder getPoderInicial() {
          return null;
     }

    

     @Override
     public Artefacto getArtefacto() {
          return null;
     }
     public Artefacto setArtefacto(Artefacto artefacto){//ver si esto esta bien
         return artefacto;
     }


     @Override
     public void aprender(Hechizo h) {
          this.hechizos.add(h);
          
     }


     @Override
     public void atacar(Personaje personaje, Hechizo hechizo) {
               /*if ((this.magoOscuro() == false ) && (hechizo.esOscuro()== true){
                   int nivelDanio = nivelDanio * 2;
               }
           }*/
     }


     @Override
     public void atacar(Personaje personaje, String hechizo) {
          
          
     }

     @Override
     public void setPoderInicial(Poder poderInicial) {
          
     }
}
