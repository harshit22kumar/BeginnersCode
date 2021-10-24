/*Given an array A of size N, groot wants you to pick 2 indices i and j such that

1 <= i, j <= N
A[i] % A[j] is maximum among all possible pairs of (i, j).
Help Groot in finding the maximum value of A[i] % A[j] for some i, j.

Input 1:

 A = [1, 2, 44, 3]

 Output 1:

 3

 Explanation 1:

 For i = 3, j = 2  A[i] % A[j] = 3 % 44 = 3.
 No pair exists which has more value than 3.

*/

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>


using namespace std;

int solve(vector<int> &A) {
    sort(A.begin(),A.end());
    int last_index=A.size()-1;
    for(int i=A.size()-2;i>=0;i--){
        if(A[i]%A[last_index]!=0){
            return A[i]%A[last_index];
        }
    }
    return 0;
}



int main(){
   vector<int> A{1, 2, 44, 3};
   cout<<solve(A);
}