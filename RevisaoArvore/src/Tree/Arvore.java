
package Tree;

public class Arvore <T extends Comparable<T>>{
    private No<T> raiz;
    
    boolean isEmpty() {
        return raiz == null;
    }
    
    public void inserir(T valor) {
        if (isEmpty()) {
            this.raiz.setInfo(valor);
        } else {
            insert(this.raiz,valor);
        }
    }

    private void insert(No<T> no, T valor) {
        if (valor.compareTo(no.getInfo()) > 0) {
            
        }
    }
}
