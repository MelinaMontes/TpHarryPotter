package app;
import app.artefactos.Artefacto;
import app.poderes.Poder;

public interface IHaceMagia {
     int getEnergiaMagica();
     void setEnergiaMagica();
     Poder getPoderInicial();
     void setPoder();
     Artefacto getArtefacto();
     void aprender(Hechizo);
     void atacar(//no se bien que hay que poner aca);
     void atacar(//ni aca);

}
