public class Main {
    public static void main(String[] args) {
        // Membuat objek rekening1
        RekeningBank rekening1 = new RekeningBank("123456789", "Nama Saya", 500000);

        // Membuat objek rekening2
        RekeningBank rekening2 = new RekeningBank("987654321", "Nama Teman", 300000);

        // Menampilkan informasi awal
        System.out.println("Informasi Rekening 1:");
        rekening1.tampilkanInfo();

        System.out.println("Informasi Rekening 2:");
        rekening2.tampilkanInfo();

        // Melakukan transaksi pada rekening1
        System.out.println("Transaksi pada Rekening 1:");
        rekening1.setorUang(200000);
        rekening1.tarikUang(150000);

        // Melakukan transaksi pada rekening2
        System.out.println("Transaksi pada Rekening 2:");
        rekening2.setorUang(100000);
        rekening2.tarikUang(500000);

    }
}