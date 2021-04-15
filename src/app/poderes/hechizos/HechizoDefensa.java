package app.poderes.hechizos;
import app.poderes.*;
import java.util.*;

public abstract class HechizoDefensa extends Hechizo {

    public HechizoDefensa (int energiaMagica, int nivelDanio) {
        super(energiaMagica, nivelDanio);
    }
    
    private List<Poder> poderesQueDefiende;

    public List<Poder> getPoderesQueDefiende() {
        return this.poderesQueDefiende;
    }
    public void setPoderesQueDefiende(List<Poder> poderesQueDefiende) {
        this.poderesQueDefiende = poderesQueDefiende;
    }
}
