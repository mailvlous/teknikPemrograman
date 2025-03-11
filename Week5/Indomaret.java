import java.util.*;

record Barang(String namaBarang, int hargaBarang) {}

public class Indomaret {
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Indomaret");

        List<Barang> listBarang = new ArrayList<>();

        // Add barang
        listBarang.add(new Barang("Minyak Goreng", 25000));
        listBarang.add(new Barang("Mie Instan", 3000));
        listBarang.add(new Barang("Pasta Gigi", 12000));
        listBarang.add(new Barang("Shampoo", 18000));
        listBarang.add(new Barang("Sabun", 5000));
        listBarang.add(new Barang("Coca Cola", 10000));

        // Menambahkan "Coca Cola" sebanyak 6 kali
        for (int i = 0; i < 6; i++) {
            listBarang.add(new Barang("Coca Cola", 10000));
        }
        //Print barang

        int i = 0;
        while(i<listBarang.size()) {
            System.out.println(listBarang.get(i));
            i++;
        }

        // Set kategori barang

        System.out.println("\n Immutable Set kategoriBarang \n");

        Set<String> kategoriBarang = Set.of("Makanan", "Minuman", "Perawatan Pribadi");

        // Print kategori barang
        System.out.println("Kategori Barang: " + kategoriBarang + "\n");

        //Hashmap kodeBarang

        System.out.println("HashMap kodeBarang \n");

        Map<String, String> kodeBarang = new HashMap<>();
        kodeBarang.put("A000", "Minyak Goreng");
        kodeBarang.put("A001", "Mie Instan");
        kodeBarang.put("B000", "Pasta Gigi");
        kodeBarang.put("B001", "Shampoo");
        kodeBarang.put("B002", "Sabun");
        kodeBarang.put("C000", "Coca Cola");    
        
        kodeBarang.forEach((key, value) -> System.err.println(key + " : " + value));

        // 5. Queue

        System.out.println("\n Queue antrianPelanggan\n");

        Queue<String> antrianKasir = new LinkedList<>();

        antrianKasir.add("Pelanggan 1");
        antrianKasir.add("Pelanggan 2");
        antrianKasir.add("Pelanggan 3");

        System.out.println("Antrian saat ini:"+ antrianKasir);
        System.out.println("\n");
        antrianKasir.poll();
        System.out.println("Antrian saat ini:"+ antrianKasir);

        // Dequeue

        System.out.println("\n Dequeue stokBarang \n");

        Deque<String> stokBarang = new ArrayDeque<>();
        
        // add first
        stokBarang.addFirst("Minyak Goreng");
        stokBarang.addFirst("Mie Instan");
        stokBarang.addFirst("Shampoo");

        System.out.println("Stok barang: " + stokBarang);
        // add last
        stokBarang.addLast("Coca Cola");

        System.out.println("Stok barang: " + stokBarang);

        // Ambil yang pertama
        stokBarang.pollFirst();
        System.out.println("Stok barang: " + stokBarang);

        // Ambil yang terakhir
        stokBarang.pollLast();
        System.out.println("Stok barang: " + stokBarang);

        // 6. Immutable Set

        System.out.println("\n Immutable List Promo Lebaran \n");

        List<Barang> promoBarangLebaran = List.of(
            new Barang("Minyak Goreng", 2000),
            new Barang("Mie Instan", 500),
            new Barang("Shampoo", 500)
        );
        
        System.out.println("Promo Lebaran:");
        for (Barang barang : promoBarangLebaran) {
            System.out.println(barang);
            
        }
        System.out.println("\n");

        List<Barang> promoBarangTahunBaru = List.of(
            new Barang("Beras", 1500),
            new Barang("Mie Instan", 1000),
            new Barang("Kopi", 5000)
        );

        System.out.println("Promo Tahun Baru:");
        for (Barang barang : promoBarangTahunBaru) {
            System.out.println(barang);
            
        }
        System.out.println("\n");

        // 6. Immutable HashMap


        Map<String, List<Barang>> kodePromo = Map.of(
            "PR000", promoBarangLebaran,
            "PR001", promoBarangTahunBaru
        );
        kodePromo.forEach((key, value) -> System.err.println(key + " : " + value));

    }
}