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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String show() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int qty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean elExists(T obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T getElement(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
