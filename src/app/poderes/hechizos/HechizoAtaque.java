package app.poderes.hechizos;
import java.util.ArrayList;
import java.util.List;
import app.personajes.Personaje;


public class HechizoAtaque extends Hechizo {

    public HechizoAtaque (int nivelDanio, int nivelCuracion) {
        super(nivelDanio, nivelCuracion);
    }

    // un atributo que diga a quien puede atacar 
    private List<Personaje> personajesQueAtaca = new ArrayList<>();

    public List<Personaje> getPersonajesQueAtaca() {
        return this.personajesQueAtaca;
    }
    public void setPersonajesQueAtaca(List<Personaje> personajesQueAtaca) {
        this.personajesQueAtaca = personajesQueAtaca;
    }

}
