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
public class Matematika {
    
    int kalkulasi;
    double kalkulasi1;
    
    //Perhitungan Integer dengan 2 parameter
    void hitPertambahan(int a, int b){
        kalkulasi = a+b;
        System.out.println("Hasil dari " + a + "+" + b + " adalah: " + getKalkulasi());
    }
    
    void hitPerkalian(int a, int b){
        kalkulasi = a*b;
        System.out.println("Hasil dari " + a + "*" + b + " adalah: " + getKalkulasi());
    }
    
    void hitPengurangan(int a, int b){
        kalkulasi = a-b;
        System.out.println("Hasil dari " + a + "-" + b + " adalah: " + getKalkulasi());
    }
    
    void hitPembagian(int a, int b){
        kalkulasi = a/b;
        System.out.println("Hasil dari " + a + "/" + b + " adalah: " + getKalkulasi());
    }
    
    //Perhitungan Integer  3 parameter
    void hitPertambahan(int a, int b, int c){
        kalkulasi = a+b+c;
        System.out.println("Hasil dari " + a + "+" + b + "+" + c + " adalah: " + getKalkulasi());
    }
    
    void hitPerkalian(int a, int b, int c){
        kalkulasi = a*b*c;
        System.out.println("Hasil dari " + a + "*" + b + "*" + c + " adalah: " + getKalkulasi());
    }
    
    void hitPengurangan(int a, int b, int c){
        kalkulasi = a-b-c;
        System.out.println("Hasil dari " + a + "-" + b + "-" + c + " adalah: " + getKalkulasi());
    }
    
    void hitPembagian(int a, int b, int c){
        kalkulasi = a/b/b;
        System.out.println("Hasil dari " + a + "/" + b + "/" + c + " adalah: " + getKalkulasi());
    }
    
    //Perhitungan Double 2 parameter
    void hitPertambahan(double a, double b){
        kalkulasi1 = a + b;
        System.out.println("Hasil dari " + a + "+" + b + " adalah: " + getKalkulasi1());

    }
    
    void hitPerkalian(double a, double b){
        kalkulasi1 = a * b;
        System.out.println("Hasil dari " + a + "*" + b + " adalah: " + getKalkulasi1());

    }
    
    void hitPengurangan(double a, double b){
        kalkulasi1 = a - b;
        System.out.println("Hasil dari " + a + "-" + b + " adalah: " + getKalkulasi1());

    }
    
    void hitPembagian(double a, double b){
        kalkulasi1 = a / b;
        System.out.println("Hasil dari " + a + "/" + b + " adalah: " + getKalkulasi1());

    }
    
    //Perhitungan Double 3 parameter
    void hitPertambahan(double a, double b, double c){
        kalkulasi1 = a + b + c;
        System.out.println("Hasil dari " + a + "+" + b + "+" + c + " adalah: " + getKalkulasi1());

    }
    
    void hitPerkalian(double a, double b, double c){
        kalkulasi1 = a * b * c;
        System.out.println("Hasil dari " + a + "*" + b + "*" + c + " adalah: " + getKalkulasi1());

    }
    
    void hitPengurangan(double a, double b, double c){
        kalkulasi1 = a - b - c;
        System.out.println("Hasil dari " + a + "-" + b + "-" + c + " adalah: " + getKalkulasi1());

    }
    
    void hitPembagian(double a, double b, double c){
        kalkulasi1 = a / b / c;
        System.out.println("Hasil dari " + a + "/" + b + "/" + c + " adalah: " + getKalkulasi1());

    }
    
    
    int getKalkulasi(){
        return kalkulasi;
    }
    
    double getKalkulasi1(){
        return kalkulasi1;
    }

}
