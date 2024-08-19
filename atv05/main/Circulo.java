package main;

public final class Circulo extends Elipse {
    private double raio;

    public Circulo(Ponto centro, double raio){
        super(centro, raio, raio);
        setRaio(raio);
    }
    
    @Override
    public double circunferencia(){
        return 2*Math.PI*raio;
    }

    @Override
    public double area() {        
        return Math.PI * Math.pow(raio,2);
    }

    private void setRaio(double raio){
        if (raio < 0.0) {
            throw  new IllegalArgumentException(String.format(
                "O raio deve ser positivo: %f", raio));
        }
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
}
