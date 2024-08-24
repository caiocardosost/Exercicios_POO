package main;

public final class Circulo extends Elipse {    

    public Circulo(Ponto centro, double raio){
        super(centro, raio, raio);        
    }
    
    @Override
    public double circunferencia(){
        return 2*Math.PI*getRaio();
    }

    @Override
    public double area() {        
        return Math.PI * Math.pow(getRaio(),2);
    }

    public double getRaio() {
        return getSemiEixoA();
    }
}
