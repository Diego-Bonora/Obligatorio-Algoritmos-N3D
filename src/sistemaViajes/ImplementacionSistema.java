package sistemaViajes;

//Agregar aquí nombres y números de estudiante de los integrantes del equipo

import sistemaViajes.Domain.Passenger;
import sistemaViajes.TADS.PassengerList;

public class ImplementacionSistema implements Sistema {
    private PassengerList passengerList = null;
    
    @Override
    public Retorno inicializarSistema() {
        this.passengerList = new PassengerList();
        // seed some data
        return Retorno.ok();
    }

    @Override
    public Retorno registrarPasajero(String cedula, String nombre, int edad, Categoria categoria) {
        Passenger p = new Passenger(cedula, nombre, edad, categoria);
        return passengerList.registerPassenger(p);
    }

    @Override
    public Retorno buscarPasajero(String cedula) {
        return passengerList.searchPassenger(cedula);
    }

    @Override
    public Retorno listarPasajerosAscendente() {
        return passengerList.listPassengerAscn();
    }

    @Override
    public Retorno listarPasajerosDescendente() {
                return Retorno.noImplementada();

    }

    @Override
    public Retorno listarPasajerosPorCategoría(Categoria unaCategoria) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno registrarAeropuerto(String codigo, String nombre) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno obtenerAeropuerto(String codigo) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno registrarVuelo(String codigoAeropuertoOrigen, String codigoAeropuertoDestino, String codigoDeVuelo, int capacidad, int costoEnDolares) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno obtenerInformacionDeVuelo(String codigoDeVuelo) {
        return Retorno.noImplementada();
    }
    
    @Override
    public Retorno abrirVuelo(String codigoDeVuelo) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno cerrarVuelo(String codigoDeVuelo) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno realizarReserva(String codigoDeVuelo, String cedula) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno realizarCheckIn(String codigoDeVuelo, String cedula) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno embarqueYDespegueDeVuelo(String codigoAeropuerto) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno consultaDisponibilidad(int[][] matriz, int cantidad, Clase unaClase) {
        return Retorno.noImplementada();
    } 

}
