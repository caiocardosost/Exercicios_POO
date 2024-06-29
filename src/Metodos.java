public class Metodos {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int soma = soma(a,b);
        int sub = sub(a,b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + soma);
        System.out.println("a - b = " + sub);
    }
    
    public static int soma (int a, int b){
        return a + b;
    }

    public static int sub (int a, int b){
        return a - b;
    }
}
