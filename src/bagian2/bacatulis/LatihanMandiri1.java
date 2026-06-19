package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LatihanMandiri1 {
    public static void main(String[] args) throws IOException {
        try (PrintWriter pembaca = new PrintWriter(new FileWriter ("Hari.txt"))) {
            pembaca.println("Senin");
            pembaca.println("Selasa");
            pembaca.println("Rabu");
            pembaca.println("Kamis");
            pembaca.println("Jumat");
            System.out.println("Data berhasil ditulis ke hari.txt");
        } catch (IOException e) {
        System.out.println("Gagal menulis: " + e.getMessage());
        }
        
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}
   