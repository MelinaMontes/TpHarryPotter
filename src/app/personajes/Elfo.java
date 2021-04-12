package app.personajes;
import app.IHaceMagia;
import app.Poder;
import app.artefactos.Artefacto;

public class Elfo extends Criatura  implements IHaceMagia{
    public int energiaMagica;
    public Artefacto artefacto;
    public List<Hechizo> hechizos = new ArrayList<>();
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
