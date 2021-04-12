package poder;
import java.util.ArrayList;
import java.util.List;

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
