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
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        
        Matematika getMTK = new Matematika();
        MatematikaCanggih  getMTK1 = new MatematikaCanggih();
        MatematikaCanggihBanget getMTK2 = new MatematikaCanggihBanget();
        
        getMTK.hitPertambahan(100, 200);
        getMTK.hitPerkalian(20, 50);
        getMTK1.hitModulus(5, 2);
        getMTK2.hitPertambahanTiga(100, 200, 300);
    }
}
