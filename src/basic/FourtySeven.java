/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic;

/**
 *
 * @author meher
 */
import java.text.SimpleDateFormat;  
import java.util.*;  
public class FourtySeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  
        Date date = new Date();  
        System.out.println("Now:" + formatter.format(date)); 
    }
    
}
