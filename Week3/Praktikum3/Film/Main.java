
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama pelanggan");
        String nama = input.nextLine();
        System.out.println("Masukkan email pelanggan");
        String email = input.nextLine();
        System.out.println("Masukkan umur pelanggan");
        int umur = input.nextInt();

        input.nextLine();

        Pelanggan pelanggan = new Pelanggan(nama, umur, email);

        System.out.println("Masukkan judul film");
        String judul = input.nextLine();
        System.out.println("Masukkan jumlah tiket");
        int jumlah = input.nextInt();
        System.out.println("Masukkan harga tiket");
        int harga = input.nextInt();

        Tiket tiket = new Tiket(judul, harga, jumlah);

        Pemesanan pemesanan = new Pemesanan(pelanggan, tiket);
        pemesanan.tampilPemesanan(pelanggan, tiket);



    }
}
