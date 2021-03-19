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
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika getNilai = new Matematika();
        
        getNilai.pertambahan(20, 20); //Mengatur nilai method pertambahan
        System.out.println("Pertambahan: 20+20 = " + getNilai.getKalkulasi());
        
        getNilai.pengurangan(10, 5); //Mengatur nilai method pengurangan
        System.out.println("Pengurangan: 10-5 = " + getNilai.getKalkulasi());
        
        getNilai.perkalian(10, 20); //Mengatur nilai method perkalian
        System.out.println("Perkalian: 10*20 = " + getNilai.getKalkulasi());
        
        getNilai.pembagian(21, 2); //Mengatur nilai method pembagian
        System.out.println("Pembagian: 21/2 = " + getNilai.getKalkulasi());
    }
}
