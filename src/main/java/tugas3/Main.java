/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author evell
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("BMW", "X5", 2022, "Putih");
        Mobil mobil2 = new Mobil("Hyundai", "Ioniq 5", 2023, "Silver");

        System.out.println("=== Informasi Mobil 1 ===");
        mobil1.displayInfo();
        mobil1.startEngine();

        System.out.println("\n=== Informasi Mobil 2 ===");
        mobil2.displayInfo();
        mobil2.startEngine();

        System.out.println("\n=== Ubah Warna Mobil 1 ===");
        mobil1.gantiWarna("Merah");
        mobil1.displayInfo();
    }
}
