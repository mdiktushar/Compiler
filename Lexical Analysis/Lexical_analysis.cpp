#include<bits/stdc++.h>
using namespace std;

int main()
{
    string a,b,c;
    char d[100];
    cin>>a>>b>>c>>d;
    cout<<endl<<"Lexeme:"<<endl;
    cout<<a<<'\t'<<b<<'\t'<<c<<'\t';
    int n = strlen(d);
    for(int i=0; i<n; i++){
        if(d[i]==';')break;
        if(d[i]=='+'||d[i]=='-'||d[i]=='/'||d[i]=='%'||d[i]=='*'){
            cout<<'\t'<<d[i]<<'\t';
        }
        else{
            cout<<d[i];
        }
    }
    cout<<endl<<endl;

    cout<<"Token:"<<endl;
    cout<<'<'<<a<<'>';
    int v=0,nu=0;
    cout<<'<'<<"id,"<<++v<<'>';
    cout<<'\t'<<'<'<<'='<<'>';
    int f = 0;
    int j = 0;
    for(int i=0; i<n; i++){
        while(j<n){
            if(d[j]>=48 && d[j]<58)f++;
            else if(d[j]=='+'||d[j]=='-'||d[j]=='*'||d[j]=='/'||d[j]=='%')break;
            else if(d[j]>=65&&d[j]<=122)f=0;
            j++;
        }
        if(f==0)cout<<'\t'<<'<'<<"id,"<<++v<<'>';
        else cout<<'\t'<<'<'<<"numeric, "<<++nu<<'>';
        if(d[j]=='+'||d[j]=='-'||d[j]=='*'||d[j]=='/'||d[j]=='%'){
        cout<<'\t'<<'<'<<d[j]<<'>';}
        i = ++j;
    }

    cout<<endl<<endl;

    cout<<"Symbol Table"<<endl;
    cout<<"id"<<'\t'<<b<<'\t'<<1<<endl;
    f=0;j=0;nu=0;
    int t1=0,t2=1;
    for(int i=0; i<=n; i++){
        if(d[i]>=48 && d[i]<58 && nu==0){
            cout<<"numeric"<<'\t';
            t1++;nu++;
        }
        if(d[i]>=48 && d[i]<58)cout<<d[i];
        if((d[i]=='+'||d[i]=='-'||d[i]=='*'||d[i]=='/'||d[i]=='%'||d[i]==';')&&(d[i-1]>=48 && d[i-1]<58)){
            cout<<'\t'<<t1<<endl;
            nu=0;
        }
        if(d[i]>=65&&d[i]<=122 && j==0){
            cout<<"id"<<'\t';
            t2++;j++;
        }
        if(d[i]>=65&&d[i]<=122)cout<<d[i];
        if((d[i]=='+'||d[i]=='-'||d[i]=='*'||d[i]=='/'||d[i]=='%'||d[i]==';')&&(d[i-1]>=65&&d[i-1]<=122)){
            cout<<'\t'<<t2<<endl;
            j=0;
        }
    }
    return 0;
}
