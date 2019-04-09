/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaprioridad;

/**
 *
 * @author stefv
 */
public class ColaPrioridad<X> {
    NodoCola<X> head, tail;
    int size;

    public  NodoCola<X> getHead() {
        return head;
    }

    public void setHead( NodoCola<X> head) {
        this.head = head;
    }

    public  NodoCola<X> getTail() {
        return tail;
    }

    public void setTail( NodoCola<X> tail) {
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
        if (isEmpty()) {
            head = new  NodoCola<>(element);
            tail = head;
            size++;
        } else {
            tail.setNextNode(new  NodoCola<>(element));
            tail = tail.getNextNode();
            size++;
        }
    }

    public X consult(X element) {
        NodoCola<X> temp = head;
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
        NodoCola<X> temp, tempPrev, tempNext, tempNew;
        temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getNextNode().equals(initialElem)) {
                tempPrev = temp;
                temp = temp.getNextNode();
                tempNext = temp.getNextNode();
                tempNew = new  NodoCola<>(replacedElem);
                tempPrev.setNextNode(tempNew);
                tempNew.setNextNode(tempNext);
                temp.setElement(null);
            } else {
                temp = temp.getNextNode();
            }
        }
    }

    public void delete(X element) {
        NodoCola<X> temp = head;
        head = head.getNextNode();
        temp.setNextNode(null);
        size--;
    }
    
    public X deleteA(){
        if(this.size == 0){
            System.out.println("Queue is empty");
            return null;
        }
        X Temporal = (X) this.head.getNextNode().getElement();
        NodoCola<X> Temporal2 = this.head.getNextNode();
        this.head.setNextNode(Temporal2.getNextNode());
        if (this.tail == Temporal2){
            this.tail = this.head;
        }
        this.size--;
        return Temporal;
    }

    @Override
    public String toString() {
        String msg = "";
        NodoCola<X> temp = head;
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
        ColaPrioridad prueba = new ColaPrioridad<>();
        prueba.insert(7);
        prueba.insert(8);
        prueba.insert(89);
        prueba.insert(78);
        prueba.deleteA();
        
        System.out.println(prueba.toString());
    }
    
}
