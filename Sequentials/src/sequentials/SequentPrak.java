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
public class SequentPrak {
     public static void main(String[] args) {
         int cari; boolean found= true;
         boolean notFound = false;
         int [] data = new int []{74    ,   98  ,   72  ,   74  ,   72  ,   90  ,   81  ,   72  };
         System.out.println("Data Pada Array");
         System.out.println("\n 74  98  72  74  72  90  81  72"); 
         Scanner input = new Scanner(System.in);
         System.out.println("Masukkan nlai Yang Ingi Di masukkan");
         cari =input.nextInt();
         
         for(int i = 0 ; i<data.length; i++){
             if (cari == data[i]){
                 found = true;
                 System.out.println("Data Ditemukan Pada indeks ke- " + i);
                 
             }
         }
         if( found != false){
             System.out.println("Data Tidak Di Temukan !!!");
         }
         
     }
}

