package org.example.service;

package org.example.service;
import org.example.service.PesananService;
import org.example.model.Pesanan;
import org.example.model.ItemPesanan;
import org.example.view.MenuView;

import java.util.List;
import java.util.Map;

public class PesananServiceImpl implements PesananService {
    @Override
    public int getTotalProduct() {
        return Data.productMap.size();
    }

    @Override
    public int getTotalProduct(Pesanan pesanan) {
            //
        return pesanan.getProductList().size();
    }

    @Override
    public Map<Long, Pesanan> getProductList() {
        return Data.productMap;
    }
    @Override
    public List<Menu> getProductList(Pesanan pesanan) {
        return pesanan.getProductList();
    }
}
