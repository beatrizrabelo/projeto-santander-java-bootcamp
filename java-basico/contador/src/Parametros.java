import java.util.Scanner;

public class Parametros {
    protected int parametroUm, parametroDois, contagem;

    Scanner sc = new Scanner(System.in);

    public Parametros() throws ParametrosInvalidosException {

        solicitarParametros();
        contarParametros(parametroUm, parametroDois);

    }

    void solicitarParametros() {

        System.out.println("Digite o primeiro parametro: ");
        parametroUm = sc.nextInt();

        System.out.println("Digite o segundo parametro: ");
        parametroDois = sc.nextInt();

    }

    void contarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {

            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");

        }

        contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
