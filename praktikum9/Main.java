/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum9;

/**
 *
 * @author evell
 */
public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        Kendaraan sepedamotor = new SepedaMotor();
        mobil.berjalan();
        mobil.info();
        sepeda.berjalan();
        sepeda.info();
        sepedamotor.berjalan();
        sepedamotor.info();
     }
}

