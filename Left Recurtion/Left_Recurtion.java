 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler_lab;

import java.util.Scanner;

/**
 *
 * @author MDTus
 */

public class Left_Recurtion {
    
    void Left_recursion(String str){
        int n = str.length();
        char a = str.charAt(0);
        int F=0; 
        int t=0; 
        if(str.contains("|")){
            t = str.indexOf("|");
            F++;
        }
        char[] ch = str.toCharArray();
        if(F>0){
            if(ch[5] == a){
                System.out.println("GRAMMAR : : : "+str+" in left recursive...!");
                System.out.print(a+" -> ");
                for(int j=t+1; j<n; j++){System.out.print(ch[j]);}
                System.out.println(a+"'");

                System.out.print(a+"' -> ");
                for(int j=6; j<t; j++){
                    System.out.print(ch[j]);
                }System.out.println(a+"'|Ɛ");
                System.out.println();
            }else{
                System.out.println("GRAMMAR : : : "+str+" is not left recursive..!\n");
            }
        }else if(F==0){
            if(ch[5] == a){
                System.out.println("GRAMMAR : : : "+str+" in left recursive...!");
                System.out.println(a+" -> "+a+"'");

                System.out.print(a+"' -> ");
                for(int j=6; j<n; j++){
                    System.out.print(ch[j]);
                }System.out.println(a+"'|Ɛ");
                System.out.println();
            }else{
                System.out.println("GRAMMAR : : : "+str+" is not left recursive..!\n");
            }
        }
    }
        
        
    public static void main(String[] args) {
        Left_Recurtion ob = new Left_Recurtion();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Production: ");
        int n = input.nextInt();
        String[] str = new String[++n];
        System.out.println("Enter The grammar as E -> E-A or E -> E-A|a "
                + "(not more then one '|' sine):");
        for(int i=0; i<n; i++){
            str[i] = input.nextLine();
        }System.out.println("");
        
        for(int i=1; i<n; i++){
            ob.Left_recursion(str[i]);
        } 
    }
}
