/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author meher
 */
import java.util.*;
public class Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input first number:");
        float a = sc.nextFloat();
        
        System.out.println("Input second number:");
        float b = sc.nextFloat();
        
        System.out.println("Input third number:");
        float c = sc.nextFloat();
        
        float avg = (a+b+c)/3;
        System.out.println("Total average is:" + avg);

        
    }
}
