package app.personajes;
import app.IHaceMagia;
import app.artefactos.Artefacto;

public class Elfo extends Criatura  implements IHaceMagia{
    public int energiaMagica;
    public Artefacto artefacto;
    public List<Hechizo> hechizos = new ArrayList<>(); 
}
