package EncadeamentoCoalesivo;

public class HasDivEncaCoa {
    public static void main(String[] args) {
        int porao = 10;
        int pos;
        Dados[] vetor = new Dados[5 + porao];

        for (int i = 0; i < vetor.length; i++) { // inicializa cada posicao do vetor com a chave = -2.
            vetor[i] = new Dados();
        }

        pos = h(5, (vetor.length - porao));
        encadeamentoCoalesivo(5, vetor, pos);

        pos = h(10, (vetor.length - porao));
        encadeamentoCoalesivo(10, vetor, pos);

        pos = h(15, (vetor.length - porao));
        encadeamentoCoalesivo(15, vetor, pos);

         pos = h(20, (vetor.length - porao));
         encadeamentoCoalesivo(20, vetor, pos);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

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
                    vetor[posAtual].setProximo(i);
                    break;
                } else if (vetor[i].getProximo() == -1) {
                    vetor[i - 1].setValor(valor);
                    vetor[i - 1].setProximo(-1);
                    vetor[posAtual].setProximo(i - 1);
                    break;
                } else {
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
