/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajdnja;

/**
 *
 * @author evell
 */
import java.util.ArrayList;
import java.util.List;

class Buku {
    private String judul;

    public Buku(String judul) {
        this.judul = judul;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
    }
}

class Perpustakaan {
    private List<Buku> bukuList;

    public Perpustakaan() {
        bukuList = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    public void infoPerpustakaan() {
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}

public class MainPerpus {
    public static void main(String[] args) {

        Perpustakaan perpustakaan = new Perpustakaan();

        Buku buku1 = new Buku("Pemrograman PBO");

        perpustakaan.tambahBuku(buku1);
        
        perpustakaan = null;

        System.out.println("Daftar Buku di Perpustakaan:");
        perpustakaan.infoPerpustakaan();
    }
}

