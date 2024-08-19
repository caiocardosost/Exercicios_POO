package main;

public class Paralelogramo extends Trapezio {
    
    public Paralelogramo(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        super(p1,p2,p3,p4);        
    }

    @Override
    public double altura() {
        double a = getP3().getCoordX() - getP2().getCoordX();
        return Math.sqrt(Math.pow(s2.comprimento(),2) - Math.pow(a,2));        
    }

    @Override
    public double area() {        
        return altura() * s3.comprimento();
    }

    @Override
    public double largura() {
        double b = getP4().getCoordX()-getP1().getCoordX();
        return b + s3.comprimento();
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta s1 = new SegmentoReta(p1, p2); 
        SegmentoReta s2 = new SegmentoReta(p2, p3); 
        SegmentoReta s3 = new SegmentoReta(p3, p4);
        SegmentoReta s4 = new SegmentoReta(p4, p1);

        if (s1.paralelo(s3) && s2.paralelo(s4)){
            return true;
        }
        return false;        
    }
}
