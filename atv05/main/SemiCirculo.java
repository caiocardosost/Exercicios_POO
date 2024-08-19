package main;

public final class SemiCirculo extends FormaGeometrica {
    private final Ponto centro;
    private double raio;

    public SemiCirculo(Ponto centro, double raio){
        this.centro = centro;
        setRaio(raio);
    }

    @Override
    public double altura() {
        return raio;
    }

    @Override
    public double area() {        
        return (Math.PI * Math.pow(raio,2))/2;
    }

    @Override
    public double largura() {
        return 2*altura();
    }

    @Override
    public double perimetro() {
        return (Math.PI*raio) + largura() ;
    }

    private void setRaio(double raio){
        if (raio < 0.0) {
            throw  new IllegalArgumentException(String.format(
                "O raio deve ser positivo: %f", raio));
        }
        this.raio = raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }
}