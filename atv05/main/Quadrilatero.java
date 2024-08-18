package main;

public abstract class Quadrilatero extends Poligono {
    protected final SegmentoReta s1;
    protected final SegmentoReta s2;
    protected final SegmentoReta s3;
    protected final SegmentoReta s4;
    
    public Quadrilatero(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(new Ponto[] {p1,p2,p3,p4});
        s1 = new SegmentoReta(pontos.get(0), pontos.get(1)); 
        s2 = new SegmentoReta(pontos.get(1), pontos.get(2)); 
        s3 = new SegmentoReta(pontos.get(2), pontos.get(3));
        s4 = new SegmentoReta(pontos.get(3), pontos.get(0));        
    }    
}
