package latihan.menghitung;

import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner luas = new Scanner(System.in);
        int panjang;
        int lebar;
        System.out.print("Masukkan panjang : ");
            panjang = luas.nextInt();
        System.out.print("Masukkan lebar : ");
            lebar = luas.nextInt();
        System.out.println("**********");
        System.out.println("Menghitung luas persegi panjang : ");
        System.out.println("alas = " +panjang);
        System.out.println("lebar = " +lebar);

        int Luas =panjang*lebar;
        int keliling = 2*(panjang + lebar);
        
        System.out.println("Maka Luas Persegi Panjang = "  + Luas);
        System.out.println("Maka Keliling Persegi Panjang = "  + keliling);
        
    }
}
