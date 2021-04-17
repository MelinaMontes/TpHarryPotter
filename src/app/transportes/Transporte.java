package app.transportes;

import app.IEsMagico;

public abstract class Transporte implements IEsMagico {

      public String nombreTransporte;

      public Transporte(){

      }

      public Transporte(String nombreTransporte){
            this.nombre = nombreTransporte;
      }

      @Override
      public boolean esInvisible(){
            return false;
      }

      @Override
      public boolean es InvisibleAMuggles(){
            return false;

      }

}  
