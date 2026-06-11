/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaViajes.TADS;

import sistemaViajes.Interfaces.IList;

/**
 *
 * @author franc
 */
public abstract class List<T extends Comparable<T>> implements IList<T> {

    protected Node firstNode;
    protected Node lastNode;
    protected int size;

    @Override
    public void addFirst(T obj) {
        Node newNode = new Node(obj);
        newNode.setNext(firstNode);
        if (firstNode == null) {
            lastNode = newNode;
        }
        firstNode = newNode;
        size++;
    }

    @Override
    public String show() {
        StringBuilder sb = new StringBuilder();
        Node aux = firstNode;
        while (aux != null) {
            sb.append(aux.getValue());
            if (aux.getNext() != null) sb.append(" ");
            aux = aux.getNext();
        }
        return sb.toString();
    }

    @Override
    public int qty() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    @Override
    public boolean elExists(T obj) {
        Node aux = firstNode;
        while (aux != null) {
            if (aux.getValue().equals(obj)) {
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

    @Override
    public T getElement(int index) {
        Node aux = firstNode;
        int i = 0;
        while (aux != null) {
            if (i == index) {
                return aux.getValue();
            }
            i++;
            aux = aux.getNext();
        }
        return null;
    }

    @Override
    public void insertOrdered(T obj) {
        Node newEl = new Node(obj);

        if (firstNode == null) {
            firstNode = newEl;
            lastNode = newEl;
            size++;
            return;
        }

        if (obj.compareTo(firstNode.getValue()) <= 0) {
            newEl.setNext(firstNode);
            firstNode = newEl;
            size++;
            return;
        }

        Node aux = firstNode;
        while (aux.getNext() != null) {
            if (obj.compareTo(aux.getNext().getValue()) <= 0) {
                newEl.setNext(aux.getNext());
                aux.setNext(newEl);
                size++;
                return;
            }
            aux = aux.getNext();
        }

        aux.setNext(newEl);
        lastNode = newEl;
        size++;
    }

    private class Node {

        private T value;
        private Node nextNode = null;

        protected Node(T value) {
            this.value = value;
        }

        protected Node getNext() {
            return nextNode;
        }

        protected void setNext(Node node) {
            this.nextNode = node;
        }

        protected T getValue() {
            return this.value;
        }

        protected void setValue(T value) {
            this.value = value;
        }

    }

}
