public class Pelanggan {
    private String nama;
    private int umur;
    private String email;
    private Tiket tiket;

    public Pelanggan() {}

    public Pelanggan(String nama, int umur, String email) {
        this.nama = nama;
        this.umur = umur;
        this.email = email;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getEmail() {
        return email;
    }

    public Tiket getTiket() {
        return tiket;
    }

}
