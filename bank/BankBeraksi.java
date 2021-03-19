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
public class BankBeraksi {
    public static void main(String[] args) {
        
        Bank getBank = new Bank(100000); //set saldo utama
        getBank.simpanUang(500000); //set simpan Uang
        getBank.ambilUang(150000); //set pengambilan uang
       
    }
}
