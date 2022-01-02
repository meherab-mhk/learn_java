/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;
import java.util.*;

public class Five {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Input First Number: ");
        int a =  sc.nextInt();
        System.out.println("Input Second Number:");
        int b = sc.nextInt();
        int c = a*b;
        System.out.println(a + "*" + b + '=' + c );
    }
}
