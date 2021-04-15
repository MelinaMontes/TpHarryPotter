package app.personajes;
import java.util.ArrayList;
import java.util.List;
import app.IHaceMagia;
import app.artefactos.Artefacto;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;
import app.transportes.Escoba;

public class Wizard extends Personaje implements IHaceMagia {
     private int energiaMagica;
     private Escoba escoba;
     private Poder poderInicial;
     private Artefacto artefacto;
     private List<Hechizo> hechizos = new ArrayList<>(); 

     public boolean magoOscuro(){
         return true;
     }


     @Override
     public int getEnergiaMagica() {
          // TODO Auto-generated method stub
          return 0;
     }


     @Override
     public void setEnergiaMagica() {
          // TODO Auto-generated method stub
          
     }


     @Override
     public Poder getPoderInicial() {
          // TODO Auto-generated method stub
          return null;
     }


     @Override
     public void setPoder() {
          // TODO Auto-generated method stub
          
     }


     @Override
     public Artefacto getArtefacto() {
          // TODO Auto-generated method stub
          return null;
     }


     @Override
     public void aprender() {
          // TODO Auto-generated method stub
          
     }


     @Override
     public void atacar() {
          // TODO Auto-generated method stub
          
     }
}
