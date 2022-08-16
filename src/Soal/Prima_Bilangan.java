package Soal;

import java.util.Scanner;

public class Prima_Bilangan {
    public static void bilangan_prima() {
        System.out.print("masukkan bilangan (prima/bukan): ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int kondisi_break = input / 2;

        if (input <= 1) {
            System.out.println(input);
            return;
        }

        for (int i = 2; i <= input; i++) {
            if (input % i == 0) {
                System.out.println("Bukan Bilangan Prima");
                break;
            }
            if (i > kondisi_break) {
                System.out.println("Bilangan Prima");
                break;
            }
        }
    }
}
