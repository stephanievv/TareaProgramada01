/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilapedidos;

/**
 *
 * @author stefv
 * @param <X>
 */
public class NodoPila<X> {
    private X element;
    private NodoPila<X> nextNode;

    public X getElement() {
        return element;
    }

    public void setElement(X element) {
        this.element = element;
    }

    public NodoPila<X> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodoPila<X> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "element=" + element + "\n";
    }

    public NodoPila(X element) {
        this.element = element;
    }
}
