/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author evell
 */
public class Kucing extends Hewan {

    public Kucing(String nama, String jenis) {
        super(nama, jenis);
    }

     public void suara() {
        System.out.println("Suara: Meow");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();  
        suara();                 
    }
}
