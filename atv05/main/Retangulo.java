package main;

public final class Retangulo extends Paralelogramo{
    public Retangulo (Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        super (p1, p2, p3, p4);
    }

    public boolean quadrado(){
        double e = 1e-5;
        if (Math.abs(s2.comprimento() - s3.comprimento()) <= e){
            return true;
        }
        return false;
    }
    
    @Override
    public double largura() {
        return s3.comprimento();
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        if(Paralelogramo.existe(p1,p2,p3,p4) 
            && (new SegmentoReta(p2, p3)).coeficienteAngular() == Double.POSITIVE_INFINITY) {
                return true;
        }
        return false;
    }
    
}
