public class Pemesanan {
    private Pelanggan pelanggan;
    private Tiket tiket;

    public Pemesanan(Pelanggan pelanggan, Tiket tiket) {
        this.pelanggan = pelanggan;
        this.tiket = tiket;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public void tampilPemesanan(Pelanggan pelanggan, Tiket tiket) {
        System.out.println("\n=== Informasi Pemesanan ===");
        System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        System.out.println("Email          : " + pelanggan.getEmail());
        System.out.println("Film          : " + tiket.getJudul());
        System.out.println("Harga Tiket   : " + tiket.getHarga());
        System.out.println("Jumlah Tiket  : " + tiket.getJumlah());
    }
    
}

