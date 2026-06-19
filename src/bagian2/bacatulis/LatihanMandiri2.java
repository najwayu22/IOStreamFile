package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LatihanMandiri2 {
    public static void main(String[] args) throws IOException {
        try (PrintWriter pembaca = new PrintWriter(new FileWriter ("Hari.txt", true))) {
            pembaca.println("Sabtu");
            pembaca.println("Minggu");
            System.out.println("Penambahan hari berhasil");
        } catch (IOException e) {
        System.out.println("Gagal menulis: " + e.getMessage());
        }
        
        try (BufferedReader day = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = day.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}
   
