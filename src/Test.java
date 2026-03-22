import java.util.Scanner;

public class Test {
    public static double lerDouble(Scanner scanner, String mensagem) {
        while (true) {
            System.out.println(mensagem);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("VALOR INVÁLIDO!");
                scanner.nextLine();
            }
        }
    }

    public static int lerInteiros(Scanner scanner, String mensagem) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("ERRO! VALOR INVÁLIDO!");
                scanner.nextLine();
            }
        }
    }
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE OS VALORES NECESSÁRIOS:");
        double value = lerDouble(scanner, "Valor: ");
        double tax = lerDouble(scanner, "Taxa: ");
        int period = lerInteiros(scanner, "Tempo: ");
    }
}
