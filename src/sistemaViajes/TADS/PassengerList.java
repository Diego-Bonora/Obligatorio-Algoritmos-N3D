package sistemaViajes.TADS;

import sistemaViajes.Categoria;
import sistemaViajes.Domain.Passenger;
import sistemaViajes.Interfaces.IPassengerList;
import sistemaViajes.Retorno;

public class PassengerList extends List<Passenger> implements IPassengerList {

    private static final String DNI_REGEX = "^([1-9]\\.\\d{3}\\.\\d{3}-\\d|\\d{3}\\.\\d{3}-\\d)$";

    @Override
    public Retorno registerPassenger(Passenger p) {
        if (super.elExists(p)) {
            return Retorno.error4();
        }
        super.insertOrdered(p);
        return Retorno.ok();
    }

    @Override
    public Retorno searchPassenger(String dni) {
        if (dni == null || !dni.matches(DNI_REGEX))
            return Retorno.error1();

        for (int i = 0; i < super.qty(); i++) {
            Passenger p = super.getElement(i);
            if (p.getDni().equals(dni)) {
                return Retorno.ok(format(p));
            }
        }
        return Retorno.error2();
    }

    @Override
    public Retorno listPassengerAscn() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < super.qty(); i++) {
            if (sb.length() > 0) sb.append("|");
            sb.append(format(super.getElement(i)));
        }
        return Retorno.ok(sb.toString());
    }

    @Override
    public Retorno listPassengerDesc() {
        StringBuilder sb = new StringBuilder();
        for (int i = super.qty() - 1; i >= 0; i--) {
            if (sb.length() > 0) sb.append("|");
            sb.append(format(super.getElement(i)));
        }
        return Retorno.ok(sb.toString());
    }

    @Override
    public Retorno listPassenfersByCategoty(Categoria category) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < super.qty(); i++) {
            Passenger p = super.getElement(i);
            if (p.getCategory() == category) {
                if (sb.length() > 0) sb.append("|");
                sb.append(format(p));
            }
        }
        return Retorno.ok(sb.toString());
    }

    private String format(Passenger p) {
        return p.getDni() + ";" + p.getName() + ";" + p.getAge() + ";" + p.getCategory().getTexto();
    }
}
