public class HasDiviEndeAber {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int[] novoVetor;

        novoVetor = enderecamentoAberto(5, vetor);
        if (novoVetor == null) {
            System.out.println("Nao foi possivel inserir o valor 5");
        } else {
            vetor = novoVetor;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posicao: " + i + " Valor: " + vetor[i]);
        }

    }

    public static int h(int valor, int tam) {
        if (tam % 2 == 0) {
            System.out.println("O tamanho do vetor é par");
            return (valor % (tam + 1)) % tam;
        } else {
            System.out.println("O tamanho do vetor é impar");
            return (valor % tam);
        }
    }

    public static int[] enderecamentoAberto(int valor, int[] vetor) {
        int pos = h(valor, vetor.length);
        if (vetor[pos] == 0) {
            vetor[pos] = valor;
            return vetor;
        } else {
            for (int i = pos; i < vetor.length; i++) {
                if (vetor[i] == 0) {
                    vetor[i] = valor;
                    return vetor;
                }

            }
            return null;
        }
    }
}
