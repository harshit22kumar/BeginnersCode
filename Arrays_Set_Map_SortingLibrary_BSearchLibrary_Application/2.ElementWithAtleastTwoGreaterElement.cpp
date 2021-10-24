/**
 * Elements which have at-least two greater elements
Problem Description

You are given an array of distinct integers A, you have to find and return all 
elements in array which have at-least two greater elements than themselves.

The result should have the order in which they are present in the original array.

Example Input
Input 1:

 A = [1, 2, 3, 4, 5]

 Example Output
Output 1:

 [1, 2, 3]

 Example Explanation
Explanation 1:

 Number of elements greater than 1: 4
 Number of elements greater than 2: 3
 Number of elements greater than 3: 2
 Number of elements greater than 4: 1
 Number of elements greater than 5: 0
 Elements 1, 2 and 3 have atleast 2 elements strictly greater than themselves.
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
    vector<int> solve(vector<int> A);
};


 vector<int> Solution::solve(vector<int> A) {
   int largest=INT_MIN;
    int secondLargest=INT_MIN;
    vector<int> ans;
    for(int &e:A){
       largest=max(e,largest);
    }
    for(int e:A){
        if(e!=largest){
          secondLargest=max(e,secondLargest);  
        }
    }
    for(int e:A){
        if(e<largest&&e<secondLargest){
            ans.push_back(e);
        }
    }
    return ans;
}




int main(){
   Solution s;
   vector<int> A{1, 2, 3, 4, 5};
   vector<int> ans=s.solve(A);
   for(int ele:ans){
       cout<<ele;
   }
}