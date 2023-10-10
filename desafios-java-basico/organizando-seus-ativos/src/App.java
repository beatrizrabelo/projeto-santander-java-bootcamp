import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> ativos = new ArrayList<>();
        int quantidadeAtivos = scanner.nextInt();

        for (int i = 0; i <= quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }

        Collections.sort(ativos);

        for (int i = 0; i <= quantidadeAtivos; i++) {
            System.out.println(ativos.get(i));
        }
    }
}
