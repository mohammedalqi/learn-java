/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muhammadalqi.mhs;

/**
 *
 * @author Muhammad Alqi
 */
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        
        //Memanggil class Mahasiswa
        Mahasiswa getMahasiswa = new Mahasiswa();
        
        //Memanggil method
        getMahasiswa.membaca();
        getMahasiswa.nyontek();
        getMahasiswa.modifikasi();
    }
}
