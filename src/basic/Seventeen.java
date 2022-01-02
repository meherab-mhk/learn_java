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
public class Seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("input first binary:");
        int num1 = sc.nextInt();
        
        System.out.println("input secong binary:");
        int num2 = sc.nextInt();
        
        int result = num1 + num2;
        
        Integer.toBinaryString(result);
        
        System.out.println(result);
    }
}
