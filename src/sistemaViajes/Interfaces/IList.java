/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemaViajes.Interfaces;

/**
 *
 * @author franc
 */
public interface IList<T> {
    void addFirst(T obj);
    String show();
    int qty();
    boolean isEmpty();
    void clear();
    boolean elExists(T obj);
    T getElement (int index);
    void insertOrdered(T obj);
}
