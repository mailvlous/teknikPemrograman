

public class Employee {
    private String name;
    private String jabatan;
    private String departemen;

    // Class Employee memiliki atribut name, jabatan dan departemen dengan method sebagai berikut
    

    public Employee(String name, String jabatan, String departemen) {
        this.name = name;
        this.jabatan = jabatan;
        this.departemen = departemen;
    }

    public String getName() {
        return name;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    //

    public void printData(Employee employee) {
        System.out.println("Name: " + getName());
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Departemen: " + getDepartemen());
    }

}
