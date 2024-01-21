/*
Napisz program generujący tablicę liczb 10 elementową (liczby -7 do 7).
Program sprawdza czy tablica zawiera duplikaty, jeśli zawiera to generuje nową.
Program ma wyświetlić wygenerowaną tablicę bez duplikatów oraz ilość powtórnych generacji tablicy.
 */

import java.util.Arrays;
import java.util.Random;

public class szóste {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(15) - 7;
        }
        System.out.print("Tablica 1: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }




        int[] tabBezDuplikatów = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tabBezDuplikatów[i] = i;
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            tabBezDuplikatów[i] = i;
            System.out.print(tabBezDuplikatów[i]);
        }
    }
}
