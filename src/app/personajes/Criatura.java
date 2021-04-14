package app.personajes;

import app.IEsMagico;

public class Criatura extends Personaje implements IEsMagico {
    private String nombre;

    public String getNombre() {
        return this.nombre;
    } 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 

    @Override
    public boolean esInvisibleAMuggles() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean esInvisible() {
        // TODO Auto-generated method stub
        return false;
    }
    
    
}

