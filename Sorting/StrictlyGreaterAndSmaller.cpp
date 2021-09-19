/**
 * Smaller and Greater
You are given an Array A of size N.
Find for how many elements, there is a strictly smaller element and a strictly greater element

Example Input:
    A = [1, 2, 3]

Example Output:
    1

Explanation:
    only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.
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
    int solve(vector<int> A);
};


 int Solution::solve(vector<int> A) {
   sort(A.begin(),A.end());
    int count=0;
    int temp=0;
    for(int i=0;i<A.size()-1;i++){
        if(A[i]!=A[i+1]&&A[i]!=A[0]){
            count++;
            count=temp+count;
            temp=0;
        }else if(A[i]!=A[0]){
            temp++;
        }
    }
    return count;
}




int main(){
   Solution s;
   vector<int> A{1,2,3};
   cout<<s.solve(A);
}