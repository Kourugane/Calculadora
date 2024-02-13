


import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Menu {
    
    private List<Figura_calculable>historial= new ArrayList();
    private final String graficosMenu=" ===================================\n" +
"| CALCULADORA DE AREAS Y PERIMETROS |\n" +
" ===================================\n" +
"|          1.Triangulo	            |\n" +
"\n" +
"|          2.Cuadrado		    |\n" +
"\n" +
"|	   3.Rectangulo		    |\n" +
" -----------------------------------\n" +
"|	   4.hitorial		    |\n" +
"\n" +
"|	   5.salir		    |\n" +
" ===================================";
    
    public void menuPrincipal(){
        int opcion,base,altura,l3,l2;
        Scanner input=new Scanner(System.in);
        Figura_calculable figura;
        do{
            System.out.print(graficosMenu);
            System.out.print("\n=> ");
            opcion=input.nextInt();
            
            switch(opcion){
                case 1:{
                    System.out.print("Base:");
                    base=input.nextInt();
                    System.out.print("Lado2: ");
                    l2=input.nextInt();
                    System.out.print("Lado3: ");
                    l3=input.nextInt();
                    System.out.print("Altura: ");
                    altura=input.nextInt();
                    figura=new Triangulo(base,altura,l2,l3);
                    
                    //mostrando resultado en pantalla
                    
                    System.out.println("---------------------");
                    figura.toString();
                    System.out.println("Area: "+figura.calcularArea());
                    System.out.println("Perimetro: "+figura.calcularPerimetro());
                    System.out.println("---------------------");
                    
                    //agregando al historial
                    historial.add(figura);break;
                }
                case 2:{
                    System.out.print("Base:");
                    base=input.nextInt();
                    figura=new Cuadrado(base);
                    
                    //mostrando resultado en pantalla
                    
                    System.out.println("---------------------");
                    figura.toString();
                    System.out.println("Area: "+figura.calcularArea());
                    System.out.println("Perimetro: "+figura.calcularPerimetro());
                    System.out.println("---------------------");
                    
                    //agregando al historial
                    historial.add(figura);break;
                }
                case 3:{
                    System.out.print("Base:");
                    base=input.nextInt();
                    System.out.print("Altura: ");
                    altura=input.nextInt();
                    figura=new Rectangulo(base,altura);
                    
                    //mostrando resultado en pantalla
                    
                    System.out.println("---------------------");
                    figura.toString();
                    System.out.println("Area: "+figura.calcularArea());
                    System.out.println("Perimetro: "+figura.calcularPerimetro());
                    System.out.println("---------------------");
                    
                    //agregando al historial
                    historial.add(figura);break;                    
                }
                case 4:{
                    //mostrando historial
                    int contador=1;
                    if(historial==null){
                        System.out.println("HISTORIAL VACIO");
                    }
                    else{
                        System.out.println("\tHistorial");
                        for(Figura_calculable x:historial){
                            System.out.println("--------------");
                            System.out.println("figura "+contador+"\n");
                            System.out.println(x.toString());
                            System.out.println("Area: "+x.calcularArea());
                            System.out.println("Perimetro: "+x.calcularPerimetro());
                            System.out.println("--------------");
                            contador++;
                        }
                    }
                    
                }
            }
            
        }while(opcion!=5);
        
        
    }
            
    
}