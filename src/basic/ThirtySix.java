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
//import java.lang.*;
public class ThirtySix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the latitude of coordinate 1:");
        double x1 = sc.nextDouble();
        
        System.out.println("Input the longitude of coordinate 1:");
        double y1 = sc.nextDouble();
        
        System.out.println("Input the latitude of coordinate 2:");
        double x2 = sc.nextDouble();
        
        System.out.println("Input the longitude of coordinate 2:");
        double y2 = sc.nextDouble();
        System.out.println("The distance is :" + distance(x1,x2,y1,y2));
        
    }
    public static double distance(double x1, double y1, double x2, double y2){
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        
    double earthRadius = 6371.01;
    return earthRadius * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1 - y2));
    }
    
}
