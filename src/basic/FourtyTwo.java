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
public class FourtyTwo {

    public static void main(String[] args) {
        Console con = System.console();

        if(con == null){
            System.out.println("No console available");
        }

        char[] ch = con.readPassword("Enter your password:");
        String  pass = String.valueOf(ch);

        System.out.println("Your password is:" + pass);
    }
    
}
