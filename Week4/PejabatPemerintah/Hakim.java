public class Hakim extends PejabatPemerintah implements PenegakHukum {
    public Hakim(String nama, String jabatan) {
        super(nama, jabatan);
    }

    @Override
    void getName() {
        System.out.println("Nama: " + nama);
    }

    @Override
    void getJabatan() {
        System.out.println("Jabatan: " + jabatan);
    }

    @Override
    public String setName(String name) {
        this.nama = name;
        return name;
    }

    @Override
    public String setJabatan(String jabatan) {
        this.jabatan = jabatan;
        return jabatan;
    }

    @Override
    void bekerja() {
        System.out.println(nama + " sedang bekerja sebagai hakim.");
    }

    @Override
    void melayaniMasyarakat() {
        System.out.println(nama + " sedang melayani masyarakat.");
    }

    @Override
    public void menegakkanHukum() {
        System.out.println(nama + " menegakkan hukum.");
    }

    @Override
    public void menjatuhkanSanksi() {
        System.out.println(nama + " menjatuhkan sanksi.");
    }
}
