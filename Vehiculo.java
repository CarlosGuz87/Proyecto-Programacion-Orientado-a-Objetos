package ProyectoPOO;
//Autor: Carlos Guzmán 
public class Vehiculo {
    
   private int noSerie;
   private int placa;
   private String color;
   
   public Vehiculo(int noSerie,int placa,String color){
    
       this.noSerie=noSerie;
       this.placa=placa;
       this.color=color;
       
   }
   
   public int getNoSerie(){
       return noSerie;
   } 
   
   public int getPlaca(){
       return placa;
   }
   
   public String getColor(){
       return color;
   }
   
}
