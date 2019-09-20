/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentials;

import java.util.Scanner;

/**
 *
 * @author H4NS
 */
public class Sequentprak_4 {
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
   int b= 0;
 for(int j = 0; j<cari.length();j++){
     if (cari.charAt(j) == 'i'){
         b++;
     }

 }
 int c =0;
 for(int k= 0; k < cari.length();k++){
     if(cari.charAt(k)=='u'){
         c++;
     }
 }
             int d =0;
             for(int l =0; l < cari.length();l++){
                if(cari.charAt(l)=='e'){
                    d++;
                } 
             }
int e =0;
for(int m=0;m<cari.length();m++){
    if(cari.charAt(m)=='o'){
        e++;
    }
}

       System.out.println("Jumlan Huruf 'a' "+a);
        System.out.println("Jumlan Huruf 'i' "+b);
         System.out.println("Jumlan Huruf 'u' "+c);
          System.out.println("Jumlan Huruf 'e' "+d);
           System.out.println("Jumlan Huruf 'o' "+e);
 
     
      

 
}
    