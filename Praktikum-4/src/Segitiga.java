/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Segitiga extends BangunDatar{
    private int alas;
    private int tinggi;
    
    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public float luas(){
        return this.alas * this.tinggi;
    }
    @Override
    public float keliling(){
        return this.alas * 3;
    }
}
