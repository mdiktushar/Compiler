
package compiler_lab;

import java.util.Scanner;

public class Find_From_Code {
    void Function(String str,int n){

        char[] S = str.toCharArray();
        for(int i=0; i<n; i++){
            
            if(S[i] == '('){
                int j;
                for(j = i-1; ;j--){
                    if(S[j] == ' ')break;
                }
                for(int k=j+1; k<i; k++)System.out.print(S[k]);
                System.out.print("()\t");
            }
        }
    }
    
    void Variables(String str,int n){
        
        char[] S = str.toCharArray();
        if(str.contains("int  ")){
            for(int i=str.indexOf("int  ")+4; ;i++){
                if(S[i]==','){
                    System.out.print('\t');
                    continue;}
                if(S[i]==';')break;
                if(S[i]=='=')break;
                System.out.print(S[i]);
            }
        }
        
        if(str.contains("float  ")){
            for(int i=str.indexOf("float  ")+6; ;i++){
                if(S[i]==','){
                    System.out.print('\t');
                    continue;}
                if(S[i]==';')break;
                if(S[i]=='=')break;
                System.out.print(S[i]);
            }
        }
        
        if(str.contains("double  ")){
            for(int i=str.indexOf("double  ")+7; ;i++){
                if(S[i]==','){
                    System.out.print('\t');
                    continue;}
                if(S[i]==';')break;
                if(S[i]=='=')break;
                System.out.print(S[i]);
            }
        }
        
        if(str.contains("char  ")){
            for(int i=str.indexOf("char  ")+5; ;i++){
                if(S[i]==','){
                    System.out.print('\t');
                    continue;}
                if(S[i]==';')break;
                if(S[i]=='=')break;
                System.out.print(S[i]);
            }
        }
        if(str.contains("boolean  ")){
            for(int i=str.indexOf("boolean  ")+8; ;i++){
                if(S[i]==','){
                    System.out.print('\t');
                    continue;}
                if(S[i]==';')break;
                if(S[i]=='=')break;
                System.out.print(S[i]);
            }
        }
        if(str.contains("long  ")){
            for(int i=str.indexOf("long  ")+5; ;i++){
                if(S[i]==','){
                    System.out.print('\t');
                    continue;}
                if(S[i]==';')break;
                if(S[i]=='=')break;
                System.out.print('\t');
                System.out.print(S[i]);
            }
        }
    }
    
    void Arithmatic(String str){
        if(str.contains(" + "))System.out.print("  +");
        if(str.contains(" - "))System.out.print("  -");
        if(str.contains(" * "))System.out.print("  *");
        if(str.contains(" / "))System.out.print("  /");
        if(str.contains(" % "))System.out.print("  %");
    }
    void Relational(String str){
        if(str.contains(" == "))System.out.print("  ==");
        if(str.contains(" != "))System.out.print("  !=");
        if(str.contains(" < "))System.out.print("  <");
        if(str.contains(" > "))System.out.print("  >");
        if(str.contains(" <= "))System.out.print("  <=");
        if(str.contains(" >= "))System.out.print("  >=");
    }
    
    void Logical(String str){
        if(str.contains(" ! "))System.out.print("  !");
        if(str.contains(" && "))System.out.print("  &&");
        if(str.contains(" || "))System.out.print("  ||");
    }
    
    void State_Change(String str){
        if(str.contains("++"))System.out.print("  ++");
        if(str.contains("--"))System.out.print("  --");
        if(str.contains(" = "))System.out.print("  =");
        if(str.contains(" += "))System.out.print("  +=");
        if(str.contains(" -= "))System.out.print("  -=");
        if(str.contains(" /= "))System.out.print("  /=");
        if(str.contains(" %= "))System.out.print("  %=");
    }
    
    void Textual(String str){
        if(str.contains("+  "))System.out.print("  +");
        if(str.contains("%d"))System.out.print("  %d");
        if(str.contains("%f"))System.out.print("  %f");
        if(str.contains("%lf"))System.out.print("  %lf");
        if(str.contains("%c"))System.out.print("  %c");
    }
    
    void Literals(String str){
        if(str.contains(" {"))System.out.print("   { }");
        if(str.contains("\""))System.out.print("  \"\"");
        if(str.contains(","))System.out.print("  ,");
        if(str.contains("; "))System.out.print("  ;");
    }
    
    void Keyword(String str){
        if(str.contains("int "))System.out.print("  int");
        if(str.contains("long "))System.out.print("  long");
        if(str.contains("float "))System.out.print("  float");
        if(str.contains("double "))System.out.print("  double");
        if(str.contains("for("))System.out.print("  for");
        if(str.contains("while("))System.out.print("  while");
        if(str.contains("if("))System.out.print("  if");
        if(str.contains(" else if("))System.out.print("  else if");
        if(str.contains(" else("))System.out.print("  else");
        if(str.contains("break;"))System.out.print("  break");
        if(str.contains("continue;"))System.out.print("  continue");
        if(str.contains(" do{"))System.out.print("  do");
        if(str.contains(" goto "))System.out.print("  goto");
        if(str.contains("return "))System.out.print("  return");
    }
    
    public static void main(String[] args) {
        String s;
        Find_From_Code ob = new Find_From_Code();
        Scanner input = new Scanner(System.in);
        s = input.nextLine();

        // input like = int main() { int  a,b,c; a = 2+3; b = 6 - 3; c = a + b; printf("Result = %d",c);};
        int n = s.length();
        System.out.print("Function:\t");
        ob.Function(s, n); System.out.println("");
        System.out.print("Variabls:");
        ob.Variables(s, n); System.out.println("");
        System.out.println("Operators:");
        System.out.print("\tArithmatic:\t");ob.Arithmatic(s);
        System.out.println("");
        System.out.print("\tRelational:\t");ob.Relational(s);
        System.out.println("");
        System.out.print("\tLogical:\t");ob.Logical(s);
        System.out.println("");
        System.out.print("\tTextual:\t");ob.Textual(s);
        System.out.println("");
        System.out.print("\tState Change:\t");ob.State_Change(s);
        System.out.println("");
        System.out.print("Literals:");ob.Literals(s);
        System.out.println("");
        System.out.print("Keyword:");ob.Keyword(s);
        System.out.println("");    
    }
}