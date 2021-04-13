package app.personajes;

public class Personaje {
    
    private String nombre;
    private int salud;
    private int edad;

    public boolean estaVivo(){
        if (salud > 0){
            return true;
       }
       return false;
  
        
    }

} 


