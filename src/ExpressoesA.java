public class ExpressoesA{
    public static void main (String[] args){
        System.out.println("OPERACOES ARITMETICAS:");
        int a = 20;
        int b = 2;
        int c = a + b;
        int d = a - b;
        int e = a / b;
        int f = a % b;
        double g = Math.pow(a,b); // math.pow retorna double! assim g precisa ser double

        System.out.println("a = " + a); // imprim texto "a =" e concatena(+) com valor de a
        System.out.println("b = " + b);        
        System.out.println("a + b = " + c);
        System.out.println("a - b = " + d);
        System.out.println("a / b = " + e);
        System.out.println("a % b = " + f);
        System.out.println("a ^ b = " + g);
        
        System.out.println("OPERACOES DE INCREMENTO:");
        a = 10;
        b = a++;
        c = ++a;
        d = a--;
        e = --a;
        System.out.println("a = " + a);
        System.out.println("b(a++) = " + b);        
        System.out.println("c(++a) = " + c);
        System.out.println("d(a--) " + d);
        System.out.println("e(--a) = " + e);

        System.out.println("PROMOCAO DE TIPOS:");
        a = 10;
        double h = 20.0; // declarando "Double (maiusculo)" o cast nao funciona!
        double i = a + h;
        int j = a + (int)h;

        System.out.println("a = " + a);
        System.out.println("h = " + h);        
        System.out.println("a + h) = " + i);
        System.out.println("a + (int)h = " + j);

    }
}