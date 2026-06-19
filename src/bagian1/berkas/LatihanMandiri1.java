package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) throws IOException {
        // Objek File hanyalah penunjuk, belum tentu ada di disk
        File berkas = new File("laporan.txt");
        
        // Membuat
        if (berkas.exists()) {
            System.out.println("Berkas ada, ukuran: " + berkas.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan");
        }  
    }
}
