import java.util.*;
import java.util.concurrent.*;

record Barang(String namaBarang, int hargaBarang) {}

public class IndomaretConcurrentCollection {
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Indomaret");

        List<Barang> listBarang = new CopyOnWriteArrayList<>();

        listBarang.add(new Barang("Minyak Goreng", 25000));
        listBarang.add(new Barang("Mie Instan", 3000));
        listBarang.add(new Barang("Pasta Gigi", 12000));
        listBarang.add(new Barang("Shampoo", 18000));
        listBarang.add(new Barang("Sabun", 5000));
        listBarang.add(new Barang("Coca Cola", 10000));

        for (int i = 0; i < 6; i++) {
            listBarang.add(new Barang("Coca Cola", 10000));
        }


        listBarang.forEach(System.out::println);

        Set<String> kategoriBarang = new CopyOnWriteArraySet<>();
        kategoriBarang.add("Makanan");
        kategoriBarang.add("Perawatan Pribadi");
        kategoriBarang.add("Minuman");

        System.out.println(kategoriBarang);

        Map<String, String> kodeBarang = new ConcurrentHashMap<>();
        kodeBarang.put("A000", "Minyak Goreng");
        kodeBarang.put("A001", "Mie Instan");
        kodeBarang.put("B000", "Pasta Gigi");
        kodeBarang.put("B001", "Shampoo");
        kodeBarang.put("B002", "Sabun");
        kodeBarang.put("C000", "Coca Cola");

        kodeBarang.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
