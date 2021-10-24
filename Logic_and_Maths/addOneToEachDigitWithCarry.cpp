////Add one to each digit of a given number with carry
#include<iostream>
#include<cmath>
using namespace std;

int main()
{
    unsigned int number,carry=0,numberAfteradding=0,place=0;
    cout<<"Enter the number";
    cin>>number;
    while(number!=0)
    {
        int rem=number%10;
        rem=rem+1+carry;
        numberAfteradding=numberAfteradding+rem*pow(10,place);
        number=number/10;
        place++;
    }
    cout<<"Number after adding is "<<numberAfteradding;
}
