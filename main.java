package ProyectoPOO;
//Autor: Carlos Guzmán 
import java.util.Scanner;

public class main {
    
    public static int buscarPlaca(Carro carro[],int buscaPlaca){
       int posicion=0;
       boolean encontrado=false;
       String a;
       for(int i=0;i<carro.length;i++){
           
           if(buscaPlaca==carro[i].getPlaca()){
              posicion=i;
              encontrado=true;
              break;
           }
       }
       
       if(encontrado==false){
           posicion=-1;
       }
        return posicion;
    }
    
    public static int buscarSerie(Moto moto[],int buscaSerie){
       int posicion=0;
       boolean encontrado=false;
       
       for(int i=0;i<moto.length;i++){
           
           if(buscaSerie==moto[i].getNoSerie()){
              posicion=i;
              encontrado=true;
              break;
           }
       }
       
       if(encontrado==false){
           posicion=-1;
       }
        return posicion;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroSerie,caballos,cilindraje,opc,vecCarros,vecMotos,conC=0,conM=0,buscaSerie,pos,posSerie,placa,buscaPlaca;
        boolean correcto=false;
        String color,marca,modelo,tipoMoto,transmision;
        Carro carro[]=null;
        Moto moto[]=null;
        
        
        do{
            System.out.print("Digite el tamaño del vector de carros: ");
            vecCarros=entrada.nextInt();
            
            System.out.print("Digite el tamaño del vector de Motos: ");
            vecMotos=entrada.nextInt();
            
            if((vecCarros>0) && (vecMotos>0)){
                correcto=true;
                carro=new Carro[vecCarros];
                moto=new Moto[vecMotos];
            }else{
                System.out.print("Vuelva A Digitar ");
                System.out.println();
            }
            
        }while(correcto==false);
        
        
        do{
            System.out.println();
            System.out.print("\t.:Menu:."+"\n1.-Altas\n2.-Consultas\n3.-Mostrar Datos\n4.-Salir\n");
            System.out.print("Digite una opcion: ");
            opc=entrada.nextInt();
            switch(opc){
                case 1: do{
                    System.out.println("\t.:Altas.:"+"\n1.-Autos\n2.-Motos\n3.-Salir");
                    System.out.print("\nDigite una opcion: ");
                    opc=entrada.nextInt();
                    
                    switch(opc){
                        
                        case 1: if(conC<vecCarros){
                            for(int i=conC;i<=conC;i++){
                                System.out.print("\t..Ingrese los datos a continuacion del carro.:\n");
                                System.out.print("Numero de serie del carro: ");
                                numeroSerie=entrada.nextInt();
                                entrada.nextLine();
                                System.out.print("Numero de placa: ");
                                placa=entrada.nextInt();
                                entrada.nextLine();
                                System.out.print("Color: ");
                                color=entrada.nextLine();
                                System.out.print("Caballos: ");
                                caballos=entrada.nextInt();
                                System.out.print("Cilindraje: ");
                                cilindraje=entrada.nextInt();
                                entrada.nextLine();
                                System.out.print("Marca: ");
                                marca=entrada.nextLine();
                                System.out.print("Modelo: ");
                                modelo=entrada.nextLine();
                                
                                carro[i]=new Carro(numeroSerie, placa, color, caballos, cilindraje, marca, modelo);
                                
                                conC++;
                                break;
                            }
                        }else{
                            System.out.println("El vector de Carros esta lleno");break;
                        }
                        System.out.println();
                        break;
                        
                        case 2: if(conM<vecMotos){
                            for(int i=conM;i<=conM;i++){
                                System.out.print("\t..Ingrese los datos a continuacion de la moto.:\n");
                                System.out.print("Numero de serie de la moto: ");
                                numeroSerie=entrada.nextInt();
                                entrada.nextLine();
                                System.out.print("Numero de placa: ");
                                placa=entrada.nextInt();
                                entrada.nextLine();
                                System.out.print("Color: ");
                                color=entrada.nextLine();
                                System.out.print("Tipo de moto (Racing,motocross,scooters,ciclomotores): ");
                                tipoMoto=entrada.nextLine();
                                System.out.print("Transmision (estándar, automática ): ");
                                transmision=entrada.nextLine();
                                
                                moto[i]=new Moto(numeroSerie, placa, color, tipoMoto, transmision);
                                conM++;break;
                            }
                                
                            
                        }else{
                            System.out.println("El vector de motos esta lleno");break;
                        }
                        System.out.println();
                        break;
                        
                        case 3:break;
                        
                        default:System.out.println("Verifique opcion");break;
                     
                    }
                    
                }while(opc!=3);break;
                
                case 2: do{
                    
                    System.out.println("\t.:consultas.:"+"\n1.-Buscar carro\n2.-Buscar moto\n3.-Salir\n");
                    System.out.print("Digite una opcion: ");
                    opc=entrada.nextInt();
                    
                    switch(opc){
                        case 1:if(conC>0){
                            do{
                    System.out.println("1.-Buscar por placa\n2.-Salir\n");
                    System.out.print("Digite una opcion: ");
                    opc=entrada.nextInt();
                    
                    switch(opc){    
                        case 1: entrada.nextLine();
                            System.out.print("Ingrese el numero de placa: ");
                        buscaPlaca=entrada.nextInt();
                        
                            buscarPlaca(carro, buscaPlaca);
                            pos=buscarPlaca(carro, buscaPlaca);
                            System.out.println(pos);//borrar
                            
                            if(pos!=-1){
                                System.out.print("Los datos son: "+carro[pos].muestraDatos());
                            }else{
                                System.out.println("Esta carro no esta registrado");
                            }
                            System.out.println();
                        
                        break;
                        case 2: break;
                        
                        default: System.out.println("Opcion Incorrecta");
                    }
                            }while(opc!=2);break;}
                        else{
                            System.out.println("Favor de registrar un auto");
                        }
                            System.out.println();break;
                            
                    case 2: 
                        if(conM>0){
                        do{
                        System.out.println("1.-Buscar por numero de serie\n2.-salir\n");
                        System.out.print("Digite una opcion: ");
                        opc=entrada.nextInt();
                        switch(opc){
                            
                            case 1: System.out.print("Ingrese el numero de serie: ");
                            buscaSerie=entrada.nextInt();
                            
                            buscarSerie(moto, buscaSerie);
                            
                            posSerie=buscarSerie(moto, buscaSerie);
                            
                            if(posSerie!=-1){
                                System.out.print(moto[posSerie].muestraDatos());
                            }else{
                                System.out.println("No esta registrado este numero de serie "+buscaSerie);
                            }
                                System.out.println();break;
                         
                            
                            case 2: break;
                            
                            default: System.out.println("Favor de revisar opciones");break;
                            
                        }
                        
                    }while(opc!=2);}
                        else{
                            System.out.println("Favor de registrar una moto");
                            break;
                        }
                        
                    }
                    
                    
                }while(opc!=3);break;
                
               //entra en el 2
                case 3: do{
                    
                        System.out.println("\t.:Mostras Datos.:"+"\n1.-Carros\n2.-Motos\n3.-Salir\n");
                        System.out.print("Digite una opcion: ");
                        opc=entrada.nextInt();
                        switch(opc){
                            case 1:
                                if(conC>0){
                                    for(int i=0;i<conC;i++){
                                        System.out.println(carro[i].muestraDatos());
                                        System.out.println();
                                    }
                                }else{
                                    System.out.println("No hay datos registrados ");
                                }
                                System.out.println();break;
                                
                            case 2: if(conM>0){
                                for(int i=0;i<conM;i++){
                                        System.out.println(moto[i].muestraDatos());
                                        System.out.println();
                                    }
                                }else{
                                     System.out.println("No hay datos registrados ");
                                }
                             System.out.println();break;   
                            
                            case 3:break;
                            
                            default: System.out.println("Verifique opcion");break;
                        }
                    }while(opc!=3);break;
                
                case 4:break;
                
                default :System.out.println("Verifique opcion");break;
            }
        }while(opc!=4);
        
    }
    
}
