package app.personajes;

import app.IEsMagico;

public class Criatura extends Personaje implements IEsMagico {
    public String nombre;

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

