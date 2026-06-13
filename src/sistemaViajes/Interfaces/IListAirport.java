/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemaViajes.Interfaces;

import sistemaViajes.Domain.Airport;
import sistemaViajes.Domain.Passenger;
import sistemaViajes.Retorno;

/**
 *
 * @author franc
 */
public interface IListAirport {
    
    Retorno GetAirport(String code);

    Retorno RegisterFlight(String codeAirport_origin, String codeAirport_Destiny, String FlightCode, int Capacity, int usdCost);
    
}
