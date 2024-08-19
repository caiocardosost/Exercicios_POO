package main;

public final class Triangulo extends Poligono {
    
   
    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        super(new Ponto[] {p1,p2,p3});        
    }
    
    
    @Override
    public double altura() {
        return (2*area()/largura());
    }

    @Override
    public double largura() {
        return (new SegmentoReta(getP2(), getP3()).comprimento());
    }

    @Override
    public double area() {
        SegmentoReta AB = new SegmentoReta(getP1(), getP2());
        SegmentoReta BC = new SegmentoReta(getP2(), getP3());
        SegmentoReta AC = new SegmentoReta(getP1(), getP3());

        double a = AB.comprimento();
        double b = BC.comprimento();
        double c = AC.comprimento(); 
        double p = (a + b + c)/2;
        
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
    @Override
    public double perimetro() {
        return new SegmentoReta(getP1(), getP2()).comprimento() 
            +  new SegmentoReta(getP2(), getP3()).comprimento() 
            +  new SegmentoReta(getP3(), getP1()).comprimento();
    }
    
    public Ponto getP1(){
        return pontos.get(0);
    }

    public Ponto getP2(){
        return pontos.get(1);
    }

    public Ponto getP3(){
        return pontos.get(2);
    }
}