/*
Napisz program w którym zdefiniowana jest zmienna n.
Program ma wyświetlać n elementów ciągu Fibonacciego. Co to jest ciąg Fibonacciego znajdziecie na wikipedii. Przykład:
n = 3
0 1 1
n = 8
0 1 1 2 3 5 8 13

Ciąg Fibonacciego – ciąg liczb naturalnych określony rekurencyjnie w sposób następujący:
Pierwszy wyraz jest równy 0, drugi jest równy 1, każdy następny jest sumą dwóch poprzednich.
 */

import java.util.Scanner;

public class pierwsze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj zmienną n: ");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= n; i++) {
            int fibonacciego = a + b;
            System.out.print(fibonacciego + " ");
            a = b;
            b = fibonacciego;
        }
        System.out.println();
    }
}


