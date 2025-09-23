/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author evell
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku1 = new Buku("Metamorphosis", 100000);
        Produk hp = new Elektronik("Samsung Galaxy M23", 2000000);
        Produk baju = new Pakaian("kardigan", 250000);

        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(hp);
        keranjang.tambahProduk(baju);

        keranjang.tampilkanProduk();
        System.out.println("Total harga setelah diskon: " + keranjang.hitungTotal());
    }
}

