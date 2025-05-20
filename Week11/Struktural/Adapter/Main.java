

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcessor processor = new PaymentProcessor();

        System.out.print("Masukkan nama gateway (midtrans/xendit): ");
        String gateway = scanner.nextLine();

        System.out.print("Masukkan jumlah pembayaran: ");
        double amount = scanner.nextDouble();

        try {
            processor.process(gateway, amount);
            System.out.println("✅ Pembayaran berhasil.");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Gagal: " + e.getMessage());
        }
    }
}
