/*Find if number is armstrong number or not */
#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int number,sum=0,temp,rem,nod=0;
    cout<<"enter the value\n"<<endl;
    cin>>number;
    temp=number;
    while(number!=0)
    {
        rem=number%10;
        nod++;
        number=number/10;
    }
    number=temp;
    while(number!=0)
    {
    rem=number%10;
    sum=sum+pow(rem,nod);
    number=number/10;
    }
    if(temp==sum)
    cout<<"armstrong number"<<endl;
    else
    cout<<"Not a armstrong number"<<endl;
}
