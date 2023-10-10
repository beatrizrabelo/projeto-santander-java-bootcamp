import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();

        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();

        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);

        System.out.printf("Valor final do investimento: R$ %.2f", (valorFinal));

        scanner.close();
    }
}
