/**Check if the number is palindrome number or not */
/**A number is said to be a palindrome number if reverse of a number is equal to number itself.*/
 
#include<iostream>
using namespace std;
bool checkPalindrome(int number);

int main()
{
    int number;
    cout<<"Check if the number is Palindrome or not: ";
    cin>>number;
    bool check=checkPalindrome(number);
    if(check==true)
    {
        cout<<number<<" is a palindrome number"<<endl;
    }
    else
    {
        cout<<number<<" is not a palindrome number"<<endl;
    }
}


bool checkPalindrome(int number)
{
    int temp=number;
    int reverse=0;
    while(temp!=0)
    {
        int lastDigit=temp%10;
        reverse=reverse*10+lastDigit;
        temp=temp/10;
    }
    if(number==reverse)
    return true;
    else
    return false;  
}
