import java.util.Scanner;
public class Recursao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Digite um numero");
        int valor = scanner.nextInt();
        int res = fat(valor);
        System.err.println("O Fatorial de " + valor + " eh " + res);
        scanner.close();
        
    }
    public static int fat(int a){
        if (a <= 1){
            return 1;
        }

        return a * fat(a-1);
    }
}
