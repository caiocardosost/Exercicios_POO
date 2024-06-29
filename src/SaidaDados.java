import java.util.Locale;

public class SaidaDados {
    public static void main(String[] args) {
        String nome = "Maria";
        String sobrenome = "Silva";
        int idade = 20;
        double saldo = 2500.10;

        System.out.printf("Nome: %s %s\n", nome, sobrenome);
        System.out.printf("Idade: %d\n", idade);
        System.out.printf(Locale.FRENCH, "Voce tem R$: %.2f na conta\n", saldo);
    }
}
