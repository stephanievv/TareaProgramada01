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
public class ListaTipos<T> {
    private NodoListaTipo<T> head;
    private NodoListaTipo<T> tail;
    private int size;

    public NodoListaTipo<T> getHead() {
        return head;
    }

    public void setHead(NodoListaTipo<T> head) {
        this.head = head;
    }

    public NodoListaTipo<T> getTail() {
        return tail;
    }

    public void setTail(NodoListaTipo<T> tail) {
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

    public void insert(T element) {
        if (isEmpty()) {
            head = new NodoListaTipo<>(element);
            tail = head;
            size++;
        } else {
            tail.setNextNode(new NodoListaTipo<>(element));
            tail = tail.getNextNode();
            size++;
        }
    }

    public T consult(T element) {
        NodoListaTipo<T> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(element)) {
                break;
            } else {
                temp = temp.getNextNode();
            }
        }
        return temp.getElement();
    }

    public void update(T initialElem, T replacedElem) {
        NodoListaTipo<T> temp, tempPrev, tempNext, tempNew;
        temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getNextNode().equals(initialElem)) {
                tempPrev = temp;
                temp = temp.getNextNode();
                tempNext = temp.getNextNode();
                tempNew = new NodoListaTipo<>(replacedElem);
                tempPrev.setNextNode(tempNew);
                tempNew.setNextNode(tempNext);
                temp.setElement(null);
            } else {
                temp = temp.getNextNode();
            }
        }
    }

    private void rearDelete() {
        NodoListaTipo<T> temp = head;
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

    private void frontDelete() {
        NodoListaTipo<T> temp = head;
        head = head.getNextNode();
        temp.setNextNode(null);
        size--;
    }

    private void deleteUniqueElement(T element) {
        head = null;
        tail = head;
        size--;
    }

    private void deleteOnTowElements(T element) {
        if (head.getElement().equals(element)) {
            frontDelete();
        } else if (tail.getElement().equals(element)) {
            rearDelete();
        }
    }

    private void deleteOnMiddle(T element) {
        NodoListaTipo<T> tempNode, tempPrev, tempNext;
        tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.getNextNode().getElement().equals(element)) {
                tempPrev = tempNode;
                tempNode = tempNode.getNextNode();
                tempNext = tempNode.getNextNode();
                tempPrev.setNextNode(tempNext);
                tempNode.setNextNode(null);
            } else {
                tempNode = tempNode.getNextNode();
            }
        }
        size--;
    }

    public void delete(T element) {
        if (!isEmpty()) {
            if (tail.getElement().equals(element)) {
                rearDelete();
            } else if (head.getElement().equals(element)) {
                frontDelete();
            } else if (size == 1) {
                deleteUniqueElement(element);
            } else if (size == 2) {
                deleteOnTowElements(element);
            } else if (size >= 3) {
                deleteOnMiddle(element);
            }
        }
    }

    @Override
    public String toString() {
        String msg = "";
        NodoListaTipo<T> temp = head;
        for (int i = 0; i < size; i++) {
            msg += temp.toString();
            temp = temp.getNextNode();
        }
        return msg;
    }
}    
