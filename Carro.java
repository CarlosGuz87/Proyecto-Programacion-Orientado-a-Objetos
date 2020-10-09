package ProyectoPOO;
//Autor: Carlos Guzmán 
public class Carro extends Vehiculo{
    private int caballos;
    private int cilindraje;
    private String marca;
    private String modelo;
    
    public Carro(int noSerie,int placa,String color,int caballos,int cilindraje,String marca,String modelo){
      super(noSerie, placa, color);
      this.caballos=caballos;
      this.cilindraje=cilindraje;
      this.marca=marca;
      this.modelo=modelo;
      
    }
    
    public int getCaballos(){
        return caballos;
    }
    
    public int getCilindraje(){
        return cilindraje;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String muestraDatos(){
        
        return "No de serie: "+getNoSerie()+"\nPlaca: "+getPlaca()+"\ncolor: "+getColor()+
                "\nCaballos: "+caballos+"\ncilindraje: "+cilindraje+"\nmarca: "+marca+
                "\nmodelo: "+modelo;
    }
}
