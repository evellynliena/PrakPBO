/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author evell
 */
import java.util.ArrayList;
import java.util.List;

class Anggota {
    private String nama;

    public Anggota(String nama) {
        this.nama = nama;
    }

    public void infoAnggota() {
        System.out.println("Nama Anggota: " + nama);
    }
}

class Klub {
    private String namaKlub;
    private List<Anggota> anggotaList;

    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
        this.anggotaList = new ArrayList<>();
    }

    public void tambahAnggota(Anggota anggota) {
        anggotaList.add(anggota);
    }

    public void infoKlub() {
        System.out.println("Nama Klub: " + namaKlub);
        for (Anggota anggota : anggotaList) {
            anggota.infoAnggota();
        }
    }
}

public class MainKlub {
    public static void main(String[] args) {

        Klub klub = new Klub("Klub Sepak Bola Garuda");

        Anggota a1 = new Anggota("Andi");

        klub.tambahAnggota(a1);
        
        klub = null;

        a1.infoAnggota();
    }
}

