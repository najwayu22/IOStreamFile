// Nama : Najwa Ayu Hafidzah
// NPM  : 2410010358

package tugas;

public class MainTugas {

    public static void main(String[] args) {

        // Array kategori (ukuran tetap)
        String[] kategori = {"Elektronik", "Makanan", "Alat Tulis"};

        System.out.println(" DAFTAR KATEGORI ");
        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(new Barang("Kabel HDMI", 75000, 5));

        gudang.tambahBarang(new Barang("Mouse", 150000, 20));

        gudang.tambahBarang(new Barang("Keyboard", 300000, 10));

        gudang.tambahBarang(new Barang("Buku Tulis", 5000, 50));

        gudang.tambahBarang(new Barang("Pulpen", 4000, 100));

        // Tampilkan data
        gudang.tampilkanSemua();

        System.out.println();

        // Simpan ke berkas
        gudang.simpanKeBerkas();

        System.out.println();

        // Membuat objek baru dan memuat data
        Gudang gudangBaru = new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        System.out.println();

        gudangBaru.tampilkanSemua();

        System.out.println();
        System.out.println("Total Nilai Persediaan : Rp" + gudangBaru.totalNilai());
    }
}