/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muhammadalqi.bank;

/**
 *
 * @author Muhammad Alqi
 */
public class Bank{
    int saldo;
    
    //Membuat konstruktor Bank
    public Bank(int saldo){
        this.saldo = saldo;
        System.out.println("Selamat Datang di Bank ABC"); //Welcoming text
        System.out.println("Saldo Anda Saat Ini Adalah: Rp." + saldo);
    }
    
    //Membuat method Simpan Uang
    public void simpanUang(int sisaSaldo){
       saldo = this.saldo + sisaSaldo;
       System.out.println("Simpan Uang : " + sisaSaldo);
       System.out.println("Saldo Anda Saat Ini Adalah: Rp." + saldo);
    }
    
    //Membuat method ambil uang
    public void ambilUang(int sisaSaldo){
        saldo = this.saldo - sisaSaldo;
        System.out.println("Ambil Uang : " + sisaSaldo);
        System.out.println("Saldo Anda Saat Ini Adalah: Rp." + saldo);
    }
    
    public int getSaldo(){
        return saldo;
    }
}
