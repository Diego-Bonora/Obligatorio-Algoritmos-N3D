/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemaViajes.Interfaces;

import sistemaViajes.Domain.Passenger;
import sistemaViajes.Retorno;

/**
 *
 * @author franc
 */
public interface IPassengerList {
    Retorno registerPassenger(Passenger p); // 
    Retorno searchPassenger(String dni); 
    Retorno listPassengerAscn();
    Retorno listPassengerDesc();
    Retorno listPassenfersByCategoty();
}


