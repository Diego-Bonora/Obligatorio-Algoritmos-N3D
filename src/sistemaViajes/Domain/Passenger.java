/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaViajes.Domain;

import sistemaViajes.Categoria;

/**
 *
 * @author franc
 */
public class Passenger {
    
    private String dni;
    private String Name;
    private int age;
    private Categoria Category;
    
    public Passenger(String dni, String Name, int age, Categoria Category) {
        this.dni = dni;
        this.Name = Name;
        this.age = age;
        this.Category = Category;
    }
    
    
}
