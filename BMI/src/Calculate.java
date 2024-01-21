import java.util.Scanner;
import java.util.UUID;

class Calculate {
    private Scanner scanner = new Scanner(System.in);

    public String calculate(GUI gui, BazaBMI baza) {
        double weight = gui.readWeight();
        double height = gui.readHeight();


        double wartośćBMI = calculateBMI(weight, height);
        System.out.println("Zakres wartości BMI: " + wartośćBMI);


        String wynik;
        if (wartośćBMI <= 18.49) {
            wynik = "Niedowaga";
        } else if (wartośćBMI >= 18.5 && wartośćBMI <= 24.99) {
            wynik = "Optimum";
        } else if (wartośćBMI >= 25) {
            wynik = "Nadwaga";
        } else {
            wynik = "Otyłość";
        }
        System.out.println(wynik);


        User user = new User(wynik, wartośćBMI);
        baza.add(user.getId(), user);
        return user.getId();
    }
    public double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}
