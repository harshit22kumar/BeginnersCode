/*Rishik likes to draw a lot. He starts at origin and chooses a 
single Y ordinate of each abscissa in [1-N] given in array 
A and then chooses 0 for N+1. He then joins each consecutive
 point with a straight line and found that he has drawn a masterpiece.
  But, It is incomplete without coloring.
So, he wants you to tell him the area of hills that he will color.*/

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>


using namespace std;

string solve(vector<int> &A) {
    long area=0;
//  vector<int> y_cordinateList(A.size()+2,0);
//     vector<long double> areaList;
//     double area=0.0;
//     for(int i=1;i<=A.size();i++){
//         y_cordinateList[i]=A[i-1];
//     }
//     for(int i=1;i<y_cordinateList.size();i++){
//         areaList.push_back((double)(y_cordinateList[i-1]+y_cordinateList[i])/2);
//     }
//     for(int i=0;i<areaList.size();i++){
//         area=area+areaList[i];
//     }
    for(int ele:A)
    area+=ele;
    return to_string(area);
}


int main(){
    vector<int> A{2,1,3};
   cout<<solve(A);
}