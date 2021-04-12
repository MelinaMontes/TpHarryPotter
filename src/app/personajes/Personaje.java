package app.personajes;

public class Personaje {
    
    public String nombre;
    public int salud;
    public int edad;

    public boolean estaVivo(){
        if (salud > 0){
            return true;
       }
       return false;
  
        
    }

} 


