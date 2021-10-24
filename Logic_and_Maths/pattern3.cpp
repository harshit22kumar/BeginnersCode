#include<iostream>
using namespace std;
#include<stdio.h>
int main()
{
int i,j,a;
for(i=1;i<=4;i++)
 {
  for(j=4;j>=i;j--)
   {
    printf(" ");
   }
 for(a=1;a<=i;a++)
 {
  printf("%d",a);
  printf(" ");
 }
 printf("\n");
 }
}

