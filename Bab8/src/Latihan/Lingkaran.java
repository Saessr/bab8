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
public class Lingkaran extends Bangundatar{

    public Lingkaran(double r) {
        this.r = r;
    }
    private double r;
    @Override
    public double luas() {
        return (3.14*r*r);
    }
    @Override
    public double keliling() {
        return (2*3.14*r);
    }

}
