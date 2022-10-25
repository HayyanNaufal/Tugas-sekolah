package latihan.menghitung;

import java.util.Scanner;

public class SegiTiga {
    public static void main(String[] args) {
        Scanner luas = new Scanner(System.in);
        int alas, tinggi;
        System.out.print("Masukkan Alas : ");
            alas = luas.nextInt();
        System.out.print("Masukkan Tinggi : ");
            tinggi = luas.nextInt();
        System.out.println("**********");
        System.out.println("Menghitung luas segitiga : ");
        System.out.println("alas = " +alas);
        System.out.println("tinggi = " +tinggi);
       //menampilkan luas wilayah
        double LuasSegitiga = 0.5 * alas*tinggi;
     
        System.out.println("Maka Luas Segitiga = " + LuasSegitiga);
    }
}
