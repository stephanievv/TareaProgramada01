/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscarapping;

/**
 *
 * @author stefv
 * @param <T>
 */
public class NodoListaTipo<T> {
    private T element;
    private NodoListaTipo<T> nextNode;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public NodoListaTipo<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodoListaTipo<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "element=" + element + "\n";
    }

    public NodoListaTipo(T element) {
        this.element = element;
    }
}