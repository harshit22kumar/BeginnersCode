
#include<any>
#include<vector>

using namespace std;

int main()
{
}
int productSum(vector<any> array,int multiplier=1)
{
    int sum=0;
    for(auto e1:array){
        if(e1.type()==typeid(vector<any>)){
            sum+=productSum(any_cast<vector<any>>(e1),multiplier+1);
        }else{
            sum+=any_cast<int>(e1);
        }
    }
    return sum*multiplier;
}