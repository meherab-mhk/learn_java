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
public class TweentySeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("input a octal number:");
        String oct = sc.nextLine();
        
        int dec = Integer.parseInt(oct, 8);
        
        String decTohex = Integer.toHexString(dec);
        
        System.out.println("the binary is:" + decTohex);
    }
    
}
