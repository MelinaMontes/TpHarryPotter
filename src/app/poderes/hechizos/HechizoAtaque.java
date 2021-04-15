package app.poderes.hechizos;
import app.personajes.*;
import java.util.*;

public abstract class HechizoAtaque extends Hechizo {

    public HechizoAtaque (int energiaMagica, int nivelDanio) {
        super(energiaMagica, nivelDanio);
    }
 
    private List<Personaje> personajesQueAtaca;

    public List<Personaje> getPersonajesQueAtaca() {
        return this.personajesQueAtaca;
    }
    public void setPersonajesQueAtaca(List<Personaje> personajesQueAtaca) {
        this.personajesQueAtaca = personajesQueAtaca;
    }
    

}
