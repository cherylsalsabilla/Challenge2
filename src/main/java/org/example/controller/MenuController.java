package org.example.controller;

//import org.example.model.entity.Product;
//import org.example.service.ProductService;
//import org.example.service.ProductServiceImpl;
import org.example.view.MenuView;
import org.example.view.ProductView;
import org.example.model.Pesanan;


import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class MenuController {
    public void mainMenu(){
        MenuView.tampilanMenu();

        MenuView menuView = new MenuView();
        menuView.displayMenu();

    }

    public void menuSelection(){
        while(true) {
            if(MenuView.listPesanan.size()-1>=1 && MenuView.listPesanan.size()-1<=5){
                ProductView pv = new ProductView();
                pv.varian();
//            } else if (MenuView.listPesanan.size()-1 == 99) {
//                try {
//                    if(MenuView.listPesanan.size() != null) {
//
//                    }
//                    //!MenuView.listPesanan.size() = null;
//                    //TODO: konfirmasi pesanan;
//                } catch (Exception e) {
//                    System.out.println("=========================");
//                    System.out.println("Minimal 1 jumlah pesanan!");
//                    System.out.println("=========================");
//                } finally {
//                    System.out.println("Anda akan dialihkan ke menu utama");
//                    MenuView.displayMenu();
//                }
            } else if (MenuView.listPesanan.size()-1 == 0) {
                break;
            }
        }
    }

//    public void displayProducts(){
//        ProductService ps = new ProductServiceImpl();
//        Map<Long, Product> productMap = ps.getProductList();
//
//        ProductView pv = new ProductView();
//        pv.displayProducts(productMap);
//    }
//
//    public void add(Product product) {
//        ProductService productService = new ProductServiceImpl();
//        productService.create(product);
//
//        mainMenu();
//    }
}
