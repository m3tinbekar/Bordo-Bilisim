/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gorev2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author metin
 */
public class Gorev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Cümle giriniz:");
        String input = scan.nextLine();
        String conjunction[] = {"ama","ve","veya","göre","ile","yalnız","ise","ne","nasıl","ancak","çünkü","neden","oysa","için"};
        String character =  ".?,;!abcçdefgğhıijklmnoöprsştuüvyzwxq0123456789";
        String inputChar = input;
        inputChar=inputChar.toLowerCase();
        int count [] = new int[character.length()];

        //Ben şuan staj başvurumun kabülü için verilen görevleri yapıyorum ve Bordo firmasının bir üyesi olmak istiyorum.
            
        
        String text[] = input.split(" ");
        String reverse = "";
        for (int i = 0; i <inputChar.length(); i++)
           {
               int index = character.indexOf(inputChar.charAt(i));
               if (index < 0)
                   
                   continue;
               else
               {
                   count[index]++;
               }
           }
           for (int i = 0; i < count.length; i++)
           {
               
               if (count[i] < 1)
                   continue;
               else
               {
                   System.out.println(character.charAt(i)+" "+count[i]);
               }
           }
          
        for (int i = 0; i < text.length; i++) {
            
            for (int j = 0; j < conjunction.length; j++) {
                
                
                if (text[i].equals(conjunction[j])) {
                    
                    
                     for (int k = conjunction[j].length()-1; k >=0 ; k--) {
                        reverse=reverse+text[i].charAt(k); 
                    }
                     text[i] = reverse;
        
                    
                }
                reverse="";
                
            }
        }
        
        Collections.reverse(Arrays.asList(text)); 
        
        
        System.out.println(String.join(" ",text));
        
        
        
    }
    static void charCount(){
        
    }
    
}

