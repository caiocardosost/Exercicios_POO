public class Algoritmo_mdc {
    
    public static int max (int a, int b){
        int max;
        max = (a>=b)? a:b;
        
        return max;
    }

    public static int min (int a, int b){
        int min;
        min = (a<=b)? a:b;
        
        return min;
    }

    public static int minimoMultiplo(int a, int b){
        int mmc;

        mmc = (a*b)/(maxDivisor(a,b));
        return mmc;
    }

    public static int maxDivisor(int a, int b){
        int dividendo = max(a,b);
        int divisor = min(a,b);
        int resto = dividendo%divisor;
        int res = divisor;
           
        while(resto !=0){
            dividendo = divisor;
            divisor = resto;
            resto = dividendo%divisor;
            res = divisor;   
        }
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println("mdc 11 e 3 eh: " + maxDivisor(33,6));
        // int a = -10;
        // a = -a;
        // System.out.println(a);
    }
}
