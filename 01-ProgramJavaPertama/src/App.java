public class App {
    public static void main(String[] args) throws Exception {
        // Program Biodata Mahasiswa
        // deklarasi variable
        String nama;
        String nim;
        String tgl_lahir;
        String alamat;
        float berat_badan;
        float tinggi_badan;

        // mengisi variable
        nama = "Chelly";
        nim = "23241058";
        tgl_lahir = "02 September 1997";
        alamat = "Monjok timur No. 23";
        berat_badan = 74.3f;
        tinggi_badan = 173.4f;

        // cetak Biodata
        System.out.println("==========================");
        System.out.println("Nama : "+ nama);
        System.out.println("NIM : " + nim);
        System.out.println("Tanggal lahir : " + tgl_lahir);
        System.out.println("Alamat : " + alamat);
        System.out.println("berat badan : " + berat_badan);
        System.out.println("tinggi badan : " + tinggi_badan);
        System.out.println("==========================");

    }
}
