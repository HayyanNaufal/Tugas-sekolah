package kalkulatorkeramik;

public class main {
    public static void main(String[] args) {
        double luasTanah,keramik, dusA , dusB, dusC, butuhA, butuhB, butuhC, hargaA, hargaB, hargaC;
        luasTanah = 100;
        
        //        keramik berukuran 1 m^2
        keramik = 1 * 1;
        
        //        dusA berisi 5 keramik
        dusA = 5;
        hargaA = 5;

        //        dusA berisi 10 keramik        
        dusB = 10;
        hargaB = 9;
        
        //        dusA berisi 20 keramik        
        dusC = 20;
        hargaC = 16;
        
        butuhA = luasTanah / (keramik * dusA);
        butuhB = luasTanah / (keramik * dusB);
        butuhC = luasTanah / (keramik * dusC);
        
        double anggaranA = hargaA * butuhA;
        double anggaranB = hargaB * butuhB;
        double anggaranC = hargaC * butuhC;
        
        //        menampilkan output
        System.out.println("<-----apikasi kalkulator keramik----->");
        System.out.println("keramik berukuran " + keramik + " m^2");
        
        System.out.println("<-----isi dus----->");
        System.out.println("keramik dus A berisi = " + dusA + " biji keramik");
        System.out.println("keramik dus B berisi = " + dusB + " biji keramik");
        System.out.println("keramik dus C berisi = " + dusC + " biji keramik");
        
        System.out.println("<-----butuh berapa----->");
        System.out.println("Dengan dus A membutuhkan " + butuhA + " dus keramik");
        System.out.println("Dengan dus B membutuhkan " + butuhB + " dus keramik");
        System.out.println("Dengan dus C membutuhkan " + butuhC + " dus keramik");
        
        System.out.println("<-----membutuhkan anggaran----->");
        System.out.println("Dus A Membutuhkan anggaran " + anggaranA + " $");
        System.out.println("Dus B Membutuhkan anggaran " + anggaranB + " $");
        System.out.println("Dus C Membutuhkan anggaran " + anggaranC + " $");
    }
    
}
