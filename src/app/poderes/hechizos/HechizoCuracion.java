package app.poderes.hechizos;
import app.poderes.*;
import java.util.*;

public abstract class HechizoCuracion extends Hechizo {
    
    public HechizoCuracion (int energiaMagica, int nivelDanio) {
        super(energiaMagica, nivelDanio);
    }
    
    private List<Poder> poderesQueCura;

    public List<Poder> getPoderesQueCura() {
        return this.poderesQueCura;
    }
    public void setPoderesQueCura(List<Poder> poderesQueCura) {
        this.poderesQueCura = poderesQueCura;
    }
}
