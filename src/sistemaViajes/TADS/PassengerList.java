/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaViajes.TADS;

import sistemaViajes.Domain.Passenger;
import sistemaViajes.Interfaces.IList;
import sistemaViajes.Interfaces.IPassengerList;
import sistemaViajes.Retorno;

/**
 *
 * @author franc
 */
  

    public class PassengerList extends List<Passenger> implements IPassengerList {

        
        @Override
        public Retorno registerPassenger(Passenger p) {
            if (p.validate() != null) {
                return p.validate();
            }

            if (PassengerList.super.elExists(p)) {
                return Retorno.error4();
            }
            PassengerList.super.insertOrdered(p);
            return Retorno.ok();
        }

        @Override
        public Retorno searchPassenger(String dni) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Retorno listPassengerAscn() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Retorno listPassengerDesc() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Retorno listPassenfersByCategoty() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
