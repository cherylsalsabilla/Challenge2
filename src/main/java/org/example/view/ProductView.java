package org.example.view;

import org.example.model.Pesanan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    public static List<Integer> listVariasi = new ArrayList<>();
    public static List<Integer> listKuantitas = new ArrayList<>();
    public static void varian() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Silahkan pilih variasi:");
        System.out.print("=>");
        listVariasi.add(sc.nextInt());

        while(true) {
            if (MenuView.listPesanan.get(MenuView.listPesanan.size()-1)<=3 &&
                    MenuView.listPesanan.get(MenuView.listPesanan.size()-1)>=1) {
                System.out.print("1. Tidak Pedas" + "\n" + "2. Sedang" + "\n" + "3. Pedas" + "\n");
                kuantitas();
            } else if (MenuView.listPesanan.get(MenuView.listPesanan.size()-1) == 4 ||
                    MenuView.listPesanan.get(MenuView.listPesanan.size()-1) == 5) {
                System.out.print("1. Panas"  + "\n" + "2. Hangat" + "\n" + "3. Dingin" + "\n");
                kuantitas();
            } else {
                System.out.println("Input Salah. Silahkan Coba ulang!");
            }
        }
    }
    public static void kuantitas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Pesanan:");
        listKuantitas.add(sc.nextInt());
    }
}
