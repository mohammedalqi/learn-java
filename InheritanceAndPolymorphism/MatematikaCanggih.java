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
public class MatematikaCanggih extends Matematika {
    
    //Perhitungan Integer dan Double 2 Paramater
    void hitModulus(int a, int b){
        kalkulasi = a%b;
        System.out.println("Hasil dari " + a + "%" + b + " adalah: " + getKalkulasi());
    }
    
    void hitModulus(double a, double b){
        kalkulasi1 = a%b;
        System.out.println("Hasil dari " + a + "%" + b + " adalah: " + getKalkulasi1());

    }
    
    
    //Perhitungan Integer dan Double 3 Parameter
    void hitModulus(int a, int b, int c){
        kalkulasi = a%b%c;
        System.out.println("Hasil dari " + a + "%" + b + "%" + c + " adalah: " + getKalkulasi());
    }    
    
    void hitModulus(double a, double b, double c){
        kalkulasi1 = a%b%c;
        System.out.println("Hasil dari " + a + "%" + b + "%" + c + " adalah: " + getKalkulasi1());
    }
    
}
