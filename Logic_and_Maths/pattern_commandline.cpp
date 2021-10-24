#include<iostream>
using namespace std;
int main(int n,char* argv[])
{
int j,k=1,i,c,l;
cout<<"enter the row"<<endl;
cin>>n;
l=n;
        for(c=0;c<n;c++)
        {
        for(i=l-1;i>0;i--)
        cout<<" ";
        for(j=0;j<k;j++)
        cout<<argv[1];
        for(i=n-1;i>0;i--)
        cout<<" ";
        k=k+2;
        l--;
        cout<<endl;
        }
return 0;
}

