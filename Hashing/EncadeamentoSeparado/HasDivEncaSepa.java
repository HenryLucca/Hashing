package EncadeamentoSeparado;
import EncadeamentoSeparado.Lista.LSE;

public class HasDivEncaSepa {
    public static void main(String[] args) {
        LSE[] vetor = new LSE[10];

        encadeamentoSeparado(5, vetor);
        encadeamentoSeparado(30, vetor);
        encadeamentoSeparado(20, vetor);
        encadeamentoSeparado(40, vetor);
        encadeamentoSeparado(10, vetor);
        encadeamentoSeparado(60, vetor);
        encadeamentoSeparado(70, vetor);
        encadeamentoSeparado(80, vetor);
        encadeamentoSeparado(90, vetor);
        encadeamentoSeparado(100, vetor);
        encadeamentoSeparado(55, vetor);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.println("Posicao: " + i);
                vetor[i].exibirInfo();
            }

        }
    }

    

    public static void encadeamentoSeparado(int valor, LSE[] vetor) {
        int pos = h(valor, vetor.length);

        if (vetor[pos] == null) {
            LSE<Integer> novo = new LSE();
            vetor[pos] = novo;
            vetor[pos].inserirInfo(valor);
        } else {
            vetor[pos].inserirInfo(valor);
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