//find the automorphic number upto 2 digit Ex:5 square,76 square
/* In mathematics, an automorphic number is a number whose square "ends" in the same digits as the number itself,
or more formally, that in the number base satisfies the modular arithmetic congruence relation */
#include<iostream>
#include<cmath>
using namespace std;
int findDigit(int);
int main()
{
	int number,nummberSquare,i=0,check=0,remainder=0,lastDigit=0;
	cout<<"enter your number"<<endl;
	cin>>number;
	nummberSquare=number*number;
	check=nummberSquare;
	int digit=findDigit(number);
	while(i<digit)
	{
		remainder=check%10;
		lastDigit=lastDigit+pow(10,i)*remainder;
		i++;
		check=check/10;
	}
	cout<<lastDigit<<endl;
	if(lastDigit==number)
	cout<<"automorphic"<<endl;
	else
	cout<<"notautomorphic"<<endl;
	
}

int findDigit(int digit)
{
	int count=0,remainder;
	while(digit!=0)
	{
		remainder=digit%10;
		count=count+1;
		digit=digit/10;
	}
	return count;
}
