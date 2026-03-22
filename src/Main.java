import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.login();

        do {
            System.out.println("ESCOLHA UMA DAS OPÇÕES ACIMA:");
            calculator.setOption(calculator.getScanner().nextInt());

            switch (calculator.getOption()) {
                case 1:
                    calculator.askNumbers();
                    int soma = calculator.getFirstNumber() + calculator.getSecondNumber();
                    System.out.println(calculator.getFirstNumber() +
                            " + " + calculator.getSecondNumber() + " = " + soma);
                    break;

                case 2:
                    calculator.askNumbers();
                    int subtracao = calculator.getFirstNumber() - calculator.getSecondNumber();
                    System.out.println(calculator.getFirstNumber() +
                            " - " + calculator.getSecondNumber() + " = " + subtracao);
                    break;

                case 3:
                    calculator.askNumbers();
                    int multiplicacao = calculator.getFirstNumber() * calculator.getSecondNumber();
                    System.out.println(calculator.getFirstNumber() +
                            " x " + calculator.getSecondNumber() + " = " + multiplicacao);
                    break;

                case 4:
                    calculator.askNumbers();
                    calculator.calculateDivision();
                    break;

                case 5:
                    System.out.println("O primeiro número digitado é a base e o segundo é o expoente!");
                    calculator.askNumbers();
                    int exponenciacao = (int) Math.pow(calculator.getFirstNumber(), calculator.getSecondNumber());
                    System.out.println(calculator.getFirstNumber() + "^" +
                            calculator.getSecondNumber() + " = " + exponenciacao);
                    break;

                case 6:
                    calculator.askNumbers();
                    double rootSquare1 = Math.sqrt(calculator.getFirstNumber());
                    double rootSquare2 = Math.sqrt(calculator.getSecondNumber());
                    System.out.println("√ = " + rootSquare1);
                    System.out.println("√ = " + rootSquare2);
                    break;

                case 7:
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("DIGITE OS VALORES NECESSÁRIOS:");
                    double value = calculator.lerDouble(scanner, "Valor:");
                    double tax = calculator.lerDouble(scanner, "Taxa: ");
                    int period = calculator.lerInteiros(scanner, "Tempo:");

                    double compoundTax = tax / 100;
                    double montante = value * Math.pow(1 + compoundTax, period);

                    System.out.printf("VALOR COM JUROS: R$ %.2f%n", montante);
                    break;

                case 8:
                    System.out.println("VOCÊ SAIU DO PROGRAMA COM SUCESSO!");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
            }
        } while (calculator.getOption() != 8);
    }
}