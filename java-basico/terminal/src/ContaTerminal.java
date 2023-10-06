import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        ContaBanco banco = new ContaBanco();

        System.out.println("Por favor, digite o número da Conta !");
        banco.numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        banco.agencia = sc.next();

        System.out.println("Por favor, digite o seu Nome !");
        banco.nomeCliente = sc.next();

        System.out.println("Por favor, digite o número o Saldo !");
        banco.saldo = sc.nextDouble();

        System.out.println("Olá " + banco.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + banco.agencia + ", conta " + banco.numero + " e seu saldo " + banco.saldo
                + " já está disponível para saque!");

    }
}
