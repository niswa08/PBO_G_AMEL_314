class RekeningBank {
    // Atribut
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    // Konstruktor
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Method untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println("----------------------------");
    }

    // Method untuk setor uang
    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setoran sebesar Rp" + jumlah + " berhasil.");
            System.out.println("Saldo saat ini: Rp" + saldo);
        } else {
            System.out.println("Jumlah setoran harus lebih dari 0.");
        }
        System.out.println("----------------------------");
    }

    // Method untuk tarik uang
    public void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan sebesar Rp" + jumlah + " berhasil.");
            System.out.println("Saldo saat ini: Rp" + saldo);
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi untuk melakukan penarikan.");
        } else {
            System.out.println("Jumlah penarikan harus lebih dari 0.");
        }
        System.out.println("----------------------------");
    }
}
