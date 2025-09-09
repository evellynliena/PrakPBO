/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author evell
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Andi", 30, "Programmer", 8000000);

        System.out.println(pekerja1);

        pekerja1.setNama("Budi");
        System.out.println("\nSetelah ubah nama:");
        System.out.println(pekerja1);

        System.out.println("\nAkses langsung:");
        System.out.println("Usia (protected, terlihat di subclass): " + pekerja1.usia);
        System.out.println("Pekerjaan (public): " + pekerja1.pekerjaan);
    }
}
