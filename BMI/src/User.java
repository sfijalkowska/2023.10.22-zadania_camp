import java.util.UUID;

class User {
    private String id;
    private String wynik;
    private double wartośćBMI;

    public User(String wynik,double wartośćBMI ) {
        this.wartośćBMI = wartośćBMI;
        this.wynik = wynik;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getWynik() {
        return wynik;
    }

    public double getWartośćBMI() {
        return wartośćBMI;
    }
}