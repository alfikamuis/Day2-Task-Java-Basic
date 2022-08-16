import Soal.*;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        boolean soal = true;
        Scanner scan = new Scanner(System.in);

        while (soal){
            System.out.println("\tTask-Day2 Alterra"+"\n"+"============================");
            System.out.println("\t1. Vokal Konsonan");
            System.out.println("\t2. X dan O");
            System.out.println("\t3. Faktor Bilangan");
            System.out.println("\t4. Bilangan Prima");
            System.out.println("\t5. Palindrom");
            System.out.println("\t6. Eksponensial ");
            System.out.println("\t7. Play Asterik");
            System.out.println("\t8. Tabel Perkalian");
            System.out.println("\t9. Exit");
            System.out.print("Pilihan: ");

            int pilihanUser = scan.nextInt();
            clearScreen();
            System.out.println();
            switch (pilihanUser) {
                case 1 -> Vokal_Konsonan.vokalKonsonan();
                case 2 -> X_O.xDanO();
                case 3 -> Faktor_Bilangan.faktor_bilangan();
                case 4 -> Prima_Bilangan.bilangan_prima();
                case 5 -> Palindrom.palindrom();
                case 6 -> Exponentation.exponent();
                case 7 -> Play_Asterik.asterik();
                case 8 -> Tabel_Perkalian.tabelPerkalian();
                case 9 -> soal = false;
                default -> System.out.println("Pilihan salah/ diluar dari 1-9");

            }
            System.out.print("\n");
        }
        scan.close();
    }

    public static void clearScreen() {
        try{
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033\143");
            }
        } catch (Exception ex){
            System.err.println("tidak bisa cls");
        }
    }
}
