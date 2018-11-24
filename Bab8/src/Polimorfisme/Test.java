/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

/**
 *
 * @author Lk09Nu24Uty
 */
public class Test {
    public static void main(String[] args) {
        Hewan hwn1 = new Anjing();
        hwn1.bicara();
        Hewan hwn2 =  new Kambing();
        hwn2.bicara();
        Hewan hwn3 = new Kucing();
        hwn3.bicara();
    }
}
