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
public class TweentyFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input binary is:");
        String bin = sc.nextLine();
        
        int binTodec = Integer.parseInt(bin);
        
        String oct = Integer.toString(binTodec, 8);
        
        System.out.println("the octal is:" + oct);
    }
    
}
