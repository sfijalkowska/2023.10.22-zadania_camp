/*
Program zawiera zmienną n. Napisz program, który sprawdzi jaką potęgą liczby 2 jest liczba n.
Program powinien wyświetlać potęgę lub komunikat jeśli liczba n nie jest potęgą liczby 2. Przykład:
n = 4
2
n = 16
4
n = 128
7
n = 199
to nie jest potęga dwójki
 */

import java.util.Scanner;

public class trzecie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę n:");
        int n = scanner.nextInt();

       if (n <= 0){
           System.out.println("Liczba musi być większa od 0");
           return;
       }
       int wynik = 1;
       int potęga = 0;

       while (wynik < n) {
           wynik *= 2;
           potęga++;
       }
        if (wynik == n) {
            System.out.println(potęga);
        } else {
            System.out.println("To nie jest potęga dwójki");
       }
    }
}


