package app;

public class Elfo extends Criatura implements IEsMagico implements IHaceMagia{
    public int energiaMagica;
    public Artefacto artefacto;
    public List<Hechizo> hechizos = new ArrayList<>(); 
}
