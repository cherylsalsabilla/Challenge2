package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)

public class Menu {
    private int id;
    private String nama;
    private String kode;
    private int harga;

    public Menu(int id, String kode, String nama, int harga) {
        this.id = id;
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

//    public enum Level {
//        private int value;
//        TIDAKPEDAS(1), SEDANG(2), PEDAS(3);
//        private Level(int value){
//            this.value = value;
//        }
//        public int getValue() {
//            return this.value;
//        }
//    }
}

