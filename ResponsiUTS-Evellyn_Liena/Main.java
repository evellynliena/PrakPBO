/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author evell
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Output Produk");
        Produk p1 = new Elektronik("Apple MacBook", 17999000, 1);
        p1.tampilkanInfo();
        System.out.println();

        System.out.println("2. Output Pegawai");
        Pegawai pg1 = new PegawaiTetap("Evellyn", 10000000, 2000000);
        pg1.tampilkanInfo();
        System.out.println();

        System.out.println("3. Output Polimorfisme");
        Produk p2 = new Makanan("Chitato", 13000, "2026-09-11");
        Pegawai pg2 = new PegawaiKontrak("Chiyo", 4000000, 10);

        p2.tampilkanInfo();
        System.out.println();
        pg2.tampilkanInfo();
    }
}
