package org.example;

import org.example.model.Menu;
import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Menu> listMenu = new ArrayList<>();
    public static void initiateMenu() {
        Menu makanan1 = new Menu(1,"NG","Nasi Goreng  ",15000);
        Menu makanan2 = new Menu(2,"MG","Mie Goreng   ",13000);
        Menu makanan3 = new Menu(3,"NA","Nasi + Ayam  ",18000);
        Menu minuman1 = new Menu(4,"TM","Teh Manis    ",3000);
        Menu minuman2 = new Menu(5,"MJ ","Minuman Jeruk",5000);


        listMenu.add(makanan1);
        listMenu.add(makanan2);
        listMenu.add(makanan3);
        listMenu.add(minuman1);
        listMenu.add(minuman2);
    }

}
