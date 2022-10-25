package Biodata;

import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {
            String nama, alamat, hobi, citacita;
            int umur, tinggiBD;
            
            Scanner datadiri = new Scanner(System.in);
            
            System.out.println("MASUKAN DATA");
            
            System.out.println("masukan nama : ");
            nama = datadiri.nextLine();
            System.out.println("masukan alamat : ");
            alamat = datadiri.nextLine();
            System.out.println("masukan hobi : ");
            hobi = datadiri.nextLine();
            System.out.println("masukan citacita : ");
            citacita = datadiri.nextLine();
            
            System.out.println("masukan umr : ");
            umur = datadiri.nextInt();
            System.out.println("masukan tinggi badan : ");
            tinggiBD = datadiri.nextInt();
            
            System.out.println("<------data anda------>");
            
            System.out.println("nama = " + nama);
            System.out.println("alamat = " + alamat);
            System.out.println("hobi = " + hobi);
            System.out.println("citacita = " + citacita);
            System.out.println("umur = " + umur);
            System.out.println("tingii badan = " + tinggiBD);
            
    }
}
