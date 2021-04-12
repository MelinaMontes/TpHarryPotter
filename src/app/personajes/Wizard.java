package app.personajes;
import app.IHaceMagia;
import app.Poder;
import app.artefactos.Artefacto;

public class Wizard extends Personaje implements IHaceMagia {
     public int energiaMagica;
     public Escoba escoba;
     public Poder poderInicial;
     public Artefacto artefacto;
     public List<Hechizo> hechizos = new ArrayList<>(); 


     public boolean magoOscuro(){
         
     
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
