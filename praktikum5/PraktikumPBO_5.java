/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum5;

/**
 *
 * @author evell
 */
public class PraktikumPBO_5 {
    public static void main(String[] args) {
        System.out.println("=== Info Mobil ===");
        Mobil mobil = new Mobil("Toyota Avanza", 2020, 4, "Bensin");
        mobil.tampilkanInfo();

        System.out.println("\n=== Info Sepeda Motor ===");
        SepedaMotor motor = new SepedaMotor("Honda Beat", 2022, 2, true);
        motor.tampilkanInfo();
    }
}
