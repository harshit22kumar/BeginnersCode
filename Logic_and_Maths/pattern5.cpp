//printt the pattern
#include<iostream>
using namespace std;
int main()
{
int i,j,a,k;
for(i=1;i<=4;i++)
 {
  	for(j=4;j>=i;j--)
   	{
    	printf(" ");
  	}
 	for(a=1;a<=i;a++)
 	{
  	printf("%d",a);
 	}
	for(k=a-2;k>=1;k--)
	{
	 printf("%d",k);
	}
 	printf("\n");
  }

for(i=3;i>=1;i--)
 {
   for(j=4;j>=i;j--)
   {
    printf(" ");
   }
 for(a=1;a<=i;a++)
 {
  printf("%d",a);
 }
for(k=a-2;k>=1;k--)
{
 printf("%d",k);
}
printf("\n");
}
}
