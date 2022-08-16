package Soal;

import java.util.Scanner;

public class Play_Asterik {
    public static void asterik(){
        System.out.print("masukkan angka untuk membentuk segitiga asterik: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        for(int asterik= input; asterik > 0;asterik--){ //loop dari input hingga 1
            for(int nonAsterik = 1 ;nonAsterik <= input;nonAsterik++){ //loop dari 1 hingga input
                if(nonAsterik < asterik){
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
