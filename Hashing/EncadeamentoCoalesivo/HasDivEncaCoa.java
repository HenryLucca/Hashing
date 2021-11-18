package EncadeamentoCoalesivo;

public class HasDivEncaCoa {
    public static void main(String[] args) {
        int porao = 5;
        Dados[] vetor = new Dados[10 + porao];

        for (int i = 0; i < vetor.length; i++) { // inicializa cada posicao do vetor com a chave = -2.
            vetor[i] = new Dados();
        }

        int pos = h(5, (vetor.length - porao));
        encadeamentoCoalesivo(5, vetor, pos);

    }

    public static void encadeamentoCoalesivo(int valor, Dados[] vetor, int pos) {

        if (vetor[pos].getProximo() == -2) {
            vetor[pos].setValor(valor);
            vetor[pos].setProximo(-1);
        } else if (vetor[pos].getProximo() == -1) {
                int posAtual = pos;
            for (int i = vetor.length - 1; i > 0; i--) {
                if (vetor[i].getProximo() == -2) {
                    vetor[i].setValor(valor);
                    vetor[i].setProximo(-1);
                    break;
                } else if (vetor[i].getProximo() == -1) {
                    encadeamentoCoalesivo(valor, vetor, vetor[i].getProximo());
                    break;
                }

            }
        } else {
            encadeamentoCoalesivo(valor, vetor, vetor[pos].getProximo());
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
}
