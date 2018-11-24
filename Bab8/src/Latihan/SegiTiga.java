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
public class SegiTiga extends Bangundatar{
    private double sisiA;
    private double sisiB;
    private double sisiC;
    private double alas;
    private double tinggi;

    public SegiTiga(double sisiA, double sisiB, double sisiC, double alas, double tinggi) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double luas() {
        return ((alas*tinggi)/2);
    }

  
    @Override
    public double keliling() {
        return (sisiA+sisiB+sisiC);
    }
}
