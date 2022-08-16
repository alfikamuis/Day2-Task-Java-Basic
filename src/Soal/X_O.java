package Soal;

import java.util.Scanner;

public class X_O {
    public static void xDanO() {
        System.out.print("masukkan input x dan o sebanyak apapun tanpa spasi (contoh:xoxox): ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int jumlah_input = input.length();
        int x = 0;
        int o = 0;

        while (--jumlah_input >= 0) {
            if (input.charAt(jumlah_input) == 'x') {
                x++;
            } else {
                o++;
            }
        }
        System.out.println(x == o ? true : false);
    }
}
