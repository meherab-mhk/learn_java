/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.*;
public class Seven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Input a number:");
        int num = sc.nextInt();
        
//        System.out.println(num + "*" + "1" + "=" + (num*1));
//        System.out.println(num + "*" + "2" + "=" + (num*2));
//        System.out.println(num + "*" + "3" + "=" + (num*3));
//        System.out.println(num + "*" + "4" + "=" + (num*4));
//        System.out.println(num + "*" + "5" + "=" + (num*5));
//        System.out.println(num + "*" + "6" + "=" + (num*6));
//        System.out.println(num + "*" + "7" + "=" + (num*7));
//        System.out.println(num + "*" + "8" + "=" + (num*8));
//        System.out.println(num + "*" + "9" + "=" + (num*9));
//        System.out.println(num + "*" + "10" + "=" + (num*10));
          
          for(int i=1; i<10; i++){
              System.out.println(num + "x" + i + "=" + (num*i));
                
        }
        
    }
}
