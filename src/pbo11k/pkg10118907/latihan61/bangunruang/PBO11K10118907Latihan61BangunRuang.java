/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan61.bangunruang;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menampilkan bangun ruang
 * 
 */
public class PBO11K10118907Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola b = new Bola();
        b.setR(7);
        System.out.println("Volume bola : "+b.hitungVolume()+" cm3");
        
        Tabung t = new Tabung();
        t.setR(10);
        t.setT(21);
        System.out.println("Volume tabung : "+t.hitungVolume()+" cm3");
        
        Kerucut k = new Kerucut();
        k.setR(14);
        k.setT(9);
        System.out.println("Volume kerucut : "+k.hitungVolume()+" cm3");
    }
    
}
