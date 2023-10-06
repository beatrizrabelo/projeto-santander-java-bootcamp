import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        try {

            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Fluxos não previsto pela aplicação.");

            System.out.println("Digite seu nome: ");
            String nome = sc.next();

            System.out.println("Digite sua idade: ");
            String idade = sc.next();

            System.out.println("Digite seu altura: ");
            Double altura = sc.nextDouble();

            System.out.println(
                    "Olá meu nome é " + nome + ", eu tenho " + idade + " anos ! " + "Minha altura é: " + altura
                            + " cm");
            sc.close();

        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e/ou altura precisam ser númericos.");
        }

    }
}
