package main;

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(0.5, 0.4);
        Ponto p2 = new Ponto(0.0, 1.0);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println((new SegmentoReta(p1, p2)).comprimento());
        System.out.println((new SegmentoReta(p1, p2)).coeficienteAngular());

    }

}
