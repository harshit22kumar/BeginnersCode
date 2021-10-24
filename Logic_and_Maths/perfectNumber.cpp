/**Find the perfect number */
/**A perfect number is a positive integer that is equal to the sum of its possitive divisor,excluding the number 
 * itself.
 */

#include<iostream>
#include<cmath>

using namespace std;
void  perfectNumber(int number);

int main()
{
    int number;
    cout<<"Enter the number to be checked for perfectNumber: ";
    cin>>number;
    perfectNumber(number);
}

void perfectNumber(int number)
{
    int divisor=1;
    int sum=0;
    while(divisor<=number/2)
    {
        if(number%divisor==0)
        {
            sum+=divisor;
        }
        divisor++;
    }
    if(sum==number)
    {
        cout<<number<<" is a perfect Number"<<endl;
    }
    else
    {
        cout<<"Number is not a perfect square"<<endl;
    }
}