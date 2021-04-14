package app.poderes.hechizos;
import java.util.ArrayList;
import java.util.List;
import app.poderes.Poder;


public class HechizoDefensa extends Hechizo {

    public HechizoDefensa(int nivelDanio, int nivelCuracion) {
        super(nivelDanio, nivelCuracion);
        //TODO Auto-generated constructor stub
    }
    // atributo que especifica contra que se puede usar 
    private List<Poder> poderesQueDefiende = new ArrayList();

    public Poder List<Poder>getPoderesQueDefiende() {
        return this.poderesQueDefiende;
    }
    public void setPoderesQueDefiende(List<Poder> poderesQueDefiende) {
        this.poderesQueDefiende = poderesQueDefiende;
    }
}
