/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic;

/**
 *
 * @author meher
 */
public class Fifty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Divide by 3:");
        for(int i = 1; i < 100; i++) {
            if(i%3 == 0){
                System.out.print(i+ ", ");
            }
        }
        System.out.println("\nDivide by 5:");
        for(int i = 1; i < 100; i++) {
            if(i%5 == 0){
                System.out.print(i+ ", ");
            }
        }
        System.out.println("\nDivide by 3 & 5:");
        for(int i = 1; i < 100; i++) {
            if(i%3 == 0 && i%5 == 0){
                System.out.print(i+ ", ");
            }
        }
    }
    
}
