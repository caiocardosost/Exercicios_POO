package main;

public class Trapezio extends Quadrilatero {
    

    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        super (p1, p2, p3, p4);
        if(!existe(p1, p2, p3, p4)){
            throw new IllegalArgumentException("pontos incompativeis");
        }                
    }

    protected SegmentoReta baseMenor(){
         if (s1.comprimento() <= s3.comprimento()){
            return s1;
         }
         return s3;
    }

    protected SegmentoReta baseMaior(){
        if (s1.comprimento() > s3.comprimento()){
           return s1;
        }
        return s3;
   }
    
    @Override
    protected double altura() {
        
        double a = s4.comprimento();
        double b = s2.comprimento();
        double c = baseMaior().comprimento() - baseMenor().comprimento(); 
        double p = (a + b + c)/2;
        double areaP = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        return (2*areaP)/c;
    }

    @Override
    protected double area() {
        
        return ((baseMaior().comprimento() + baseMenor().comprimento())*altura())/2;
    }

    @Override
    protected double largura() {
        return baseMaior().comprimento();
    }

    @Override
    protected double perimetro() {
        return s1.comprimento() + s2.comprimento() + s3.comprimento() + s4.comprimento();
    }

    protected static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        SegmentoReta s1 = new SegmentoReta(p1, p2);
        SegmentoReta s2 = new SegmentoReta(p3, p4);

        if (s1.paralelo(s2)){
            return true;
        }
        return false;
    }
}
