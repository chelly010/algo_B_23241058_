import java.util.Scanner;
public class App {
    public static void main(String[] args) {
       
        // Data Member
        int total_belanja,bayar,diskon;
        String member;
        
        //Membuat Objek Scanner
        Scanner scan = new Scanner(System.in);

        //Memasukan Input dari keyboard
        System.out.print("Apakah anda member (Iya/Tidak): ");
        member = scan.nextLine();
        System.out.print("Masukkan Total Belanja: ");
        total_belanja = scan.nextInt();
      
        //IF Statement
        // Member Toko
         if (member.equalsIgnoreCase("iya")) {
         if (total_belanja >= 500000) {
            System.out.println("Selamat Anda mendapatkan diskon Rp.50.000");
            diskon = 50000;
         } else if (total_belanja >= 100000) {
            System.out.println("Selamat anda Mendapatkan diskon Rp.15.000");
            diskon = 15000;
             }else{
                diskon = 0;
                System.out.println("Anda tidak mendapatkan diskon");
             }
        // Bukan Member Toko
        } else {
        if (total_belanja >= 100000) {
            diskon = 10000;
            System.out.println("Selamat anda mendapatkan diskon Rp.10.000");
        }else{
            diskon = 0;
            System.out.println("Anda tidak mendapatkan diskon");
             }
        }
       bayar = total_belanja-diskon;
        System.out.println("Total biaya anda : Rp" + bayar);
    }
}
      
    


    






    

