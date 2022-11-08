/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int n1,n2,n3;
        
        System.out.print("masukan angka 1 = ");
        n1=scan.nextInt();
        System.out.print("masukan angka 2 = ");
        n2=scan.nextInt();
        System.out.print("masukan angka 3 = ");
        n3 = scan.nextInt();
        
        int kali = n1*n2*n3;
        System.out.println("hasil = "+ kali);
        
        }
}