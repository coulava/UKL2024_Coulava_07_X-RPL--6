package ukl;
import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        int angka = s.nextInt();
        
        if (isPrime(angka)) {
            System.out.println(angka + " adalah bilangan prima");
        } else {
            System.out.println(angka + " bukan bilangan prima");
        }
        
        s.close();
    } 

    public static boolean isPrime(int num) {
        
        if (num < 2) {
            return false;
        }
        
       
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
    