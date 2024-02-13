
public class Cuadrado extends Figura implements Figura_calculable{
    
    public Cuadrado(int base){
        super(base);
    }
    

    @Override
    public int calcularArea() {
        return super.getBase()*super.getBase();
    }

    @Override
    public int calcularPerimetro() {
        return (super.getBase()*2)+(super.getBase()*2);
    }
    
    @Override
    public String toString(){
        return "Cuadrado. \n"+"Lado: "+super.getBase();
    }            
}