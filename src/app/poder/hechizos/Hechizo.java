package app.poder.hechizos;
import app.poder.Poder;
public class Hechizo extends Poder {
    
    private boolean esOscuro;
    private int nivelDanio;
    private int nivelCuracion;
    private int energiaMagica;

    public Hechizo(int nivelDanio, int nivelCuracion) {
        this.nivelDanio = nivelDanio;
        this.nivelCuracion = nivelCuracion;
    }

    public boolean getEsOscuro() {
        return this.esOscuro;
    }
    public void setEsOscuro(boolean esOscuro) {
        this.esOscuro = esOscuro;
    }

    public int getNivelDanio() {
        return this.nivelDanio;
    }
    public void setNivelDanio(int nivelDanio) {
        this.nivelDanio = nivelDanio;
    }

    public int getNivelCuracion() {
        return this.nivelCuracion; 
    }
    public void setNivelCuracion(int nivelCuracion) {
        this.nivelCuracion = nivelCuracion;
    }

    public int getEnergiaMagica() {
        return this.energiaMagica;
    }
    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

}
