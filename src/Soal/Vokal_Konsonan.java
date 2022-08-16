package Soal;

import java.util.Scanner;

public class Vokal_Konsonan {

    public static void vokalKonsonan() {
        System.out.print("masukkan kalimat/kata: ");
        Scanner scan = new Scanner(System.in);
        String kata = scan.nextLine();
        kata = kata.toLowerCase(); // lowercase
        kata = kata.replaceAll(" ", ""); // hilangkan space

        int jumlah_vokal = 0;
        int jumlah_konsonan = 0;
        int total_karakter = kata.length();

        for (int index = 0; index < total_karakter; index++) {
            if (
                    kata.charAt(index) == 'a' ||
                    kata.charAt(index) == 'i' ||
                    kata.charAt(index) == 'u' ||
                    kata.charAt(index) == 'e' ||
                    kata.charAt(index) == 'o'
            ) {
                jumlah_vokal++;
            } else {
                jumlah_konsonan++;
            }
        }
        System.out.println("jumlah vokal= " + jumlah_vokal);
        System.out.println("jumlah konsonan= " + jumlah_konsonan);
        System.out.println("total karakter= " + total_karakter);
    }
}
