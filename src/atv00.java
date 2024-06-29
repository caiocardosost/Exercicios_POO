public class atv00 {
    public static double sqrt(double n, double epsilon) {
        if(n < 1){
            return 0.0;
        }
        double x, y, abs;
        boolean res;
        x = n/2;
        do{
            y = (1.0/2)*(x + (n/x));
            abs = (y-x<0) ? -(y-x):(y-x);
            res = abs < epsilon;
            x = y;
        } while(!res);
        return y;
    }

    public static boolean isPerfectNumber(long number) {
        if (number > 1){
            long sum = 1;
            for (long i = 2; i<=(number/2); i++){
                if((number%i) == 0){
                    sum = sum + i;
                }
            }
            if (sum == number){
                return true;
            }
        }
        return false;
    }

    public static String encrypt(String message, int key) {
        char[] m = message.toCharArray();
        int dif, pos, enc;
        for(int i=0; i<message.length(); i++){
            dif = m[i] - 'a';
            pos = (dif+key)%26;
            enc = 'a'+pos;
            m[i] = (char) enc;
        }
        String res = new String(m);

        return res;
    }

    public static String decrypt(String encryptedMessage, int key) {
        return "";
    }
    
    public static void main(String[] args) throws Exception {
        System.out.print("A raiz quadrada de 2 com precisao de 0.001 eh: ");
        System.out.printf("%.6f \n", sqrt(2.0, 0.001));
        System.out.println("O numero 6 "+ (isPerfectNumber(6) ? "eh ":"nao eh ") + "perfeito");
        System.out.println("Caio encriptografado com k = 1 eh: " + encrypt("caio", 1));
        
    }
}
