package Soal;

import java.util.Scanner;

public class Faktor_Bilangan {
    public static void faktor_bilangan() {
        System.out.print("masukkan bilangan yang akan difaktorkan: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        for (int index = 1; index <= input; index++) {
            if (input % index == 0) {
                System.out.println(index);
            }
        }
    }
}
