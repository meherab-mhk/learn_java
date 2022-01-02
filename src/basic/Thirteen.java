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
public class Thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input Width:");
        float width = sc.nextFloat();
        
        System.out.println("Input Height:");
        float height = sc.nextFloat();
        
        float area = height*width;
        float perimeter = 2*(height+width);
        
        System.out.println("area is:" + width + "*" + height + " = " + area);
        System.out.println("perimeter is: 2*(" + width + "+" + height + ") = " + perimeter);
        
        
    }
}
