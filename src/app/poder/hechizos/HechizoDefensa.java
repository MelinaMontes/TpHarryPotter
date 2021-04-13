package app.poder.hechizos;
import java.util.List;
import java.util.ArrayList;


public class HechizoDefensa extends Hechizo {

    // atributo que especifica contra que se puede usar 
    private List<Poder> poderesQueDefiende = new ArrayList();

    public PoderList<Poder> getPoderesQueDefiende() {
        return this.poderesQueDefiende;
    }
    public void setPoderesQueDefiende(List<Poder> poderesQueDefiende) {
        this.poderesQueDefiende = poderesQueDefiende;
    }
}
