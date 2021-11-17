public class HashingDivisao {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int pos;

        pos = h(5, vetor.length);
        vetor[pos] = 5;
        System.out.println("Posicao: " + pos+ " Valor: " + vetor[pos]);

        pos = h(30, vetor.length);
        vetor[pos] = 30;
        System.out.println("Posicao: " + pos+ " Valor: " + vetor[pos]);

        pos = h(15, vetor.length);
        vetor[pos] = 15;
        System.out.println("Posicao: " + pos+ " Valor: " + vetor[pos]);

        pos = h(20, vetor.length);
        vetor[pos] = 20;
        System.out.println("Posicao: " + pos+ " Valor: " + vetor[pos]);

        pos = h(95, vetor.length);
        vetor[pos] = 95;
        System.out.println("Posicao: " + pos+ " Valor: " + vetor[pos]);

        pos = h(10, vetor.length);
        vetor[pos] = 10;
        System.out.println("Posicao: " + pos+ " Valor: " + vetor[pos]);
        

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