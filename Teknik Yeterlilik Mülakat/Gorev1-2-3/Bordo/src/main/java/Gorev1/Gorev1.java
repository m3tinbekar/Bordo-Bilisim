/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gorev1;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author metin
 */
public class Gorev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelime giriniz:");
        String girilenKelime = scan.nextLine();
        String girilenKelimeTers = "";
        
        
        
        for (int i = girilenKelime.length()-1; i >=0 ; i--) {
            girilenKelimeTers=girilenKelimeTers+girilenKelime.charAt(i);
        }

        if (girilenKelime.toLowerCase().replaceAll("\\s","").equals(girilenKelimeTers.toLowerCase().replaceAll("\\s",""))) {
            
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
    
}
