import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String s1 = "Hello, World";

        System.out.println(s1); // imprimindo a string s1
        System.out.println(s1.charAt(3)); // imprimindo o char na pos 3 de s1

        String s2 = "Hello, " + "World" + " " + 10; // string concatenando

        System.out.println(s2); // imprimindo a string s2

        s1 = s1.toUpperCase(); // convertendo string s1 para caixa alta
        
        System.out.println(s1);
        System.out.println(s1.equals(s2)); // comparando se as strings s1 e s2 sao iguais
        System.out.println(s1.length()); // imprimindo o tamanho da string 1


    }
}
