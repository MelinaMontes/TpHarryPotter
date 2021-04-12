package app.personajes;
import app.IHaceMagia;
import app.artefactos.Artefacto;

public class Wizard extends Personaje implements IHaceMagia {
     public int energiaMagica;
     public Escoba escoba;
     public Poder poderInicial;
     public Artefacto artefacto;
     public List<Hechizo> hechizos = new ArrayList<>(); 


     public boolean magoOscuro(){
         
     
     }
}
