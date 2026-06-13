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
    long n1 = extractNumber(this.dni);
    long n2 = extractNumber(o.dni);
    return Long.compare(n1, n2);
}

private long extractNumber(String dni) {
    long result = 0;
    for (int i = 0; i < dni.length(); i++) {
        char c = dni.charAt(i);
        if (c == '-') break; // stop before the verification digit
        if (c >= '0' && c <= '9') {
            result = result * 10 + (c - '0');
        }
    }
    return result;
}

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Passenger)) return false;
        return this.dni != null && this.dni.equals(((Passenger) o).dni);
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