/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muhammadalqi.hp;

/**
 *
 * @author Muhammad Alqi
 */
public class HandphoneBeraksi {
    public static void main(String[] args) {
        
        //Memanggil class Handphone
        Handphone getPhone = new Handphone();
        
        //Memanggil method pada class Handphone
        getPhone.hidupkan();
        getPhone.kirimSMS();
        getPhone.lakukanPanggilan();
        getPhone.matikan();
    }
}
