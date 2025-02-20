public class Pemilik {
    private String name;
    private String kucingName;


    public void setPemilikName(String newName) {
        this.name = newName;
    }

    public String getPemilikName() {
        return name;
    }   

    public void printPemilik() {
        System.out.println("Namaku " + getPemilikName());
    }

    public void setKucingName(Kucing name) {
        this.kucingName = name.getKucingName();
    }

    public String getKucingName() {
        return kucingName;
    }

    public void printKucingPemilik() {
        System.out.println("Kucingku" + getKucingName());
    }

    public void callKucing() {
        System.out.println("Woi" + getKucingName());
    }
}