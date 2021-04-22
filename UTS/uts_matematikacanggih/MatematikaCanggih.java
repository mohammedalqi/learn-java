/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muhammadalqi.uts_matematikacanggih;

/**
 *
 * @author Muhammad Alqi
 */
public class MatematikaCanggih {
    int hitung;
    
    //Perhitungan Integer dengan 2 parameter
    void hitPertambahan(int a, int b){
        hitung = a+b;
        System.out.println("Hasil dari " + a + "+" + b + " adalah: " + getHitung());
    }
    
    void hitPerkalian(int a, int b){
        hitung = a*b;
        System.out.println("Hasil dari " + a + "*" + b + " adalah: " + getHitung());
    }
    
    void hitPengurangan(int a, int b){
        hitung = a-b;
        System.out.println("Hasil dari " + a + "-" + b + " adalah: " + getHitung());
    }
    
    void hitPembagian(int a, int b){
        hitung = a/b;
        System.out.println("Hasil dari " + a + "/" + b + " adalah: " + getHitung());
    }
    
    void hitModulus(int a, int b){
        hitung = a%b;
        System.out.println("Hasil dari " + a + "/" + b + " adalah: " + getHitung());
    }
    
    int getHitung(){
        return hitung;
    }
}
