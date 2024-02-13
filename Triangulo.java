

public class Triangulo extends Figura implements Figura_calculable{
    
    private int lado2;
    private int lado3;
    
    public Triangulo(int base,int altura,int lado2,int lado3){
        super(base,altura);
        this.lado2=lado2;
        this.lado3=lado3;
    }

    @Override
    public int calcularArea() {
        return ((super.getBase()*super.getAltura())/2);        
    }

    @Override
    public int calcularPerimetro() {
        return super.getBase()+lado2+lado3;
    }
    
    @Override
    public String toString() {
        return "Triangulo. \n"+super.toString()+"\nLado 2: "+this.lado2+"\nLado3: "+this.lado3;
    }
}
