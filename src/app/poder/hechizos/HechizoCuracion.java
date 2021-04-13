package app.poder.hechizos;
import java.util.List;
import java.util.ArrayList;
import app.poder.*;


public class HechizoCuracion extends Hechizo {
    
    // que cure algo especifico
    private List<Poder> poderesQueCura = new ArrayList();

    public List<Poder> getPoderesQueCura() {
        return this.poderesQueCura;
    }
    public void setPoderesQueCura(List<Poder> poderesQueCura) {
        this.poderesQueCura = poderesQueCura;
    }
}
