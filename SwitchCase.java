/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SwitchCase {
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter Id : ");
        int id=in.nextInt();
        
        switch(id)
        {
            case 123:{
                Scanner out=new Scanner(System.in);
                System.out.print("Enter name : ");
                String name=out.next();
                System.out.print("Approved : ");
                System.out.println(name.equals("vishnu")||name.equals("VISHNU"));
                break;
        }
            case 456:{
                Scanner le=new Scanner(System.in);
                System.out.print("Enter name : ");
                String name=le.next();
                System.out.print("Approved : ");
                System.out.println(name.equals("tom")||name.equals("TOM"));
                System.out.println("Keestu")
                break;
            }
            default:
                System.out.println("invalid id");
                break;
            
        
        
                
                
                
                
               
                
        
        
    }
    
}
}
    

