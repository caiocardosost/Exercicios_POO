public class Compares {
    public static void main(String[] args) {
        System.out.println("COMPARANDO DECIMAIS:");
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;
        double erro = 1e-10; // tolerancia
        boolean res = Math.abs(a + b - c) < erro; // comparacao entre dec necessita do err

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a + b == c?: " + res);

        System.out.println("COMPARANDO REFERENCIAS:");
        int[] d = {1, 2, 3};
        int[] e = {1, 2, 3}; 
        int[] f = d;

        System.out.printf("D == E : %b \n", d == e ); // False, n compara conteudo, mas sim referencias)
        System.out.printf("D == F : %b \n", d == f );// true, referencias iguais

    }
}
