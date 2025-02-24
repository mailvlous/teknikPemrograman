public class Tiket {
    private String judul;
    private int harga;
    private int jumlah;
    
    public Tiket(String judul, int harga, int jumlah) {
        this.judul = judul;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    // setter
    public void setJudul(Film judul) {
        this.judul = judul.getJudul();
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // getter
    public String getJudul() {
        return judul;
    }

    public int getHarga() {
        return harga;
    }    

    public int getJumlah() {        
        return jumlah;
    }



}
