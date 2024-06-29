public class EstruturaSeleIf {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // Estrutura de selecao simples:
        if (a!=b){
            System.out.println("a eh diferente de b");
        }
        // Estrutura de selecao composta:
        if (a == b){
            System.out.println(" a eh igual a b");
        } else {
            System.out.println("a eh diferente de b");
        }
        // Estrutura de selecao encadeada:
        if (a > b){
            System.out.println("a eh maior que b");
        } else if (a < b){
            System.out.println("a eh menor que b");
        } else {
            System.out.println("a eh igual a b");
        }
    }
}
