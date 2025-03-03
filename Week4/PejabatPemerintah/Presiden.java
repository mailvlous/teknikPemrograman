
public class Presiden extends PejabatPemerintah implements PembuatKebijakan {
    public Presiden(String nama, String jabatan) {
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
        System.out.println(nama + " memimpin negara dan menghadiri pertemuan internasional.");
    }

    @Override
    void melayaniMasyarakat() {
        System.out.println(nama + " memberikan pidato kepada rakyat.");
    }

    @Override
    public void buatKebijakan() {
        System.out.println(nama + " membuat kebijakan baru.");
    }

    @Override
    public void evaluasiKebijakan() {
        System.out.println(nama + " melakukan evaluasi kebijakan.");
    }
}

