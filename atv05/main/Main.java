package main;

public class Main {

    public static void testeSegReta(Ponto[] p){
        SegmentoReta s1 = new SegmentoReta(p[0], p[1]);
        SegmentoReta s2 = new SegmentoReta(p[3], p[5]);
        SegmentoReta s3 = new SegmentoReta(p[1], p[6]);
        
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

    public static void testeParalelogramo(){
        Ponto[] pontos = new Ponto[4];

        pontos [0] = new Ponto(0.0, 1.0);
        pontos [1] = new Ponto(0.7, 1.0);
        pontos [2] = new Ponto(1.0, 0.0);
        pontos [3] = new Ponto(0.3, 0.0);

        Paralelogramo p = new Paralelogramo(pontos[0], pontos[1], pontos[2], pontos[3]);

        System.out.println((new SegmentoReta(p.getPontos()[0],p.getPontos()[1])).comprimento());
        System.out.println((new SegmentoReta(p.getPontos()[1],p.getPontos()[2])).comprimento());
        System.out.println((new SegmentoReta(p.getPontos()[2],p.getPontos()[3])).comprimento());
        System.out.println((new SegmentoReta(p.getPontos()[3],p.getPontos()[0])).comprimento());
        System.out.println();

        System.out.println(p.altura());
        System.out.println(p.largura());
        System.out.println(p.area());
        System.out.println(p.perimetro());     

    }

    public static void testeRetangulo(){
        Ponto[] pontos = new Ponto[4];

        // pontos [0] = new Ponto(0.0, 1.0);
        // pontos [1] = new Ponto(0.7, 1.0);
        // pontos [2] = new Ponto(1.0, 0.0);
        // pontos [3] = new Ponto(0.3, 0.0);

        pontos [0] = new Ponto(0.0, 0.5);
        pontos [1] = new Ponto(1.0, 0.5);
        pontos [2] = new Ponto(1.0, 0.0);
        pontos [3] = new Ponto(0.0, 0.0);
        
        System.out.println(Retangulo.existe(pontos[0], pontos[1], pontos[2], pontos[3]));
        Retangulo r = new Retangulo (pontos[0], pontos[1], pontos[2], pontos[3]);
        
        

        System.out.println((new SegmentoReta(r.getPontos()[0],r.getPontos()[1])).comprimento());
        System.out.println((new SegmentoReta(r.getPontos()[1],r.getPontos()[2])).comprimento());
        System.out.println((new SegmentoReta(r.getPontos()[2],r.getPontos()[3])).comprimento());
        System.out.println((new SegmentoReta(r.getPontos()[3],r.getPontos()[0])).comprimento());
        System.out.println();

        System.out.println(r.altura());
        System.out.println(r.largura());
        System.out.println(r.area());
        System.out.println(r.perimetro());
        System.out.println(r.quadrado());   
    }

    public static void testeElipse(){
        Ponto p = new Ponto(0.0,0.0);
        Elipse e = new Elipse(p, 0.5, 1.0);
        // pontos [0] = new Ponto(0.0, 1.0);
        // pontos [1] = new Ponto(0.7, 1.0);
        // pontos [2] = new Ponto(1.0, 0.0);
        // pontos [3] = new Ponto(0.3, 0.0);

        System.out.println(e.getSemiEixoMaior());
        System.out.println(e.getSemiEixoMenor());
        System.out.println(e.getCentro());        
        System.out.println();

        System.out.println(e.altura());
        System.out.println(e.largura());
        System.out.println(e.area());
        System.out.println(e.perimetro());
    }

    public static void testeCirculo(){
        Ponto p = new Ponto(0.0,0.0);
        Circulo c = new Circulo (p, 0.5);
        // pontos [0] = new Ponto(0.0, 1.0);
        // pontos [1] = new Ponto(0.7, 1.0);
        // pontos [2] = new Ponto(1.0, 0.0);
        // pontos [3] = new Ponto(0.3, 0.0);

        System.out.println(c.getRaio());
        System.out.println(c.getCentro());
        System.out.println();

        System.out.println(c.altura());
        System.out.println(c.largura());
        System.out.println(c.area());
        System.out.println(c.perimetro());
    }

    public static void testeSemiCirculo(){
        Ponto p = new Ponto(0.0,0.0);
        SemiCirculo semiC = new SemiCirculo (p, 0.5);
        // pontos [0] = new Ponto(0.0, 1.0);
        // pontos [1] = new Ponto(0.7, 1.0);
        // pontos [2] = new Ponto(1.0, 0.0);
        // pontos [3] = new Ponto(0.3, 0.0);

        System.out.println(semiC.getRaio());
        System.out.println(semiC.getCentro());
        System.out.println();

        System.out.println(semiC.altura());
        System.out.println(semiC.largura());
        System.out.println(semiC.area());
        System.out.println(semiC.perimetro());
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
        // testeTrapezio();
        // testeParalelogramo();
        // testeRetangulo();
        // testeElipse();
        // testeCirculo();
        testeSemiCirculo();
        
        
    }
}
