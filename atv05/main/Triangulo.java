package main;

public final class Triangulo extends Poligono {
    
   
    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        super(new Ponto[] {p1,p2,p3});        
    }
    
    
    @Override
    protected double altura() {
        return (2*area()/largura());
    }

    @Override
    protected double largura() {
        return (new SegmentoReta(pontos.get(1), pontos.get(2)).comprimento());
    }

    @Override
    protected double area() {
        SegmentoReta AB = new SegmentoReta(pontos.get(0), pontos.get(1));
        SegmentoReta BC = new SegmentoReta(pontos.get(1), pontos.get(2));
        SegmentoReta AC = new SegmentoReta(pontos.get(0), pontos.get(2));

        double a = AB.comprimento();
        double b = BC.comprimento();
        double c = AC.comprimento(); 
        double p = (a + b + c)/2;
        
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
    @Override
    protected double perimetro() {
        return new SegmentoReta(pontos.get(0), pontos.get(1)).comprimento() 
            +  new SegmentoReta(pontos.get(1), pontos.get(2)).comprimento() 
            +  new SegmentoReta(pontos.get(2), pontos.get(0)).comprimento();
    }
}
