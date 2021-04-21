package app.personajes;

public abstract class Personaje {
    
    private String nombre;
    private int salud = 100;
    private int edad;
    private int numeroDePersonaje;

    public Wizard(int numeroDePersonaje){
        switch(numeroDePersonaje) {       
             case 1:
                this.setNombre("Harry");
                this.setSalud(100);
                this.setEdad(17);
                this.setEnergiaMagica();
                this.setArtefacto(varitaMagica); 
                this.setTransporte (escobathis);
                this.aprender(ss);
                this.aprender(exp);
                this.aprender(cavel);
                //this.atacar();
                this.setNumeroDePersonaje(2);
             break;
    
             case 2:
                this.setNombre("Voldemort");
                this.setSalud(100);
                this.setEdad(90);
                this.setEnergiaMagica();
                this.setArtefacto(varitaMagica); 
                this.magoOscuro();
                this.aprender(brack);
                this.aprender(crucio);
                this.aprender(avada);
                //this.atacar();
                this.setNumeroDePersonaje(3);
             break;

             case 3:
                this.setNombre("Hermione");
                this.setSalud(100);
                this.setEdad(17);
                this.setEnergiaMagica();
                this.setArtefacto(varitaMagica);
                this.aprender(cavel);
                this.aprender(wing);
                this.aprender(accio);
                //this.atacar();//no se que va aca
                this.setNumeroDePersonaje(4);
             break;

             case 4:
             this.setNombre("Bellatrix");
             this.setSalud(100);
             this.setEdad(40);
             this.setEnergiaMagica();
             this.setArtefacto(varitaMagica); 
             this.magoOscuro();
             this.aprender(avada);
             this.aprender(brack);
             this.aprender(crucio);
             //this.atacar();
             this.setNumeroDePersonaje(1);
             break;

             case 5:
             this.setNombre("Dobby");
             this.setEnergiaMagica();
             this.setSalud(80);
             this.atacar();
             this.setNumeroDePersonaje(5);
             break;
          
             case 6:
             this.setNombre("Kreacher");
             this.setEnergiaMagica();
             this.setSalud(80);
             this.atacar();
             this.setNumeroDePersonaje(6);
             break;

             default:
             break;

             }
   }

    public Personaje elegirAvatar(Personaje wizard){
        return wizard;
    }

    public boolean estaVivo(){
        if (salud > 0){
            return true;
       }
       return false;
    }

    public String getNombre() {
        return this.nombre;
    } 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    public int getSalud(){
        return this.salud;
    } 
    public void setSalud(int salud) {
        this.salud = salud;
    } 
    public int getEdad(){
        return this.edad;
    } 
    public void setEdad(int edad) {
        this.edad = edad;
    } 
    public void setNumeroDePersonaje(int numeroDePersonaje){
        this.numeroDePersonaje = numeroDePersonaje;
    }

} 


