import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //criando o scanner

        scanner.useLocale(Locale.FRANCE);// alterando para o padrao com ','

        System.out.print("Inteiro: ");
        int i = scanner.nextInt(); // recebendo inteiro
        System.out.print("Booleano: ");
        Boolean b = scanner.nextBoolean(); // recebendo booleano
        System.out.print("Double: ");
        Double d = scanner.nextDouble(); // recebendo double
        System.out.print("Palavra: ");
        String s = scanner.next(); // recebendo string (neste caso, recebe ate o primeiro espaço ou \n)
        scanner.nextLine(); // consumindo o "\n" apos digitar a palavra
        System.out.print("Linha: ");
        String l = scanner.nextLine(); // recebendo string (recebe ate o primeiro \n)

        System.out.printf("Voce digitou o inteiro: %d\n", i);
        System.out.printf("Voce digitou o Booleano: %b\n", b);
        System.out.printf("Voce digitou o double: %.2f\n", d);
        System.out.printf("Voce digitou a palavra: %s\n", s);
        System.out.printf("Voce digitou a linha: %s\n", l);

        scanner.close(); // fechando o scanner
        

    }
}
