/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Utama{
    public static void main(String[] args){
        
        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi(8);
        Segitiga segitiga = new Segitiga(8, 4);
        Lingkaran lingkaran = new Lingkaran(40);
        
        bangunDatar.luas();
        System.out.println("Luas persegi\t\t: " + persegi.luas());
        System.out.println("Luas segitiga\t\t: " + segitiga.luas());
        System.out.println("Luas Lingkaran\t\t: " + lingkaran.luas());
        
        bangunDatar.keliling();
        System.out.println("Keliling persegi\t: " + persegi.keliling());
        System.out.println("Keliling segitiga\t: " + segitiga.keliling());
        System.out.println("Keliling lingkaran\t: " + lingkaran.keliling());
    }
}
