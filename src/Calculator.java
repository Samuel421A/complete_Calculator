import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    private int option = 0;
    private int correctPassword = 32959;
    private int password;
    private int counter = 0;
    private int firstNumber;
    private int secondNumber;

    public int getOption() {
        return option;
    }

    public void login() {
        System.out.println("----------------------------------------");
        System.out.println("PARA PROSSEGUIR, VAMOS FAZER O SEU LOGIN");
        System.out.println("----------------------------------------");
        do {
            counter++;
            System.out.println("DIGITE A SUA SENHA PARA ENTRAR: ");
            password = scanner.nextInt();

            if (password != correctPassword) {
                System.out.println("SENHA INCORRETA!");
            }
        } while (password != correctPassword && counter < 3);

        if (password != correctPassword) {
            System.out.println("APP BLOQUEADO POR MOTIVOS DE SEGURANÇA!");
        } else {
            showMenu();
        }
    }

    public void showMenu() {
        System.out.println("----------------------------------");
        System.out.println("BEM-VINDO(A) AO APP DA CALCULADORA");
        System.out.println("----------------------------------");
        System.out.println("[1] SOMA");
        System.out.println("[2] SUBTRAÇÃO");
        System.out.println("[3] MULTIPLICAÇÃO");
        System.out.println("[4] DIVISÃO");
        System.out.println("[5] EXPONENCIAÇÃO");
        System.out.println("[6] RAIZ QUADRADA");
        System.out.println("[7] JUROS COMPOSTOS");
        System.out.println("[8] SAIR");
        System.out.println("----------------------------------");
        System.out.println("ESCOLHA UMA DAS OPÇÕES ACIMA:");
        option = scanner.nextInt();
    }

    public void askNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        firstNumber = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        secondNumber = scanner.nextInt();
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void calculateDivision() {
        if (secondNumber == 0) {
            System.out.println("ERRO! DIVISÃO POR ZERO NÃO EXISTE!");
        } else {
            double divisao = (double) firstNumber /secondNumber;
            System.out.println(firstNumber + " ÷ " + secondNumber + " = " + divisao);
        }
    }
}
