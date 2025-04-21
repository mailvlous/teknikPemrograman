

public class Main {
    public static void main(String[] args) {
        
        int gaji_pokok_asep = 4000000;
        int tunjangan_lembur_asep = 300000;
        int tunjangan_jabatan_asep = 2000000;
        int tunjangan_anak_asep = 1000000;
        int tunjangan_komunikasi_asep = 500000;
        int bonus_produktivitas_asep = 0;
        
        int jam_kerja_asep = 182; // 176 + lembur: 3 + 3 = 182
        
        Fulltime asep = new Fulltime("Asep", "Staf", "Programmer", gaji_pokok_asep, tunjangan_lembur_asep,
                                    tunjangan_jabatan_asep, tunjangan_anak_asep, tunjangan_komunikasi_asep,
                                    bonus_produktivitas_asep, pinjaman_koperasi_asep, jam_kerja_asep);

        int pinjaman_koperasi_asep = asep.LoanMonthly(500000);
        int salary_asep = asep.getSalary();
        asep.printSalary();

        Department programmer = new Department("Programmer");
        programmer.addEmployee(asep);

        // jam kerja ujang 176 + lembur 5 + 4 = 191
        Parttime ujang = new Parttime("Ujang", "Staf", "Programmer", 3000000, 200000, 200000,
                                    0, 191);
        int salary_ujang = ujang.getSalary();
        ujang.printSalary();

        programmer.addEmployee(ujang);
    }
}
