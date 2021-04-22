package app.personajes;
import java.util.ArrayList;
import java.util.List;
import app.interfaces.IHaceMagia;
import app.artefactos.Artefacto;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;

public class Elfo extends Criatura  implements IHaceMagia{
    private int energiaMagica = 150;
    private Artefacto artefacto;
    public List<Hechizo> hechizos = new ArrayList<>();

    @Override
    public int getEnergiaMagica() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public void setEnergiaMagica(int energiaMagica) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public Poder getPoderInicial() {
        // TODO Auto-generated method stub
        return null;
    }
   
    @Override
    public Artefacto getArtefacto() {
        // TODO Auto-generated method stub
        return null;
    }

    public List getHechizos() {
        return this.hechizos;
   }
   public void setHechizos(List<Hechizo> hechizos) {
        this.hechizos = hechizos;
   }
    
    @Override
    public void aprender(Hechizo h) {
        this.hechizos.add(h);
        
    }
    @Override
    public void atacar(Personaje personaje, Hechizo hechizo) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void atacar(Personaje personaje, String hechizo) {
        // TODO Auto-generated method stub
        
    }
  
    @Override
    public void setPoderInicial(Poder poderInicial) {
        // TODO Auto-generated method stub
        
    } 
}
