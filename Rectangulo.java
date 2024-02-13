
public class Rectangulo extends Figura implements Figura_calculable{
    
    public Rectangulo(int base,int altura){
        super(base,altura);
    }
    
    @Override
    public int calcularArea() {
        return super.getBase() * super.getAltura();
    }

    @Override
    public int calcularPerimetro() {
        return (super.getAltura()*2)+(super.getBase()*2);
    }
    
    
    @Override
    public String toString() {
        return "Rectangulo. \n"+super.toString();
    }   
}
