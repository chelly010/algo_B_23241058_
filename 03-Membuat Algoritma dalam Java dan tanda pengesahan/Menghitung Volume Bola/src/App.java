import java.util.Scanner;
class Menghitung_volume_bola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Menghitung volume bola

        System.out.print("Masukan Jari-jari Bola(dalam bentuk cm): ");
        double Jarijaribola = scanner.nextDouble();
        double Volume = 4/3*3.14*Jarijaribola*Jarijaribola*Jarijaribola;
        System.out.println("Volume adalah : " + Volume + "cm^3.");
        
        scanner.close();

    }
 }