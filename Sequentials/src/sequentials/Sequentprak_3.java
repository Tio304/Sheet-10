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
public class Sequentprak_3 {
     public static void main(String[] args) {
         int kelipatan;
            int [] data= new int[]{92,  98 ,   78  , 76  , 72 , 84 , 101 , 39};
         System.out.println("Data Pada Array : ");
         for(int i =0; i<data.length;i++){
             System.out.print(data[i]+"\t");
             
         }
         for (int j=0; j<data.length;j++){
               if(data[j]%3 == 0){
                   System.out.println(" Nilai Yang Kelipatan 3 Adalah \n " +  data[j]);
               }

         }
                        
         
         
         
         
         
                 
     }
}
    
