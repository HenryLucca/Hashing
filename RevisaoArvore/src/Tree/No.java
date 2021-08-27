package Tree;

public class No<T extends Comparable<T>> {

    private T info;
    private No<T> left;
    private No<T> right;

    No(T info) {
        this.info = info;
    }

    T getInfo() {
        return info;
    }

    void setInfo(T info) {
        this.info = info;
    }

    No<T> getLeft() {
        return left;
    }

    void setLeft(No<T> left) {
        this.left = left;
    }

    No<T> getRight() {
        return right;
    }

    void setRight(No<T> right) {
        this.right = right;
    }

}
