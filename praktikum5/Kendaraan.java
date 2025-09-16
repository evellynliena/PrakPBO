/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author evell
 */
public class Kendaraan {
    protected String nama;
    protected int tahun;

    public Kendaraan(String nama, int tahun) {
        this.nama = nama;
        this.tahun = tahun;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Tahun Produksi: " + tahun);
    }
}
