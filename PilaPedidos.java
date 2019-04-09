/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilapedidos;

/**
 *
 * @author stefv
 */
public class PilaPedidos<X> {
    NodoPila<X> head, tail;
    int size;

    public NodoPila<X> getHead() {
        return head;
    }

    public void setHead(NodoPila<X> head) {
        this.head = head;
    }

    public NodoPila<X> getTail() {
        return tail;
    }

    public void setTail(NodoPila<X> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
    
    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(X element) {
        NodoPila<X> newNode = new NodoPila<>(element);
        if (isEmpty()) {
            head = new NodoPila<>(element);
            tail = head;
            size++;
        } else {
            newNode.setNextNode(head);
            head = newNode;
            size++;
        }
    }

    public X consult(X element) {
        NodoPila<X> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(element)) {
                break;
            } else {
                temp = temp.getNextNode();
            }
        }
        return temp.getElement();
    }

    public void update(X initialElem, X replacedElem) {
        NodoPila<X> temp, tempPrev, tempNext, tempNew;
        temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getNextNode().equals(initialElem)) {
                tempPrev = temp;
                temp = temp.getNextNode();
                tempNext = temp.getNextNode();
                tempNew = new NodoPila<>(replacedElem);
                tempPrev.setNextNode(tempNew);
                tempNew.setNextNode(tempNext);
                temp.setElement(null);
            } else {
                temp = temp.getNextNode();
            }
        }
    }

    public void delete() {
        NodoPila<X> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getNextNode() == tail) {
                tail = temp;
                tail.setNextNode(null);
            } else {
                temp.getNextNode();
            }
        }
        size--;
    }

    @Override
    public String toString() {
        String msg = "";
        NodoPila<X> temp = head;
        for (int i = 0; i < size; i++) {
            msg += temp.toString();
            temp = temp.getNextNode();
        }
        return msg;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PilaPedidos hola= new PilaPedidos<>();
       hola.insert(new Sorteo("Bingo", 145, "As", 8));
       hola.insert(new Sorteo("Loteria", 144, "Sd", 9));
       hola.insert(new Sorteo("Lotto", 143, "Ws", 7));
       
       System.out.println("Historial de Busqueda de Sorteos" + "\n");
       System.out.println(hola.toString() + "\n");
       
       
       System.out.println("Eliminamos la primera busqueda en el historial" + "\n");
       hola.delete();
       System.out.println(hola.toString());
    }
    
}
