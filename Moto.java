package ProyectoPOO;
//Autor: Carlos Guzmán 
public class Moto extends Vehiculo{
  
    private String tipoDeMoto;
    private String transmision;
    
    public Moto(int noSerie,int placa,String color,String tipoDeMoto,String transmision){
        super(noSerie, placa, color);
        this.tipoDeMoto=tipoDeMoto;
        this.transmision=transmision;
    }
    
    public String getTipoDeMoto(){
        return tipoDeMoto;
    }
    
    public String getTransmision(){
        return transmision;
    }
    
    public String muestraDatos(){
        return "No de serie: "+getNoSerie()+"\nPlaca: "+getPlaca()+"\ncolor: "+getColor()+
                "\nTipo de moto: "+tipoDeMoto+"\nTransmision: "+transmision;
    }
    
    
}
