/*
Napisz program, który generuje 30 elementową tablicę (liczby 0 - 100). Program powinien wypisywać na ekranie wygenerowaną tablicę
oraz drugą największą liczbę w tablicy. Przykład:
[1,2,3,4,5,6]
5
[2,3,6,9,34,35}
34
[65,23,76,45,34,12}
65
 */

import java.util.Arrays;
import java.util.Random;

public class czwarte {
    public static void main(String[] args) {
        int[] tab = new int[30];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(tab));
        System.out.println();

        int największaLiczba = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > największaLiczba) {
                największaLiczba = tab[i];
            }

        }
        System.out.print("Największa liczba:" + największaLiczba);

        System.out.println();

        int drugaNajwiększaLiczba = Integer.MIN_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > drugaNajwiększaLiczba && tab[i]<największaLiczba) { //bieżący element tablicy jest większy od drugaNajwiększaLiczba i jednocześnie mniejszy od największaLiczba
                drugaNajwiększaLiczba = tab[i];
            }
        }
        System.out.print("Druga największa liczba:" + drugaNajwiększaLiczba);

    }
}
