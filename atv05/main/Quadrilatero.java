package main;

public abstract class Quadrilatero extends Poligono {
    protected final SegmentoReta s1;
    protected final SegmentoReta s2;
    protected final SegmentoReta s3;
    protected final SegmentoReta s4;
    
    public Quadrilatero(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(new Ponto[] {p1,p2,p3,p4});
        s1 = new SegmentoReta(getP1(), getP2()); 
        s2 = new SegmentoReta(getP2(), getP3()); 
        s3 = new SegmentoReta(getP3(), getP4());
        s4 = new SegmentoReta(getP4(), getP1());        
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

    public Ponto getP4(){
        return pontos.get(3);
    }
}