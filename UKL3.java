package ukl;
import java.util.Scanner;

public class UKL3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        hitung_Frekuensi(array);
    }

    public static void hitung_Frekuensi(int[] array) {
        boolean[] sudah_Di_hitung = new boolean[array.length];
        int elemen_Terbanyak = array[0];
        int jumlah_Muncul_Terbanyak = 1;

        for (int i = 0; i < array.length; i++) {
            if (sudah_Di_hitung[i]) { 
                int count = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        sudah_Di_hitung[j] = true;
                    }
                }

                System.out.println(array[i] + " muncul " + count + " kali");

                if (count > jumlah_Muncul_Terbanyak) {
                    elemen_Terbanyak = array[i];
                    jumlah_Muncul_Terbanyak = count;
                }
            }
        }

        System.out.println("Elemen yang paling sering muncul adalah " + elemen_Terbanyak + " sebanyak " + jumlah_Muncul_Terbanyak + " kali");
    }
}