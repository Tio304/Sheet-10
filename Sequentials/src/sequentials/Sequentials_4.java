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
public class Sequentials_4 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       String cari;
       System.out.print("Masukkan Sebuah Kata/Kalimat: ");
       cari = input.nextLine();
       
       int a=0;
       for(int i =0; i<cari.length();i++){
           if (cari.charAt(i) == 'a'){
               a++;
           }
       }
       System.out.println("Jumlah Huruf a Pada Kalimat Di Atass Adalah " + a);
     }
}
