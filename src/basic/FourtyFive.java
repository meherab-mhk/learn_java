/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic;

/**
 *
 * @author meher
 */
import java.io.*;
public class FourtyFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName = "word.txt";
        
        File f = new File(fileName);
        long fileSize = f.length();

        System.out.println("The file size is:" + fileSize + " bytes");
    }
    
}
