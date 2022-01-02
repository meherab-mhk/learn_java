/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.*;
public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input any number:");
        float radius = sc.nextFloat();

        final float pi = 3.1416f;
        float perimeter = (2 * pi * radius);
        float area = (pi * radius*radius);
        
        System.out.println("Perimeter result is:" + perimeter);
        System.out.println("Area result is:" + area);
    }
}
