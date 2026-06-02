/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaViajes.Domain;

/**
 *
 * @author franc
 */
public class Flight {
    private String origingAirportCode;
    private String destinationAirportCode;
    private String code;
    private int capacity;
    private int cost;

    public Flight(String origingAirportCode, String destinationAirportCode, String code, int capacity, int cost) {
        this.origingAirportCode = origingAirportCode;
        this.destinationAirportCode = destinationAirportCode;
        this.code = code;
        this.capacity = capacity;
        this.cost = cost;
    }

    public String getOrigingAirportCode() {
        return origingAirportCode;
    }

    public void setOrigingAirportCode(String origingAirportCode) {
        this.origingAirportCode = origingAirportCode;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public void setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
}
