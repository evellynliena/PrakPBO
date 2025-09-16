/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author evell
 */
public class Mobil extends KendaraanDarat {
    private String bahanBakar;

    public Mobil(String nama, int tahun, int jumlahRoda, String bahanBakar) {
        super(nama, tahun, jumlahRoda);
        this.bahanBakar = bahanBakar;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bahan Bakar: " + bahanBakar);
        System.out.println("Tipe Kendaraan: Mobil");
    }
}
