import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

class BazaBMI {
    private Map< String, User> baza = new HashMap<>();

    public void add(String id, User data) {
        baza.put(id, data);
    }

    public User get (String id) {
        return baza.get(id);
    }

    public void remindBMI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID: ");
        String id = scanner.next();

        User data = get(id);
        if (data != null) {
            System.out.println(data.getWartośćBMI() + " " + data.getWynik() + " ");
        } else {
            System.out.println("Nie znaleziono danych dla podanego ID.");
        }
    }
}
