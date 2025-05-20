public class Computer {
    // Wajib
    private String CPU;
    private String RAM;

    // Opsional
    private String GPU;
    private String storage;
    private String powerSupply;
    private String monitor;
    private String os;
    private boolean hasKeyboard;
    private boolean hasMouse;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.GPU = builder.GPU;
        this.storage = builder.storage;
        this.powerSupply = builder.powerSupply;
        this.monitor = builder.monitor;
        this.os = builder.os;
        this.hasKeyboard = builder.hasKeyboard;
        this.hasMouse = builder.hasMouse;
    }

    public static class Builder {
        private String CPU;
        private String RAM;
        private String GPU;
        private String storage;
        private String powerSupply;
        private String monitor;
        private String os;
        private boolean hasKeyboard;
        private boolean hasMouse;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU; return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage; return this;
        }

        public Builder setPowerSupply(String psu) {
            this.powerSupply = psu; return this;
        }

        public Builder setMonitor(String monitor) {
            this.monitor = monitor; return this;
        }

        public Builder setOS(String os) {
            this.os = os; return this;
        }

        public Builder setKeyboard(boolean hasKeyboard) {
            this.hasKeyboard = hasKeyboard; return this;
        }

        public Builder setMouse(boolean hasMouse) {
            this.hasMouse = hasMouse; return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer with CPU: " + CPU + ", RAM: " + RAM + 
               ", GPU: " + GPU + ", Storage: " + storage +
               ", OS: " + os + ", Monitor: " + monitor;
    }
}
