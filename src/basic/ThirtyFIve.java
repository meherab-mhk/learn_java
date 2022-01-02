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
import java.lang.Math.*;
public class ThirtyFIve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the number of sides on the polygon:");
        double numOfSide = sc.nextDouble();
        
        System.out.println("Input the length of one of the sides:");
        double lenOfOneSide = sc.nextDouble();
        
        double area = (numOfSide*(lenOfOneSide*lenOfOneSide))/(4*java.lang.Math.tan(Math.PI/numOfSide));

        System.out.println("the area is:" + area);
    }
}
