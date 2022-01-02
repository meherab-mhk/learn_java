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
public class ThirtyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first integer:");
        int num1 = sc.nextInt();

        System.out.println("Input second integer:");
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("numbers matched!!!");
        }
        if(num1 != num2){
            System.out.println(num1 + "!=" + num2);
        }
        if(num1 > num2){
            System.out.println(num1 + ">" + num2);
        }
        if(num1 < num2){
            System.out.println(num1 + "<" + num2);
        }
        if(num1 >= num2){
            System.out.println(num1 + ">=" + num2);
        }
        if(num1 <= num2){
            System.out.println(num1 + "<=" + num2);
        }
    }
}
