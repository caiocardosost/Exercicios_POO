package main;

public class Trapezio extends Quadrilatero {
    

    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        super (p1, p2, p3, p4);                       
    }

    public SegmentoReta baseMenor(){
         if (s1.comprimento() <= s3.comprimento()){
            return s1;
         }
         return s3;
    }

    public SegmentoReta baseMaior(){
        if (s1.comprimento() > s3.comprimento()){
           return s1;
        }
        return s3;
   }
    
    @Override
    public double altura() {
        
        double a = s4.comprimento();
        double b = s2.comprimento();
        double c = baseMaior().comprimento() - baseMenor().comprimento(); 
        double p = (a + b + c)/2;
        double areaP = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        return (2*areaP)/c;
    }

    @Override
    public double area() {
        
        return ((baseMaior().comprimento() + baseMenor().comprimento())*altura())/2;
    }

    @Override
    public double largura() {
        return baseMaior().comprimento();
    }

    @Override
    public double perimetro() {
        return s1.comprimento() + s2.comprimento() + s3.comprimento() + s4.comprimento();
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        SegmentoReta s1 = new SegmentoReta(p1, p2);
        SegmentoReta s2 = new SegmentoReta(p2, p3);
        SegmentoReta s3 = new SegmentoReta(p3, p4);
        SegmentoReta s4 = new SegmentoReta(p4, p1);

        if (s1.paralelo(s3) && !(s2.paralelo(s4))){
            return true;
        }
        return false;
    }
}
