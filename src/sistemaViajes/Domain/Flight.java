/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaViajes.Domain;

/**
 *
 * @author franc
 */
public class Flight implements Comparable<Flight> {
    private String origingAirportCode;
    private String destinationAirportCode;
    private String code;
    private int capacity;
    private int cost;
    private FlightState state;
    
    public Flight(String origingAirportCode, String destinationAirportCode, String code, int capacity, int cost) {
        this.origingAirportCode = origingAirportCode;
        this.destinationAirportCode = destinationAirportCode;
        this.code = code;
        this.capacity = capacity;
        this.cost = cost;
        
        this.state = FlightState.PROGRAMMED;
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

    @Override
    public int compareTo(Flight o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private enum FlightState {
        //Un vuelo puede tener los siguientes estados:
        //1. Programado: Es el estado inicial se aceptan reservas.
        //2. Abierto: Check-in habilitado y se siguen aceptando reservas.
        //3. Cerrado: No se aceptan más reservas, queda en espera para embarque y despegue.
        //4. Finalizado: Pasajeros subieron al avión y están en curso al destino.        
        PROGRAMMED, OPEN, CLOSE, FINISHED    
    }
    
}
