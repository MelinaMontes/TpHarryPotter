package app.poderes.hechizos;

public abstract class HechizoAtaque extends Hechizo {

    public HechizoAtaque (String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    private int energiaMagicaMinima;
    public int getEnergiaMagicaMinima() {
        return this.energiaMagicaMinima;
    }
    public void setEnergiaMagicaMinima(int energiaMagicaMinima) {
        this.energiaMagicaMinima = energiaMagicaMinima;
    }

    

}
