/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

/**
 *
 * @author evell
 */
public class PraktikumPBO_4 {
    public static void main(String[] args) {
        Kendaraan mobil1 = new Kendaraan("Toyota Avanza", 180, "Bensin");
        System.out.println("Nama: " + mobil1.getNama());
        System.out.println("Kecepatan: " + mobil1.getKecepatanMaks());
        System.out.println("Jenis Mesin: " + mobil1.getJenisMesin());

        System.out.println("\n--- Mobil ---");
        Mobil mbl = new Mobil("Honda Civic", 220, "Turbo", 4);
        mbl.tampilkanInfoMobil();
    }
}
