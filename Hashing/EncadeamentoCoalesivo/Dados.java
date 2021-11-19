package EncadeamentoCoalesivo;

public class Dados {
    private int valor;
    private int proximo;

    public Dados() {
        this.proximo = -2;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getProximo() {
        return proximo;
    }

    public void setProximo(int proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "[proximo=" + proximo + ", valor=" + valor + "]";
    }

    
}
