/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.objek;

/**
 *
 * @author adiwi
 */
public class Hewan {
    String nama;
        int berat;
        int jumlahKaki;
        
        public Hewan(String namaHewan) {
            nama = namaHewan;
        }
        
        public void beratHewan(int beratHewan) {
            berat = beratHewan;
        }
        public void jumlahKakiHewan(int jumlahKakiHewan) {
           jumlahKaki = jumlahKakiHewan;
        }
        
        public void cetakHewan() {
            System.out.println("Nama Hewan : " + nama);
            System.out.println("Berat Hewan : " + berat + " kg");
            System.out.println("Jumlah kaki: " + jumlahKaki);
        }
}
