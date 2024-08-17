package main;

public class Trapezio extends Quadrilatero {
    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        super (p1, p2, p3, p4);
        if(!existe(p1, p2, p3, p4)){
            throw new IllegalArgumentException("pontos incompativeis");
        }                
    }

    protected SegmentoReta baseMenor(){
         SegmentoReta s1 = new SegmentoReta(pontos.get(0),pontos.get(1));
         SegmentoReta s2 = new SegmentoReta(pontos.get(2), pontos.get(3));

         if (s1.comprimento() <= s2.comprimento()){
            return s1;
         }
         return s2;
    }

    protected SegmentoReta baseMaior(){
        SegmentoReta s1 = new SegmentoReta(pontos.get(0),pontos.get(1));
        SegmentoReta s2 = new SegmentoReta(pontos.get(2), pontos.get(3));

        if (s1.comprimento() > s2.comprimento()){
           return s1;
        }
        return s2;
   }
    
    @Override
    protected double altura() {
        SegmentoReta s1 = new SegmentoReta(pontos.get(0),pontos.get(3));
        SegmentoReta s2 = new SegmentoReta(pontos.get(1), pontos.get(2));
        
        double a = s1.comprimento();
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
        return new SegmentoReta(pontos.get(0), pontos.get(1)).comprimento() 
            +  new SegmentoReta(pontos.get(1), pontos.get(2)).comprimento() 
            +  new SegmentoReta(pontos.get(2), pontos.get(3)).comprimento()
            +  new SegmentoReta(pontos.get(3), pontos.get(0)).comprimento();
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
