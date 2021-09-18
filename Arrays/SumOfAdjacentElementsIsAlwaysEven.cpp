/*Sum of adjacent elements is always even
Given an array of integers A, find and return the
 minimum elements to be removed such that in the resulting 
array the sum of any two adjacent values is even.
Input Format
The only argument given is the integer array A.

Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    2

*/

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>


using namespace std;

int solve(vector<int> &A) {
    int even=0;
    int odd=0;
    for(int c=0;c<A.size();c++){
        if(A[c]%2==0){
            even+=1;
        }else{
            odd+=1;
        }
    }
    if(odd<=even){
        return odd;
    }else{
        return even;
    }
}



int main(){
   vector<int> A{1, 2, 3, 4, 5};
   cout<<solve(A);
}