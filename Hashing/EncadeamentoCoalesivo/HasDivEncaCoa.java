package EncadeamentoCoalesivo;

public class HasDivEncaCoa {
    public static void main(String[] args) {
        int porao = 5;
        Dados[] vetor = new Dados[10 + porao];
    }

    public static void encadeamentoCoalesivo(int valor, Dados[] vetor, int porao) {
        int pos = h(valor, (vetor.length - porao));

        if (vetor[pos] == null) {
            Dados novo = new Dados(valor);
            vetor[pos] = novo;
            vetor[pos].setProximo(-1);
        } else if (vetor[pos].getProximo() == -1) {

            for (int i = vetor.length - 1; i > 0; i--) {
                if (vetor[i] == null) {
                    vetor[i] = new Dados(valor);
                    vetor[i].setProximo(vetor[pos].getProximo());
                    vetor[pos].setProximo(i);
                    break;
                }
            }
        } else {
            
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
