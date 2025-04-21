

class Fulltime extends Employee implements Koperasi {
    int gaji_pokok;
    int tunjangan_lembur;
    int tunjangan_jabatan;
    int tunjangan_anak;
    int tunjangan_komunikasi;
    int bonus_produktivitas;
    int pinjaman_koperasi;
    int jam_kerja;

    public Fulltime(String name, String jabatan, String departemen,
                    int gaji_pokok, int tunjangan_lembur,
                    int tunjangan_jabatan, int tunjangan_anak, int tunjangan_komunikasi,
                    int bonus_produktivitas, int pinjaman_koperasi, int jam_kerja)
    {
        super(name, jabatan, departemen);
        this.gaji_pokok = gaji_pokok;
        this.tunjangan_lembur = tunjangan_lembur;
        this.tunjangan_jabatan = tunjangan_jabatan;
        this.tunjangan_anak = tunjangan_anak;
        this.tunjangan_komunikasi = tunjangan_komunikasi;
        this.bonus_produktivitas = bonus_produktivitas;
        this.pinjaman_koperasi = pinjaman_koperasi;
        this.jam_kerja = jam_kerja;
    }

    public int LoanMonthly(int loan) {
        return loan * 12;
    }

    public int getSalary() {
        return gaji_pokok + tunjangan_lembur + tunjangan_jabatan + tunjangan_anak + tunjangan_komunikasi + bonus_produktivitas - pinjaman_koperasi;
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
        System.out.println("Tunjangan Jabatan: Rp ." + tunjangan_jabatan);
        System.out.println("Tunjangan Anak: Rp ." + tunjangan_anak);
        System.out.println("Tunjangan Komunikasi: Rp ." + tunjangan_komunikasi);
        System.out.println("Bonus Produktivitas: Rp ." + bonus_produktivitas);
        System.out.println("Pinjaman Koperasi: Rp ." + pinjaman_koperasi);
        System.out.println("\n");
        System.out.println("Total Gaji: Rp." + getSalary());
    }

}
