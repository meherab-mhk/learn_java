/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.*;
public class Six {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Input first number:");
        int a = sc.nextInt();
        
        System.out.println("Input second number:");
        int b = sc.nextInt();
        
        int add = a+b;
        int sub = a-b;
        int multiply = a*b;
        int divide = a/b;
        int mod = a%b;
        System.out.println("The Expected output:");
        System.out.println(a + "+" + b + "=" + add);
        System.out.println(a + "-" + b + "=" + sub);
        System.out.println(a + "*" + b + "=" + multiply);
        System.out.println(a + "/" + b + "=" + divide);
        System.out.println(a + "%" + b + "=" + mod);
       
    }
}
