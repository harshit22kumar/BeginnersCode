/*Write a function that takes in non-empty array of distict integer and an integer representing a target sum.
If any two numbers in input array sum to target sum,the function should return them in an array,in sorted order.If 
no two numbers sum up to the target sum,the function should return an empty array.Assume that there will be at 
most one pair of number summing up to target sum.

Sample Input :[3,5,-4,8,11,1,-1,6],10
Sample Output:[-1,11]

 */
#include <vector>
#include <unordered_set>
using namespace std;

// Time O(n) | Space O(n)

vector<int > twoNumberSum(vector<int> array,int targetSum){
    unordered_set<int> nums;
    for (int num:array){
        int potentialMatch = targetSum-num;
        if(nums.find(potentialMatch)!=nums.end()){
            return potentialMatch>num?vector<int>{num,potentialMatch}:vector<int>{potentialMatch,num};
        }else{
            nums.insert(num);
        }
    }
    return{};
}