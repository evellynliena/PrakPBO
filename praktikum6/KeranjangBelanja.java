/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author evell
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> daftarProduk;

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk p) {
        daftarProduk.add(p);
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanProduk() {
        for (Produk p : daftarProduk) {
            System.out.println(p.getNama() + 
                " | Harga asli: " + p.harga + 
                " | Diskon: " + p.hitungDiskon() + 
                " | Setelah diskon: " + p.getHargaSetelahDiskon());
        }
    }
}

