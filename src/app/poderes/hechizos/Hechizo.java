package app.poderes.hechizos;

import app.poderes.Poder;

public abstract class Hechizo extends Poder {
    
    private boolean esOscuro;
    private int nivelDanio;
    private int nivelCuracion = 0;
    private int energiaMagica;
    private int energiaMagicaMinima;

    public Hechizo(int energiaMagica, int nivelDanio) {
        this.energiaMagica = energiaMagica;
        this.nivelDanio = nivelDanio;
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

    public int getEnergiaMagicaMinima() {
        return this.energiaMagica;
    }
    public void setEnergiaMagicaMinima(int energiaMagicaMinima) {
        this.energiaMagicaMinima = energiaMagicaMinima;
    }

}
