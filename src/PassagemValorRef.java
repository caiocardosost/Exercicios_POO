public class PassagemValorRef {
    public static void main(String[] args) {
        System.out.println("PASSAGEM POR VALOR:");
        int a = 10;
        int b = 20;
        int soma = soma(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("(++a) + (++b) = " + soma);

        System.out.println("PASSAGEM POR REFERENCIA:");
        int[] c = {1,2,3,4,5};
        System.out.println("Array recebido:");
        printArray(c);
        incrementa(c);
        System.out.println("Array após incrementar 1 em cada item:");
        printArray(c); 
    }

    public static int soma (int a, int b){
        a++;
        b++;
        return a + b;
    }

    public static void incrementa (int[] v){
        for (int i = 0; i<v.length; i++){
            v[i]++;
        }
    }

    public static void printArray (int[] v){
        for (int i = 0; i<v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
