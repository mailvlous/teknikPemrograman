public class Gubernur extends PejabatPemerintah implements PembuatKebijakan {
    public Gubernur(String nama, String jabatan) {
        super(nama, jabatan);
    }

    @Override
    public void getName() {
        System.out.println("Nama: " + nama);
    }

    @Override
    public void getJabatan() {
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
    void melayaniMasyarakat() {
        System.out.println("Gubernur sedang melayani masyarakat.");
    }

    @Override
    void bekerja() {
        System.out.println("Gubernur sedang bekerja.");
    }

    @Override
    public void buatKebijakan() {
        System.out.println("Gubernur membuat kebijakan baru.");
    }

    @Override
    public void evaluasiKebijakan() {
        System.out.println("Gubernur melakukan evaluasi kebijakan.");
    }
}
