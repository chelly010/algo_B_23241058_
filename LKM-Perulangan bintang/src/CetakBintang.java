import java.util.Scanner;

public class CetakBintang {
    public static void main(String[] args) {
        // masukan scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Berapa *: ");
        int angka = scan.nextInt();
        
        // Masukan jumlah bintang
        int i, j;
        for (i=0; i<angka; i+=1) {
         for (j=0; j<i; j++) {
            System.out.print("*");
        }
            System.out.println("*");
        }
    }
}