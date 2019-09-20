/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentials;



/**
 *
 * @author H4NS
 */
public class Sequentprak_2 {
    public static void main(String[] args) {
        int cari;
        double rata = 0;
        int [] data= new int[]{ 83, 76, 45, 90, 85, 80, 78, 74};
        System.out.println("Data Pada Array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
       
        
         for(int j = 0; j < data.length; j++)rata+=data[j];
         rata/=data.length;
         System.out.println("\nratarata = " +rata);
         for(int k = 0; k < data.length;k++){
             if (data[k] > rata){
             System.out.println("Nilai Yang Di atas Rata-Rata " + data[k]);
             }
         }
       
    }
    
    
}
