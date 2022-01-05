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
public class Eighteen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("input first binary:");
        String num1 = sc.nextLine();
        
        System.out.println("input secong binary:");
        String num2 = sc.nextLine();
        
        int decNum1 = Integer.parseInt(num1, 2);
        
        int decNum2 = Integer.parseInt(num2, 2);
        
        int result = decNum1 * decNum2;
        
        String multyBin = Integer.toBinaryString(result);
        
        System.out.println("the binary result is:" + multyBin);
    }
    
}
