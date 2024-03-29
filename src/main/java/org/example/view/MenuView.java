package org.example.view;

import org.example.Data;
import org.example.model.Menu;
import org.example.view.MenuView;
import org.example.model.Pesanan;
import org.example.controller.MenuController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuView {
    public static void tampilanMenu() {
        Data.initiateMenu();
        introMenu();

        for(Menu p: Data.listMenu) {
            System.out.println(p.getId() + ". " + p.getNama() + "\t" + "|" + "\t" + "Rp" + p.getHarga());
        }
    }
    private static void introMenu() {
        String awal[] = {"Selamat datang di Binarfud!", "==================================",
                "Menu Makanan dan Minuman"};
        System.out.println(awal[1]);
        System.out.println(awal[0]);
        System.out.println(awal[1]);
        System.out.println(awal[2]);
    }

    private static void pilihanMenu() {
        String awal[] = {"99. Pesan dan Bayar", "0. Keluar Aplikasi"};
        System.out.println(awal[1]);
        System.out.println(awal[0]);
    }

    public static List<Menu> listPesanan = new ArrayList<>();
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        pilihanMenu();
        System.out.print("Silahkan pilih menu:");
        listPesanan.add(scanner.nextInt());

        String arraylist = listPesanan.toString();
        System.out.println("Menu yang dipilih: " + arraylist);

        MenuController menuController = new MenuController();
        menuController.menuSelection();
    }

//        try {
//            for (Integer i : listVariasi) {
//                i =
//            }
//        } catch (Exception e) {
//            System.out.print("Input yang Anda masukkan salah. Silahkan pilih ulang!");
//            throw new RuntimeException(e);
//        }

//    private static void konfirmasiPesanan() {
//        System.out.println("========================");
//        System.out.println(Pesanan.listPesanan.get().toString() + );
//        System.out.println("========================");
//        System.out.println("(Ketik 0 untuk kembali)");
//    }
}
