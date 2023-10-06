import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SelecaoDeCandidatos {
    protected double salarioPretendido;
    protected int quantidade = 5;
    protected String[] candidatos = new String[quantidade];
    protected ArrayList<String> candidatosSelecionados = new ArrayList<>();
    protected int quantidadeCandidatoSelecionado = 0;
    double salarioBase = 2000.0;

    Scanner sc = new Scanner(System.in);

    void inscrever() {
        System.out.println("Processo Seletivo!");

        for (int i = 0; i < quantidade; i++) {
            System.out.println(" Informe seu nome: ");
            candidatos[i] = sc.next();

            System.out.print(" Pretensão Salarial:");
            salarioPretendido = valorPretendido();
            System.out.print(salarioPretendido + "\n");

            if (salarioBase > salarioPretendido) {
                System.out.println(" O candidato " + candidatos[i] + " foi selecionado! \n");
                candidatosSelecionados.add(candidatos[i]);
                quantidadeCandidatoSelecionado++;
            } else {
                System.out.println(" O candidato não foi selecionado. \n");
            }
        }

        System.out.println("\n Quantidade de candidatos selecionados foi de: " + quantidadeCandidatoSelecionado + "\n");

        imprimirTodosOsCandidatos();
        ligacaoCandidatos();
    }

    void imprimirTodosOsCandidatos() {
        int indice = 1;

        System.out.println("Lista Total de Candidatos: \n");

        for (String listaCandidatos : candidatos) {
            System.out.println("nº " + indice + " " + listaCandidatos);
            indice++;
        }

        System.out.println("\n");
    }

    void ligacaoCandidatos() {
        System.out.println("Ligando para os candidatos.. \n");

        for (String listaCandidatos : candidatos) {
            entrandoEmContato(candidatos);
        }

    }

    void analisarCandidato(double salarioPretendido) {

        if (salarioBase > salarioPretendido) {
            System.out.println("Aprovado.");

        } else if (salarioBase == salarioPretendido) {
            System.out.println("Iremos entrar em contato com você.");

        } else {
            System.out.println("Aguardando demais candidatos.");
        }

    }

    Double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void entrandoEmContato(String candidatos[]) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println(
                    "Conseguimos contato com " + candidatos + " na " + tentativasRealizadas + "ª tentativa. \n");
        } else {
            System.out.println(
                    "Não conseguimos entrar em contato com " + candidatos + ", numero maximo de tentativa: "
                            + tentativasRealizadas + ". \n");
        }

    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
