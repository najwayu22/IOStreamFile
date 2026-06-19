package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LatihanMandiri3 {
    public static void main(String[] args) throws IOException {
        int jumlah = 0;
        try (BufferedReader pembaca = new BufferedReader(new FileReader("Hari.txt"))){
            String baris;
            while ((baris = pembaca.readLine()) != null){
                System.out.println((jumlah + 1 ) + ". " + baris);
                jumlah++;
            }
        } catch (IOException e) {
        System.out.println("Gagal membaca: " + e.getMessage());
        }
        System.out.println("Jumlah baris : "+ jumlah);
    }
}
   
