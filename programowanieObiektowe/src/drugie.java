/*
Napisz program który generuje 10 elementową tablicę liczb (0 - 100) a następnie przesuwa tą tablicę o 3 elementy w prawo.
Program ma wypisywać na ekranie pierwotną oraz przesuniętą tablicę. Przykład:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[8, 9, 10, 1, 2, 3, 4, 5, 6, 7]
 */

import java.util.Arrays;
import java.util.Random;

public class drugie {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
        }
            System.out.print(Arrays.toString(tab));
        System.out.println();

        int[] tab2 = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab2[(i + 3) % tab.length] = tab[i];
        }

        System.out.print(Arrays.toString(tab2));
    }
}
    

