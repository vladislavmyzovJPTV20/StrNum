/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strnum;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class StrNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String firstString = scanner.nextLine();
        char [] charFirstString = firstString.toCharArray();
        char [] charSecondString = new char[charFirstString.length];
        for(int i = 0; i < charFirstString.length; i++) {
            charSecondString[(charFirstString.length-1)-i]=charFirstString[i];
            
        }
        String secondString = new String(charSecondString);
        System.out.print("Введённая строка наоборот: ");
        System.out.println(secondString);
    }
    
}
