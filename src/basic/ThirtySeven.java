/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic;

/**
 *
 * @author meher
 */
import java.lang.*;
import java.io.*;
import java.util.*;

public class ThirtySeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input String line:");
        String line = sc.nextLine();
        
        StringBuffer stringReverse = new StringBuffer(line);
        System.out.println("string is :" + stringReverse);
        
        
        stringReverse.reverse();
        System.out.println("after reverse:" + stringReverse);
        
    }
    
    
}
