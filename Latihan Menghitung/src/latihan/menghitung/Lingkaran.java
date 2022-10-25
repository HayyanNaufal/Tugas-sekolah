package latihan.menghitung;

import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        Scanner luas = new Scanner(System.in);
        int r;
        System.out.print("Masukkan jari-jari : ");
            r = luas.nextInt();
        System.out.println("**********");
        System.out.println("Menghitung luas ingkaran : ");
        System.out.println("jari-jari = " +r);
        
        double Luas = 3.14 *r*r;
        double Keliling = 3.14 * 2 * r;
        
        System.out.println("Maka Luas Lingkaran = " + Luas);
        System.out.println("Maka Keliling Lingkaran = " + Keliling);
    }
}
