import java.util.Scanner;
class Menghitung_percepatan_dan_kecepatan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // menghitung percepatan dan kecepatan

        System.out.print("Masukan kecepatan awal(dalam bentuk m/s^2): ");
        double kecepatanAwal = scanner.nextDouble();
        System.out.print("Masukan waktu (dalam satuan detik): ");
        double waktu = scanner.nextDouble();
        System.out.print("Masukan Kecepatan Akhir (dalam satuan detik): ");
        double kecepatanAkhir = scanner.nextDouble();
        double Percepatan = (kecepatanAkhir-kecepatanAwal)/waktu;
        System.out.println("Percepatan adalah : " + Percepatan + "m/s^2.");
        
        // menghitung kecepatan
        System.out.print("Masukan jarak tempuh (dalam satuan kilometer): ");
        double Jarak = scanner.nextDouble();
        System.out.print("Masukan waktu (dalam satuan detik): ");
        double Waktu = scanner.nextDouble();
        double Kecepatan = Jarak/Waktu;
        System.out.println("Kecepatan adalah : " + Kecepatan + "km/s^2.");

        scanner.close();

    }
}