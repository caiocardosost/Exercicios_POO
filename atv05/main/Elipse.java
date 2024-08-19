package main;

public class Elipse extends FormaGeometrica{
    protected final Ponto centro;
    protected double semiEixoA;
    protected double semiEixoB;
    
    public Elipse(Ponto centro, double semiEixoA, double semiEixoB) {
        this.centro = centro;
        setSemiEixoA(semiEixoA);
        setSemiEixoB(semiEixoB);
    }

    public double getSemiEixoMenor(){
        return (semiEixoA <= semiEixoB)? semiEixoA : semiEixoB;
    }

    public double getSemiEixoMaior(){
        return (semiEixoA > semiEixoB)? semiEixoA : semiEixoB;
    }

    public double circunferencia(){
        return 2*Math.PI*(Math.sqrt(Math.pow(getSemiEixoMaior(), 2)
            + Math.pow(getSemiEixoMenor(), 2)/2));
    }

    @Override
    public double altura() {
        return 2*getSemiEixoMenor();
    }

    @Override
    public double area() {        
        return Math.PI * getSemiEixoMaior() * getSemiEixoMenor();
    }

    @Override
    public double largura() {
        return 2*getSemiEixoMaior();
    }

    @Override
    public double perimetro() {
        return circunferencia();
    }

    public Ponto getCentro() {
        return centro;
    }

    private void setSemiEixoA(double semiEixoA) {
        if (semiEixoA < 0.0) {
            throw  new IllegalArgumentException(String.format(
                "Os valores devem ser positivo: %f", semiEixoA));
        }
        this.semiEixoA = semiEixoA;
    }    
    
    public double getSemiEixoA() {
        return semiEixoA;
    }

    private void setSemiEixoB(double semiEixoB) {
        if (semiEixoB < 0.0) {
            throw  new IllegalArgumentException(String.format(
                "Os valores devem ser positivos: %f", semiEixoB));
        }
        this.semiEixoB = semiEixoB;
    }

    public double getSemiEixoB() {
        return semiEixoB;
    }
}
