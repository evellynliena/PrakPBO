/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author evell
 */
public class SepedaMotor extends KendaraanDarat {
    private boolean adaKickStarter;

    public SepedaMotor(String nama, int tahun, int jumlahRoda, boolean adaKickStarter) {
        super(nama, tahun, jumlahRoda);
        this.adaKickStarter = adaKickStarter;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ada Kick Starter: " + (adaKickStarter ? "Ya" : "Tidak"));
        System.out.println("Tipe Kendaraan: Sepeda Motor");
    }
}
