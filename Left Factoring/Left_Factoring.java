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
public class Left_Factoring {
    
    String Find_common(String str0, String str1){
        
        int f = 0;
        int ff = 0;
        while(true){
            if(!str1.contains(str0)){
                f++;
            }else{
                ff = 0;
                if(str1.indexOf(str0)==0)
                    return str0;
                else{
                    StringBuilder sb = new StringBuilder(str0);
                    sb.deleteCharAt(str0.length()-1);
                    str0 = sb.toString();ff++;
                }
            }
            if(ff>0)continue;
            if(f>0){
                StringBuilder sb = new StringBuilder(str0);
                sb.deleteCharAt(str0.length()-1);
                str0 = sb.toString();
            }
            if(str0.length()==0)return null;
        }
    }
    
    public static void main(String[] args) {
        Left_Factoring ob = new Left_Factoring();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Starting State: ");
        String S = input.next();
        
        System.out.print("Input the number of production: ");
        int n = input.nextInt();
        
        System.out.println("Input "+n+" Production:");
        String[] str = new String[++n];
        for(int i=0; i<n; i++){
            str[i] = input.nextLine();
        }
        System.out.println("");
        String st = ob.Find_common(str[1], str[2]);
        
        if(st == null){
            System.out.print(S+" -> ");
            for(int i=1; i<n; i++){System.out.print(str[i]);
                if(i<n-1)System.out.print("|");
            }
        }else{
            int N = st.length();
            System.out.print(S+" -> "+st+" "+S+"'"); 
            for(int i=1; i<n; i++){
                if(str[i].length() < N){
                    System.out.print("|"+str[i]);
                }
            }System.out.println("");
            
            System.out.print(S+"' -> ");
            int t = 0;
            for(int i=1; i<n; i++){                
                if(str[i].length() > N){                  
                    char[] ch = str[i].toCharArray();                   
                    if(t>0)System.out.print("|");
                    for(int j=N; j<str[i].length(); j++){
                        System.out.print(ch[j]);t++;
                    }
                }else if(str[i].length() == N){
                    if(t>0)System.out.print("|");
                    System.out.print("Ɛ");t++;
                }
            }
        }System.out.println("");
    }
}
