/*Little pony is going to buy some mobile phones for his friends.
As there many models available in the market at different prices,
He is confused and wants to know the maximum distinct models of
a mobile phone he can buy for his friends, given that he has a total X amount of money.

You are given an array A of size N. denoting the size of prices of different models.
 The array is sorted based on prices in increasing order. You are given another array B 
 of size Q denoting the queries. In i'th query, you need to tell the maximum distinct
  models of mobile phones he can buy with B[i] money.*/

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>


using namespace std;

vector<int> solve(vector<int> &A, vector<int> &B) {
    vector<int> numberOfMobiles;
    int a=0;
    for(int i=1;i<A.size();i++){
        A[i]=A[i-1]+A[i];
    }
    for(int c=0;c<B.size();c++){
        int index=upper_bound(A.begin(),A.end(), B[c])-A.begin();
        numberOfMobiles.push_back(index);
    }
    return numberOfMobiles;
}


int main(){
    vector<int> A{3,4,4,6};
    vector<int> B{20,4,10,2};
    for(int ele:solve(A,B))
    cout<<ele;
}