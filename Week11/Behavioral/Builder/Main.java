public class Main {
    public static void main(String[] args) {
        // Membangun PC Gaming
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                              .setGPU("NVIDIA RTX 4090")
                              .setStorage("2TB SSD")
                              .setPowerSupply("850W")
                              .setMonitor("4K 144Hz")
                              .setOS("Windows 11")
                              .setKeyboard(true)
                              .setMouse(true)
                              .build();

        System.out.println("Gaming PC: " + gamingPC);

        // Membangun Server
        Computer server = new Computer.Builder("AMD EPYC", "128GB")
                              .setStorage("8TB HDD + 2TB SSD")
                              .setPowerSupply("1200W")
                              .setOS("Linux Ubuntu Server")
                              .build();

        System.out.println("Server: " + server);
    }
}
