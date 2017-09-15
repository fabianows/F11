package f11.capitulo10;

public class Quadrado implements AreaCalculavel {
    private int lado;
    
    public Quadrado(int lado){
        this.lado = lado;
    }
    
    @Override
    public double calculaArea(){
     return    this.lado * this.lado;     
    }
}

