import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();
        int saldoDisponível = saldoTotal;

        if (saldoDisponível >= valorSaque) {
            saldoDisponível = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoDisponível);

        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }

    }
}
