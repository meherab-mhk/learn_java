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
public class ThirtyEight {

    /**
     * @param args the command line arguments
     */
    public static void count(String x){
        
        char[] ch = x.toCharArray();
        int letter = 0;
        int number = 0;
        int space = 0;
        int other = 0;
        
        for(int i = 0; i <=x.length(); i++){
            if(Character.isLetter(ch[i])){
                letter++;
            }
            else if(Character.isDigit(ch[i])){
                number++;
            }
            else if(Character.isSpaceChar(ch[i])){
                space++;
            }
            else{
                other++;
            }
            System.out.println("Letter is:" + letter);
            System.out.println("Number is:" + number);
            System.out.println("spaces is:" + space);
            System.out.println("Other is: " + other);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("input a sentence:");
        String sentence = sc.nextLine();
        
        count(sentence);
        
        
        
    }
    
}
