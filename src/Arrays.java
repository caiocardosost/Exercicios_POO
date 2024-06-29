public class Arrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4};
        double[] reais = {1.0, 2.0, 3.0, 4.0};

        System.out.println(numeros[1]);
        System.out.println(reais[3]);

        numeros[2] = 20;

        for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
    }
}
