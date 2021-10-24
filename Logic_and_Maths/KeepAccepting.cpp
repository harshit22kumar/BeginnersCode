/*This Program keep on accepting number utill you press 1,If 1 is pressed
 display largest and smallest number you entered*/
#include<iostream>
using namespace std;
int main()
{
  int user_input,minimum,maximum;
  maximum=INT_MIN;
  minimum=INT_MAX;
  cout<<"enter the number\n";
  cin>>user_input;
  //user_input=2147483649;
  if(user_input==1)
  {
    cout<<"Input is 1 program terminates"<<endl;
    return 0;
  }
  else if(user_input==INT_MAX)  
  {
    cout<<"Range execeed Maximum size";
    return 0;
  }
  else if(user_input==INT_MIN)
  {
    cout<<"Range below Minimun number";
    return 0;
  }
  while(user_input!=1&&user_input>=INT_MIN&&user_input<=INT_MAX)
  {
    if(user_input>maximum)
      maximum=user_input; 
    if(user_input<minimum)
      minimum=user_input;
    cout<<"enter the number\n";
    cin>>user_input;   
  }
  
cout<<"Maximum= "<<maximum<<endl;
cout<<"Minimum= "<<minimum<<endl;
}

