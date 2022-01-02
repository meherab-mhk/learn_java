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
public class ThirtyThree {

    /**
     * @param args the command line arguments
     */
    
    public static int sum(int num){
        int sum = 0;
        while(num != 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter you digit:");
        int digit = sc.nextInt();
        
        System.out.println("the sum of the digit is: "+ sum(digit));
    }
    
}
