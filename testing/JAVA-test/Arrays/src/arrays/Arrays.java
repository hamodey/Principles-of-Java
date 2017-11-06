/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Ahmed
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */   
    private static void printArray(int[] anArray) {
      for (int i = 0; i < anArray.length; i++) {
         if (i > 0) {
            System.out.print(", ");
         }
         System.out.print(anArray[i]);
      }
   }
    
   public static void main(String[] args) {
      int[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      printArray(testArray);
   }
    
}
