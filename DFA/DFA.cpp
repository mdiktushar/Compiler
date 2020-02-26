#include<bits/stdc++.h>
using namespace std;

int main(){
    char s[20];
     int flag=0,c=0;

     cout<<"Given Strng:\n";
     gets(s);
     while(s[c]!='\0')
      {
        switch(flag)
        {
          case 0: if (s[c]=='a')
          flag=1;
          else if (s[c]=='b')
          flag=0;
          break;

          case 1: if (s[c]=='b')
          flag=2;
          else if (s[c]=='a')
          flag=1;
          break;

          case 2: if (s[c]=='b')
          flag=3;
          else if (s[c]=='a')
          flag=1;
          break;

          case 3: if (s[c]=='a')
          flag=1;
          else if (s[c]=='b')
          flag=0;
          break;
      }
      c++;
     }
     if(flag==3)
      cout<<"\nFor string "<<s<<": Accepted\n";
      else
      cout<<"\nFor string "<<s<<": Not Accepted\n";
  }
