package Soal;

import java.util.Scanner;

public class Tabel_Perkalian {
    public static void tabelPerkalian(){
        System.out.print("masukkan angka perkalian: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        for(int angkaDasar = 1; angkaDasar<= input; angkaDasar++){
            for(int pengali = 1; pengali <= input; pengali++){
                System.out.print(angkaDasar*pengali+"\t");
            }
            System.out.println();
        }

    }
}
