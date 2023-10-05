public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("237654");
            System.out.println(cepFormatado);
        } catch (CpfInvalidoException e) {
            System.out.println("O cep não correspondedo ao tamanho correto do cep.");
        }
    }

    static String formatarCep(String cep) throws CpfInvalidoException {
        if (cep.length() != 8) {
            throw new CpfInvalidoException();
        }

        // simulando um cep formatado
        return "23.765-064";
    }
}
