abstract class PejabatPemerintah {
    String nama;
    String jabatan;

    PejabatPemerintah(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }

    abstract void bekerja();
    abstract void melayaniMasyarakat();
    abstract void getName();
    abstract void getJabatan();
    abstract String setName(String name);
    abstract String setJabatan(String jabatan);
}