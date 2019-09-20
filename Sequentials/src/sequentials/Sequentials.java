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
public class Sequentials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cari;
        boolean found = false;
        String [] data = new String [] {"MAKANAN","MINUMAN","CAMILAN","SEGAR","DINGIN","MURAH","MAHAL"};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Data Yang Ingin Di Cari");
        cari = input.nextLine();
        for(int i = 0; i<data.length;i++){
            if(cari == data[i]){
                found = true;
                break;
            }
        }
        if (found == true ){
            System.out.println("Data ditemukan!");
            
        }else{
            System.out.println("data tidak ditemukan!");
            
        }
    }
    
}
