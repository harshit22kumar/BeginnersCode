/*Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.

He wants your help for finding out the minimum number of operations required such that the maximum element of the 
resulting array is B. If it is not possible then return -1.
 A = [2, 4, 3, 1, 5]
 B = 3 

  We need to remove 4 and 5 to make 3 the biggest element. 

*/

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>


using namespace std;

int solve(vector<int> &A, int B) {
    bool present=0;
    int elementToRemove=0;
    for(int element:A){
        if(element==B){
            present=1;
        }
        if(element>B){
            
          elementToRemove+=1; 
        }
    }
    if(present==0){
        return -1;
    }else{
        return elementToRemove;
    }
}



int main(){
    vector<int> A{2, 4, 3, 1, 5};
    int b=3;
    solve(A,b);
}