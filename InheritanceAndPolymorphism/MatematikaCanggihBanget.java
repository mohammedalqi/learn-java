/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muhammadalqi.InheritanceAndPolymorphism;

/**
 *
 * @author Muhammad Alqi
 */
public class MatematikaCanggihBanget extends MatematikaCanggih {
    
    void hitPertambahanTiga(int a, int b, int c){
        kalkulasi = a + b + c;
        System.out.println("Hasil dari " + a + "+" + b + "+" + c + " adalah: " + getKalkulasi());
    }
}
