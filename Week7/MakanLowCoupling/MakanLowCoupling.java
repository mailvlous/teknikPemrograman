interface Makanan {
    void makan();
}

class Nasi implements Makanan {
    public void makan() {
        System.out.println("Makan nasi...");
    }
}

class Roti implements Makanan {
    public void makan() {
        System.out.println("Makan roti...");
    }
}

class Manusia {
    private Makanan makanan; 

    public Manusia(Makanan makanan) {
        this.makanan = makanan;
    }

    void makan() {
        makanan.makan();
    }
}

public class MakanLowCoupling {
    public static void main(String[] args) {
        Manusia orang1 = new Manusia(new Nasi());
        Manusia orang2 = new Manusia(new Roti());

        orang1.makan();
        orang2.makan(); 
    }
}
