/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class soal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        StringBuffer KataBalik;
        
        System.out.print("Masukkan Kata : ");
        KataBalik = new StringBuffer(masukan.nextLine());
        
        System.out.print("Kata setelah dibalik : ");
        System.out.println(KataBalik.reverse());
    }
    
}
