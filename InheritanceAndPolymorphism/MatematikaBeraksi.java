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
public class MatematikaBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih getMTKCanggih = new MatematikaCanggih();
        
        //Pertambahan
        System.out.println("\n--Pertambahan--");
        getMTKCanggih.hitPertambahan(12.5, 28.7, 14.2);
        getMTKCanggih.hitPertambahan(12, 28, 14);
        getMTKCanggih.hitPertambahan(23, 24);
        getMTKCanggih.hitPertambahan(3.4, 4.9);
        
        //Perkalian
        System.out.println("\n--Perkalian--");
        getMTKCanggih.hitPerkalian(12.5, 28.7, 14.2);
        getMTKCanggih.hitPerkalian(12, 28, 14);
        getMTKCanggih.hitPerkalian(23, 24);
        getMTKCanggih.hitPerkalian(3.4, 4.9);
        
        //Pengurangan
        System.out.println("\n--Pengurangan--");
        getMTKCanggih.hitPengurangan(12.5, 28.7, 14.2);
        getMTKCanggih.hitPengurangan(12, 28, 14);
        getMTKCanggih.hitPengurangan(23, 24);
        getMTKCanggih.hitPengurangan(3.4, 4.9);
        
        //Pembagian
        System.out.println("\n--Pembagian--");
        getMTKCanggih.hitPembagian(12.5, 28.7, 14.2);
        getMTKCanggih.hitPembagian(12, 28, 14);
        getMTKCanggih.hitPembagian(23, 24);
        getMTKCanggih.hitPembagian(3.4, 4.9);
        
        //Perkalian
        System.out.println("\n--Perkalian--");
        getMTKCanggih.hitPembagian(12.5, 28.7, 14.2);
        getMTKCanggih.hitPembagian(12, 28, 14);
        getMTKCanggih.hitPembagian(23, 24);
        getMTKCanggih.hitPembagian(3.4, 4.9);
        
        //Mdoulus
        System.out.println("\n--Modulus--");
        getMTKCanggih.hitModulus(12.5, 28.7, 14.2);
        getMTKCanggih.hitModulus(12, 28, 14);
        getMTKCanggih.hitModulus(23, 24);
        getMTKCanggih.hitModulus(3.4, 4.9);
    }
}
