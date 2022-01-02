/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic;

/**
 *
 * @author meher
 */
import java.util.*;
public class ThirtyFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the side:");
        double num = sc.nextDouble();
        
        double area = (3*Math.sqrt(3)/2)* num*num;
        
        System.out.println("The area is:" + area);
    }
    
}
