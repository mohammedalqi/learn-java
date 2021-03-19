/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muhammadalqi.matematika;

/**
 *
 * @author Muhammad Alqi
 */
public class Matematika {
    
    int kalkulasi;
    
    //Method pertambahan
    public void pertambahan(int a, int b){
        kalkulasi = a + b;
    }
    
    //Method pengurangan
    public void pengurangan(int a, int b){
        kalkulasi = a - b;
    }
    
    //Method perkalian
    public void perkalian(int a, int b){
        kalkulasi = a * b;
    }
    
    //Method pembagian
    public void pembagian(int a, int b){
        kalkulasi = a / b;
    }
    
    int getKalkulasi(){
        return kalkulasi;
    }
    
}
