package org.example.view;
import java.io.FileWriter;
import java.io.IOException;

public class CetakStruk {
    public static final String PATH="Struk Pembelian.txt";

    public static void writeFile() {
        File file = new File(PATH);
        try {
            if (file.createNewFile()) {
                System.out.println("File Created");
            }else{
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Terjadi error");
            throw new RuntimeException(e);
        }
        try {
            int totalQty = 0;
            String invoice = "";
            invoice += "======================================\n";
            invoice += "BinarFud\n";
            invoice += "======================================\n";
            invoice += "Terima kasih sudah memesan di BinarFud\n";
            invoice += "Dibawah ini adalah pesanan anda\n";
            invoice += "\n";

//Invoice total pesanan dan lainnya

            invoice += "----------------------------------------+\n";
 //           invoice += "Total : " + "\t\t\t" + totalQty + "\t\t\t" + totalHarga + "\n";
            invoice += "Pembayaran : BinarCash\n";
            invoice += "\n";
            invoice += "=========================================\n";
            invoice += "Simpan struk ini sebagai bukti pembayaran\n";
            invoice += "=========================================\n";

            FileWriter fileWriter = new FileWriter(PATH);
            fileWriter.write(invoice);
            fileWriter.close();
            System.out.println("Berhasil ditulis");
        } catch (IOException e) {
            System.out.println("Terjadi error");
            throw new RuntimeException(e);
        }
    }
}
