package org.example.service;
//import org.example.model.
import org.example.model.Pesanan;
import org.example.model.ItemPesanan;
import org.example.view.MenuView;

import java.util.List;
import java.util.Map;
public interface PesananService {
    int getTotalPesanan();
    int getTotalPesanan(Pesanan pesanan);

    public int getTotalPesanan(Pesanan pesanan) {
        return MenuView.getlistPesanan().size();
    }

    public List<Pesanan> getProductList(Pesanan pesanan) {
        return pesanan.getlistPesanan();
    }


    Map<Long, Pesanan> getProductList();
    List<Pesanan> getProductList(Pesanan pesanan);
    }
}
