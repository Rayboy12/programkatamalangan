

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEXIS
 */
public class apspembalik {
    public static void main(String[] args) {
         String huruf;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan sebuah string: ");
    huruf = scanner.nextLine();
    char[] array = huruf.toCharArray();
    int jumlah = array.length-1;
    
    for (int i = jumlah; i >= 0; i--) {
      if(array[i] == 'n' && array[i + 1] == 'g'){
          System.out.print(array[i+1]);
      }else if(array[i] == 'g' &&  array[i-1] == 'n'){
          System.out.print(array[i - 1]);
      } else if(array[i] == 'n' && array[i + 1] == 'y'){
          System.out.print(array[i+1]);
      }else if(array[i] == 'y' &&  array[i-1] == 'n'){
          System.out.print(array[i - 1]);
      } else {
          System.out.print(array[i]);
      }
    }
        System.out.println("\n");
  }
}
      
      
 

