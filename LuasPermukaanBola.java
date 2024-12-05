package ukl;

import java.util.Scanner;

public class LuasPermukaanBola {
    
    
    public static double hitung_Luas_Permukaan_Bola(double jariJari) {
        return 4 * Math.PI *Math.pow(jariJari, 2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Masukkan jari-jari bola: ");
        double jari_Jari = s.nextDouble();
        
        
        double luas_Permukaan = hitung_Luas_Permukaan_Bola(jari_Jari);
        
       
        System.out.printf("Luas permukaan bola dengan jari-jari " + jari_Jari + " adalah "+ luas_Permukaan);
        
    }
}
