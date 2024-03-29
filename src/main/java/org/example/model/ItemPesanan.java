package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
//@AllArgsConstructor

public class ItemPesanan {
    private int id;
    private Pesanan pesanan;
    private Menu menu;
    private int kuantitas;

    public ItemPesanan(int id, Pesanan pesanan, Menu menu, int kuantitas) {
        this.id = id;
        this.pesanan = pesanan;
        this.menu = menu;
        this.kuantitas = kuantitas;
    }
//    public itemPesanan(int id, String pesanan, int kuantitas) {
//        this.id = id
//    }
//    static List<Menu> listPesanan = new ArrayList<>();

}
