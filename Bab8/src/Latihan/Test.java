/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Lk09Nu24Uty
 */
public class Test {
    public static void main(String[] args) {
        Bangundatar bd1 = new SegiTiga(10, 12, 15, 20, 15);
        bd1.luas();
        bd1.keliling();
        Bangundatar bd2 = new PersegiPanjang(10, 5);
        bd2.luas();
        bd2.keliling();
        Bangundatar bd3 = new Persegi(10);
        bd3.luas();
        bd3.keliling();
        Bangundatar bd4 = new Lingkaran(10);
        bd4.luas();
        bd4.keliling();
        
        System.out.println("keliling lingkaran = "+bd4.keliling()+" cm");
        System.out.println("luas lingkaran = "+bd4.luas()+" cm");
        System.out.println("");
        System.out.println("keliling segitiga = "+bd1.keliling()+" cm");
        System.out.println("luas segitiga = "+bd1.luas()+" cm");
        System.out.println("");
        System.out.println("keliling persegi panjang = "+bd2.keliling()+" cm");
        System.out.println("luas persegi panjang = "+bd2.luas()+" cm");
        System.out.println("");
        System.out.println("keliling persegi = "+bd3.keliling()+" cm");
        System.out.println("luas persegi = "+bd3.luas()+" cm");
        
        
    }
}
