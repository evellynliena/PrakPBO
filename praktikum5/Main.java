/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author evell
 */
public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan("Hewan Umum", "Mamalia");
        hewan.tampilkanInfo();

        System.out.println("\n=== Info Kucing ===");
        Kucing kucing = new Kucing("Cat", "Sphynx");
        kucing.tampilkanInfo();

        System.out.println("\n=== Info Anjing ===");
        Anjing anjing = new Anjing("Dog", "German Shepherd");
        anjing.tampilkanInfo();
    }
}
