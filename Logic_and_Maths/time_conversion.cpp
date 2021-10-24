//convert the given integer in hour,minute and secound
#include <iostream>
using namespace std;
int main()
{
unsigned long int time,hr,min,sec;
cout<<"enter the integer value";
cin>>time;
hr=time/3600;
min=(time%3600)/60;
sec=(time%3600)%60;
cout<<"Time is\t"<<hr<<"hrs\t"<<min<<" mins\t"<<sec<<"secs";
return 0;
}
