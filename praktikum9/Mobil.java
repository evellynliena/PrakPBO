/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum9;

/**
 *
 * @author evell
 */
class Mobil extends Kendaraan {
    @Override
     void berjalan() {
         System.out.println("Mobil sedang berjalan dengan cepat.");
    }
}
class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
         System.out.println("Sepeda sedang berjalan dengan pelan.");
    }
}
class SepedaMotor extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda Motor sedang berjalan dengan cepat sekali.");
    }
}


