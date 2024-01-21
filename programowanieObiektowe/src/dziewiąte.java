/*

We want to make a row of bricks that is goal inches long.
We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return true if it is possible to make the goal by choosing from the given bricks.
This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks


makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
 */

import java.util.Scanner;

public class dziewiąte {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));  // true
        System.out.println(makeBricks(3, 1, 9));  // false
        System.out.println(makeBricks(3, 2, 10)); // true
    }

    public static boolean makeBricks(int small, int big, int goal) {
        if (goal > small + big * 5) {
            return false; // Cel jest większy niż suma wszystkich dostępnych klocków
        }
        /*
        Drugi warunek if (goal % 5 > small) sprawdza, czy reszta z dzielenia długości goal przez 5
        jest większa niż liczba dostępnych małych cegieł. Jeśli tak, to zwraca false, ponieważ nie możemy uzupełnić brakującej części z małych cegieł.
         */
        if (goal % 5 > small) {
            return false; // Liczba małych klocków jest niewystarczająca, aby uzupełnić resztę po użyciu dużych klocków
        }
        return true; // Możemy zbudować rząd klocków o długości goal
    }
}