/**
 * MINIMUM PICKS
Problem Description

You are given an array of integers A of size N.
Return the difference between the maximum among
all even numbers of A and the minimum among all odd numbers in A.

Example Input
Input 1:

 A = [0, 2, 9]
 Example Output
Output 1:

-7
Example Explanation
Explanation 1:

Maximum of all even numbers = 2
Minimum of all odd numbers = 9
ans = 2 - 9 = -7
 * 
 * 
*/

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
#include<cmath>
#include<bitset>


using namespace std;



class Solution{
    public:
    int solve(vector<int> &A);
};


 int Solution::solve(vector<int> &A) {
    int max_even=INT_MIN;
    int min_odd=INT_MAX;
    for(int ele:A){
        if(ele%2==0){
            max_even=max(max_even,ele);  
        } else {
            min_odd=min(min_odd,ele);
        }
    }
    return max_even-min_odd;
}




int main(){
   Solution s;
   vector<int> A{0, 2, 9};
   cout<<s.solve(A);
}