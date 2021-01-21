/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenishewan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Pengelompokan {
    //deklarasi variabel
    String nama;
    String makanan;
    String golongan;
    
    //method isi
    void isi() {
        //proses input data
        Scanner input = new Scanner(System.in);

        //inisialisasi Variabel
        System.out.print("Masukan Nama Hewan Tersebut\t\t:");
        nama = input.nextLine();
        System.out.print("Masukan Jenis Makanan Hewan Tersebut\t:");
        makanan = input.nextLine();
        System.out.print("Masukan angka Pilihan 1-3\n1.Beranak\n2.Bertelur\n3.Beranak dan Bertelur\nHewan Tersebut Berkembang Biak Dengan\t: ");
        golongan = input.nextLine();
        System.out.println("=======================");
        System.out.println("Dapat Disimpulkan Bahwa");
        System.out.println("=======================");
        
        //Perulangan Menggunakan if else dan switch case
        if (makanan.equalsIgnoreCase("daging")) {
            System.out.println("Hewan Ini Tergolong Hewan Karnivora");
        } else if (makanan.equalsIgnoreCase("tumbuhan")) {
            System.out.println("Hewan Ini Tergolong Hewan Herbivora");
        } else if (makanan.equalsIgnoreCase("segala")) {
            System.out.println("Hewan Ini Tergolong Hewan Omnivora");
        }else{
            System.out.println("eror");
        }
        switch (golongan) {
            case "1":
                System.out.println("Hewan Ini Tergolong Hewan Vivipar");
                break;
            case "2":
                System.out.println("Hewan Ini Tergolong Hewan Ovipar");
                break;
            case "3":
                System.out.println("Hewan Ini Tergolong Hewan Ovovivipar");
                break;
        }
        System.out.println();
    }
    // method aktivitas
    void aktivitas(){
        System.out.println("Nama Hewan Tersebut Adalah : "+nama);
        System.out.println("Aktivitas Rutin Hewan Tersebut Adalah");
        //perulangan sebanyak 3 kali
        for(int i=0; i<3; i++){
            System.out.println("Makan,,Tidur");
        }
    }
}
