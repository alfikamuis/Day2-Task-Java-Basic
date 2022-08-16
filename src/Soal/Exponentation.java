package Soal;

import java.util.Scanner;

public class Exponentation {
    public static void exponent() {
        System.out.println("masukkan x^n (x pangkat n)");
        System.out.print("x: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.print("n: ");
        int n = scan.nextInt();

        int result = x;

        for (int i = 1; i < n; i++) {
            result *= x;
        }

        System.out.println("hasil pangkat: "+result);
    }
}
