class MakanNasi {
    void makan() {
        System.out.println("Makan nasi...");
    }
}

class Manusia {
    private MakanNasi makanan = new MakanNasi(); 
    private String nama;

    void makan() {
        makanan.makan();
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void tampilkanNama() {
        System.out.println("Nama: " + nama);
    }
}

public class MakanHighCoupling {
    public static void main(String[] args) {
        Manusia orang = new Manusia();
        orang.makan(); 
    }
}
