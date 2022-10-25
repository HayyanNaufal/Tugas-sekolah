package latihan.menghitung;

import java.util.Scanner;

public class Persegi {
    public static void main(String[] args) {
        Scanner luas = new Scanner(System.in);
        int sisi;
        System.out.print("Masukkan sisi : ");
            sisi = luas.nextInt();
        System.out.println("**********");
        System.out.println("Menghitung luas dan keliling Persegi: ");
        System.out.println("sisi = " + sisi);

        int Luas = sisi*sisi;
        int keliling = sisi*4;
        
        System.out.println("Maka Luas Persegi = "  + Luas);
        System.out.println("Maka Keliling Persegi = "  + keliling);
    }
}
