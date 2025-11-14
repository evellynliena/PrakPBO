/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author evell
 */
public class Main2 {
    public static void main(String[] args) {

        Elektronik tv = new Elektronik();
        Makanan roti = new Makanan();

        double hargaTv = 2500000;   
        double hargaRoti = 15000;   

        double pajakTv = tv.hitungPajak(hargaTv);
        double pajakRoti = roti.hitungPajak(hargaRoti);

        double hargaAkhirTv = hargaTv + pajakTv;
        double hargaAkhirRoti = hargaRoti + pajakRoti;

        System.out.println("PRODUK ELEKTRONIK");
        System.out.println("Harga Awal: Rp" + hargaTv);
        System.out.println("Pajak (10%): Rp" + pajakTv);
        System.out.println("Harga Akhir: Rp" + hargaAkhirTv);

        System.out.println("\nPRODUK MAKANAN");
        System.out.println("Harga Awal: Rp" + hargaRoti);
        System.out.println("Pajak (5%): Rp" + pajakRoti);
        System.out.println("Harga Akhir: Rp" + hargaAkhirRoti);
    }
}
