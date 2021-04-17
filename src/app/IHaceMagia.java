package app;
import app.artefactos.Artefacto;
import app.poderes.Poder;
import app.poderes.hechizos.*;
import app.personajes.*;

public interface IHaceMagia {
     int getEnergiaMagica();
     void setEnergiaMagica();
     Poder getPoderInicial();
     void setPoder();
     Artefacto getArtefacto();
     void aprender(Hechizo h);
     void atacar(Personaje personaje,Hechizo hechizo);
     void atacar(Personaje personaje,String hechizo);

}
