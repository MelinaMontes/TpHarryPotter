package app.poderes.hechizos;
import java.util.List;
import app.poderes.*;
import java.util.ArrayList;


public class HechizoCuracion extends Hechizo {
    
    public HechizoCuracion(int nivelDanio, int nivelCuracion) {
        super(nivelDanio, nivelCuracion);
        //TODO Auto-generated constructor stub
    }
    // que cure algo especifico
    private List<Poder> poderesQueCura = new ArrayList();

    public List<Poder> getPoderesQueCura() {
        return this.poderesQueCura;
    }
    public void setPoderesQueCura(List<Poder> poderesQueCura) {
        this.poderesQueCura = poderesQueCura;
    }
}
