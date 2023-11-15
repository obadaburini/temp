/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;
import java.util.Scanner;
public class Q3 {
public static void FtoC(){
    Scanner input=new Scanner(System.in);
    System.out.println("enter the temb(in f)");
    double f=input.nextDouble();
    double c=(5.0/9.0)*(f-32);
    System.out.println("the result is:");
    System.out.println("Fahrenheit    celsius");
    System.out.println("----------    -------");
    System.out.println(f+"         "+c);
}
    public static void main(String[] args) { 
        FtoC();
    }
    
}
