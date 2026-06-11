package sistemaViajes.Domain;
import sistemaViajes.Categoria;
import sistemaViajes.Retorno;

public class Passenger implements Comparable<Passenger> {
    
    private String dni;
    private String name;      
    private int age;
    private Categoria category;
    
    public Passenger(String dni, String name, int age, Categoria category) {
        this.dni = dni;
        this.name = name;
        this.age = age;
        this.category = category;
    }

    @Override
    public int compareTo(Passenger o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Passenger)) return false;
        return this.dni != null && this.dni.equals(((Passenger) o).dni);
    }

    @Override
    public int hashCode() {
        return dni != null ? dni.hashCode() : 0;
    }

    public Retorno validate() {
        if (dni == null || name == null || category == null)
            return Retorno.error1();
        if (dni.isBlank() || name.isBlank())
            return Retorno.error1();

        // Formats: N.NNN.NNN-V (7-digit, no leading zero) or NNN.NNN-V (6-digit)
        if (!dni.matches("^([1-9]\\.\\d{3}\\.\\d{3}-\\d|\\d{3}\\.\\d{3}-\\d)$"))
            return Retorno.error2();

        if (age < 0)
            return Retorno.error3();

        return null;
    }

    // Getters
    public String getDni()          { return dni; }
    public String getName()         { return name; }
    public int getAge()             { return age; }
    public Categoria getCategory()  { return category; }

    @Override
    public String toString() {
        return "DNI: " + dni + " | Name: " + name + 
               " | Age: " + age + " | Category: " + category;
    }
}