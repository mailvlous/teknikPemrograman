

public class Parttime extends Employee {
    int gaji_pokok;
    int tunjangan_lembur;
    int bonus_proyek;
    int pinjaman_koperasi;
    int jam_kerja;

    public Parttime(String name, String jabatan, String departemen,
                    int gaji_pokok, int tunjangan_lembur, int bonus_proyek,
                    int pinjaman_koperasi, int jam_kerja)
    {
        super(name, jabatan, departemen);
        this.gaji_pokok = gaji_pokok;
        this.tunjangan_lembur = tunjangan_lembur;
        this.bonus_proyek = bonus_proyek;
        this.pinjaman_koperasi = pinjaman_koperasi;
        this.jam_kerja = jam_kerja;
    }

    public int getSalary() {
        return gaji_pokok + tunjangan_lembur + bonus_proyek - pinjaman_koperasi;
    }


    public void printSalary() {
        System.out.println("==== Slip Gaji Bulan Maret ====");
        System.out.println("Tanggal Terbit: 1 April 2025");
        System.out.println("\n");
        System.out.println("Nama: " + getName());
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Total Jam Kerja: " + jam_kerja + " jam");
        System.out.println("Gaji Pokok: Rp ." + gaji_pokok);
        System.out.println("Tunjangan Lembur: Rp ." + tunjangan_lembur);
        System.out.println("Pinjaman Koperasi: Rp ." + pinjaman_koperasi);
        System.out.println("\n");
        System.out.println("Total Gaji: Rp." + getSalary());
    }
}
