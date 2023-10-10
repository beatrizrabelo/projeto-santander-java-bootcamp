import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        saldoAtual += valorDeposito;
        saldoAtual -= valorRetirada;

        System.out.println("Saldo atualizado na conta: " + saldoAtual);

    }
}
