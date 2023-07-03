/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author LAB-MM
 */
public class latihan3 {
    public static void main(String[] args){
        int a,b,c,n1,n2;
        Scanner Keyboard = new Scanner (System.in);
        System.out.println("Masukkan nilai A = "); a = Keyboard.nextInt();
        System.out.println("Masukkan nilai B = "); b = Keyboard.nextInt();
        System.out.println("Masukkan nilai C = "); c = Keyboard.nextInt();
        
        n1 = (a > b) ?a:b;
        n2 = (n1 > c)?n1:c;
        System.out.println("Nilai tertinggi = "+n2);
    }
}
