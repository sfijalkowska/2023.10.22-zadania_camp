/*
Napisz program w którym jest tablica zawierająca liczby od 2 do 101 (włącznie).
Program ma wypisać liczby pierwsze znajdujące się w tej tablicy.
Należy wykorzystać sito Eratostenesa. Sito Eratostenesa znajdziecie na wikipedii.

Sito Eratostenesa – algorytm wyznaczania wszystkich liczb pierwszych mniejszych od danej, czyli z zadanego przedziału

 */

import java.util.Arrays;

public class piąte {
    public static void main(String[] args) {
        int n = 101;
        boolean[] sitoEratostenesa = new boolean[n + 1];

        for (int i = 2; i < sitoEratostenesa.length; i++) {
            sitoEratostenesa[i] = true;
        }
        System.out.println("Liczby pierwsze od 2 do " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (sitoEratostenesa[i] = true) {
                System.out.print(i + " ");
            }
        }
        for (int i = 2; i < sitoEratostenesa.length; i++) {
            if (sitoEratostenesa[i] = true) {
                for (int j = i * i; j <= sitoEratostenesa.length; j = j + i) {
                    sitoEratostenesa[i] = false;
                }
            }
        }
        System.out.println("sito Eratostenesa:");
        for (int i = 2; i <= n; i++) {
            if (sitoEratostenesa[i] = true) {
                System.out.print(i + " ");
            }
        }
    }
}


