
package compiler_lab;

import java.util.Scanner;

public class CFG {
    void CFG(){
        System.out.println("Given CFG:");
        System.out.println("\t\tS\t->\tAB");
        System.out.println("\t\tA\t->\taA|a");
        System.out.println("\t\tB\t->\tbB|b");
    }
    boolean isa(String str){
        return str.contains("a");
    }
    boolean isb(String str){
        return str.contains("b");
    }
    boolean is_ab(String str){
        return str.contains("ab");
    }
    boolean ifba(String str){
        return !str.contains("ba");
    }
    boolean terminals(String str){
        char[] ch = str.toCharArray();
        int n = str.length();
        int c=0;
        for(int i=0; i<n; i++){
            switch (ch[i]) {
                case 'a':
                    break;
                case 'b':
                    break;
                default:
                    c++;
                    break;
            }
        }
        return c==0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CFG ob = new CFG();
        ob.CFG();
        System.out.print("Given String: ");
        String str = input.next();
        if(true == ob.terminals(str) && true == ob.isa(str) &&
                true == ob.is_ab(str) && true == ob.isb(str) &&
                true == ob.ifba(str)) {
            System.out.println("Accepted");
        } else System.out.println("Not Accepted");
    }
} 
