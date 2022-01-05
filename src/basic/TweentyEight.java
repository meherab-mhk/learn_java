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
public class TweentyEight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("the hexadecimal number is:");
        String hex = sc.nextLine();
        
        int dec = Integer.parseInt(hex, 16);
        
        System.out.println("the decimal is:" + dec);
    }
    
}
