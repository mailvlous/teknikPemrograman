public class Main {
    public static void main(String[] args) {
        // Object Kucing namanya libi
        Kucing libi = new Kucing();

        libi.setKucingName("Libi");
        libi.setKucingAge(2);

        libi.getKucingName();
        libi.getKucingAge();
        libi.meong();

        // Object Pemilik
        Pemilik pemilik = new Pemilik();

        pemilik.setPemilikName("Mail");
        pemilik.setKucingName(libi);

        pemilik.getPemilikName();
        pemilik.getKucingName();
        pemilik.printPemilik();
        pemilik.printKucingPemilik();
        pemilik.callKucing();
    }
}
