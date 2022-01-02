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
public class FourtyNine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
    
}
