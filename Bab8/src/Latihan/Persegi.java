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
public class Persegi extends Bangundatar{

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    private double sisi;
    @Override
    public double luas() {
        return (sisi*sisi);
    }

    @Override
    public double keliling() {
        return (4*sisi);
    }


    
}
