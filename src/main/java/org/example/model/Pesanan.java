package org.example.model;

//import jdk.internal.classfile.BufWriter;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
//import java.io.BufferedWriter;
import java.util.Scanner;
//import org.example.model.Menu.Level;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@AllArgsConstructor
public class Pesanan {
    //public static BufferedWriter listPesanan;
    private int id;
    private String kode;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    private List<ItemPesanan> itemPesananList;
}
