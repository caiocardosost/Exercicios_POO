import java.util.Scanner;
public class EstruturaSeleSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero do dia da semana: ");
        int dia = scanner.nextInt();
        scanner.close();
        String nomeDia;

        switch(dia){
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-Feira";
                break;
            case 3:
                nomeDia = "Terca-Feira";
                break;
            case 4:
                nomeDia = "Quarta-Feira";
                break;
            case 5:
                nomeDia = "Quinta-Feira";
                break;
            case 6:
                nomeDia = "Sexta-Feira";
                break;
            case 7:
                nomeDia = "Sabado";
                break;
            default:
                nomeDia = " um dia invalido";
                break;
        }
        System.out.printf("O dia %d eh %s\n", dia, nomeDia);
    }
}
