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
public class MatematikaCanggihBeraksi {
    
    public static void main(String[] args) {
        
    Matematika getNilaiMTK = new Matematika();
    MatematikaCanggih getMTKCanggih = new MatematikaCanggih();
    
    //Hitung pertambahan
    getNilaiMTK.hitPertambahan(100,200);
    
    //Hitung perkalian
    getNilaiMTK.hitPerkalian(22, 5);
        
    //Hitung Modulus
    getMTKCanggih.hitModulus(5, 2);
    }
    
}
