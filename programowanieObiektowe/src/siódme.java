/*
Napisz program generujący 3 tablice 10 elementowe (liczby -20 do 20).
Program ma sprawdzić czy w każdej z tablic znajdują się 3 takie same elementy, jeśli nie to generuje tablice ponownie.
Program ma wypisywać wygenerowane tablice oraz ilość ponownych generacji tablic.
 */

import java.util.Random;

public class siódme {
    public static void main(String[] args) {
        int[][] tablice = new int[3][10];
        int iloscPonownychGeneracji = 0;

        for (int i = 0; i < tablice.length; i++) {
            do {
                generujTablice(tablice[i]);
                iloscPonownychGeneracji++;
            } while (!czyZawieraTrzyTakieSameElementy(tablice[i]));
        }

        for (int i = 0; i < tablice.length; i++) {
            for (int j = 0; j < tablice[i].length; j++) {
                System.out.print(tablice[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Ilość ponownych generacji tablic: " + (iloscPonownychGeneracji - 3));
    }

    private static void generujTablice(int[] tablica) {
        Random random = new Random();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(41) - 20; // Losowanie liczby z zakresu -20 do 20
        }
    }

    private static boolean czyZawieraTrzyTakieSameElementy(int[] tablica) {
        for (int i = 0; i < tablica.length - 2; i++) {
            for (int j = i + 1; j < tablica.length - 1; j++) {
                for (int k = j + 1; k < tablica.length; k++) {
                    if (tablica[i] == tablica[j] && tablica[j] == tablica[k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}