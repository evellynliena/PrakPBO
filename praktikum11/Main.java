/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author evell
 */
class Pengarang {
    private String namaPengarang;

    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public void infoPengarang() {
        System.out.println("Pengarang: " + namaPengarang);
    }
}

class Buku {
    private String judul;
    private Pengarang pengarang;

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        pengarang.infoPengarang();
    }
}

class Perpustakaan {
    private Buku[] daftarBuku;   
    private int index;           

    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];
        index = 0;
    }

    public void tambahBuku(Buku buku) {
        if (index < daftarBuku.length) {
            daftarBuku[index] = buku;
            index++;
        } else {
            System.out.println("Perpustakaan penuh, tidak dapat menambah buku lagi.");
        }
    }

    public void infoPerpustakaan() {
        System.out.println("Daftar Buku di Perpustakaan :");
        for (int i = 0; i < index; i++) {
            daftarBuku[i].infoBuku();
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Pengarang p1 = new Pengarang("F. Scott Fitzgerald");
        Pengarang p2 = new Pengarang("Jane Austen");

        Perpustakaan perpustakaan = new Perpustakaan(5);

        Buku b1 = new Buku("The Great Gatsby", p1);
        Buku b2 = new Buku("Pride and Prejudice", p2);

        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);
        
        perpustakaan = null;

        p1.infoPengarang(); 
        p2.infoPengarang();
    }
}

