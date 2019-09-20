/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentials;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Sequentials_2 {
     public static void main(String[] args) {
         int cari;
         boolean found = false;
         int [] data = new int [] {8,90,56,90,87,76,42};
         Scanner input = new Scanner (System.in);
         System.out.println("Masukkan data YAng Ingin Di Cari");
         cari = input.nextInt();
         for(int i = 0 ; i<data.length; i++){
             if (cari == data[i]){
                 found = true;
                 System.out.println("Data Ditemukan Pada indeks ke- " + i);
             }
         }
         if(found != true){
             System.out.println("Data Tidak Di Temukan !!!");
         }
         
     }
    
}
