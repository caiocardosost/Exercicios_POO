package main;

public class Main {

    public static void testeSegReta(Ponto[] p){
        SegmentoReta s1 = new SegmentoReta(p[0], p[1]);
        SegmentoReta s2 = new SegmentoReta(p[2], p[3]);
        SegmentoReta s3 = new SegmentoReta(p[4], p[5]);
        
        System.out.println(p[0]);
        System.out.println(p[1]);
        System.out.println(s1.comprimento());
        System.out.println(s1.coeficienteAngular());
        System.out.println(s2.coeficienteAngular());
        System.out.println(s3.coeficienteAngular());
        System.out.println(s1.paralelo(s2));
        System.out.println(s2.paralelo(s3));

    }

    public static void testeTriangulo (Ponto[] p){
        Triangulo t = new Triangulo(p[4], p[5], p[6]);
        for (Ponto pontos : t.getPontos()){
            System.out.println(pontos);
        }
        // System.out.println((new SegmentoReta(t.getPontos()[0],t.getPontos()[1])).comprimento());
        // System.out.println((new SegmentoReta(t.getPontos()[1],t.getPontos()[2])).comprimento());
        // System.out.println((new SegmentoReta(t.getPontos()[0],t.getPontos()[2])).comprimento());
        System.out.println(t.altura());
        System.out.println(t.largura());
        System.out.println(t.area());
        System.out.println(t.perimetro());
    }

    public static void testeTrapezio(){
        Ponto[] pontos = new Ponto[4];

        pontos [0] = new Ponto(0.25, 1.0);
        pontos [1] = new Ponto(0.75, 1.0);
        pontos [2] = new Ponto(1.0, 0.0);
        pontos [3] = new Ponto(0.0, 0.0);

        Trapezio t = new Trapezio(pontos[0], pontos[1], pontos[2], pontos[3]);

        System.out.println((new SegmentoReta(t.getPontos()[0],t.getPontos()[1])).comprimento());
        System.out.println((new SegmentoReta(t.getPontos()[1],t.getPontos()[2])).comprimento());
        System.out.println((new SegmentoReta(t.getPontos()[2],t.getPontos()[3])).comprimento());
        System.out.println((new SegmentoReta(t.getPontos()[3],t.getPontos()[0])).comprimento());
        System.out.println();

        System.out.println(t.altura());
        System.out.println(t.largura());
        System.out.println(t.area());
        System.out.println(t.perimetro());

        

    }
   
    public static void main(String[] args) {
        Ponto[] pontos = new Ponto[7];

        pontos [0] = new Ponto(0.0, 0.3);
        pontos [1] = new Ponto(0.2, 0.7);
        pontos [2] = new Ponto(0.5, 0.5);
        pontos [3] = new Ponto(0.6, 0.7);
        pontos [4] = new Ponto(0.4, 0.8);
        pontos [5] = new Ponto(0.6, 0.4);
        pontos [6] = new Ponto(0.2, 0.4);


        // testeSegReta(pontos);
        // testeTriangulo(pontos);
        testeTrapezio();
        
        
    }
}
