/*Raman is very fond of vowels. One day, he got a string as a gift for his birthday.
 He got very excited and wanted to obtain the longest subsequence of vowels from the
  original string. You are asked to help Raman.

Given a string A of lowercase English alphabets, find and return a string which is the 
longest subsequence of vowels in the string A.

Note:
1. Vowels are 'a' , 'e' ,'i' , 'o' , 'u'. 
2. A subsequence is a sequence that can be derived from another sequence
by deleting some or no elements from the original sequence without changing
the order of the remaining elements.
3. It is guaranteed that atleast one vowel will be present in the given string.

Input 1:
   abcdye
Output 1:
    ae
*/

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>


using namespace std;

string solve(string A) {
    string longestSubStrVowel="";
    int longestSubStrVowelLen=0;
    for(int c=0;c<A.size();c++){
        if(A[c]=='a'||A[c]=='e'||A[c]=='i'||A[c]=='o'||A[c]=='u'){
            longestSubStrVowel=longestSubStrVowel+A[c];
            longestSubStrVowelLen+=1;
        }
    }
    return longestSubStrVowel;
}



int main(){
   cout<<solve("abcdye");
}