package Soal;

import java.util.Scanner;

public class Palindrom {
    public static void palindrom() {
        System.out.print("masukkan kata (palindrom/bukan): ");
        Scanner scan = new Scanner(System.in);
        String kata = scan.nextLine();
        kata = kata.toLowerCase();
        int panjang_kata = kata.length() - 1;

        for (int index = 0; index <= panjang_kata; index++) {
            if (kata.charAt(index) != kata.charAt(panjang_kata)) { // tidak sama
                System.out.println("Bukan Palindrome");
                break;
            }
            if (index >= panjang_kata) { // jika pointer bertemu ditengah atau saling melewati
                System.out.println("Palindrome");
                break;
            }
            panjang_kata--;
        }
    }
}
