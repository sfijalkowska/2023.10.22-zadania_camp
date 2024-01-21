import java.util.Scanner;

public class GUI {
    Scanner scanner = new Scanner(System.in);

    public String showMenuAndReadChoose() {
        System.out.println("1. Oblicz BMI.");
        System.out.println("2. Przypomnij BMI.");
        System.out.println("3. Exit.");
        return this.scanner.nextLine();
    }

    public void showWrongChoose() {
        System.out.println("WTF");
    }

    public double readWeight() {
        System.out.println("Podaj wagę w kg:");
        return this.scanner.nextDouble();
    }

    public double readHeight() {
        System.out.println("Podaj wzrost w m:");
        return this.scanner.nextDouble();
    }
}
