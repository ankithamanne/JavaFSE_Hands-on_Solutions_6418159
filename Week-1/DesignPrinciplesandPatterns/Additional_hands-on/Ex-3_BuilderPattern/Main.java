class Computer {
    String CPU, RAM, Storage;
    Computer(Builder b) {
        CPU = b.CPU;
        RAM = b.RAM;
        Storage = b.Storage;
    }
    static class Builder {
        String CPU, RAM, Storage;
        Builder setCPU(String c) { CPU = c; return this; }
        Builder setRAM(String r) { RAM = r; return this; }
        Builder setStorage(String s) { Storage = s; return this; }
        Computer build() { return new Computer(this); }
    }
    public String toString() { return CPU + ", " + RAM + ", " + Storage; }
}
public class Main {
    public static void main(String[] args) {
        Computer c = new Computer.Builder().setCPU("i5").setRAM("8GB").setStorage("512GB").build();
        System.out.println(c);
    }
}