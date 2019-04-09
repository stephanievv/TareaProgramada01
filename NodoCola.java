/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaprioridad;

/**
 *
 * @author stefv
 * @param <X>
 */
public class NodoCola<X> {
    private X element;
    private NodoCola<X> nextNode;

    public X getElement() {
        return element;
    }

    public void setElement(X element) {
        this.element = element;
    }

    public NodoCola<X> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodoCola<X> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "element=" + element + "\n";
    }

    public NodoCola(X element) {
        this.element = element;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
