/**
 * Problem Description

Print a Pattern According to The Given Value of A.

Example: For A = 3 pattern looks like:

1 0 0

1 2 0

1 2 3


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
     vector<vector<int> > solve(int A) ;
};


 vector<vector<int> > Solution::solve(int A) {
    vector<vector<int>> pattern(A,vector<int>(A,0));
    for(int i=0;i<A;i++){
        for(int j=0;j<=i;j++){
            pattern[i][j]=j+1;
        }
    }
    return pattern;
}




int main(){
   Solution s;
   vector<vector<int>> pattern= s.solve(3);
    for(auto row:pattern){
        for(int ele:row){
            cout<<ele<<" ";
        }
        cout<<endl;
    } 
}