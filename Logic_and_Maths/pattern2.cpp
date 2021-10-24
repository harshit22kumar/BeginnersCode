//printing the pattern
#include<cstdio>
using namespace std;
int main()
{
int i,j,n,c=0;
printf("enter the value of n");
scanf("%d",&n);
for(i=0;i<n;i++)
 {
  for(j=0;j<=i;j++)
  {
    printf("*");
  }
 printf("\n");
 }
printf("\n");
for(i=1;i<=n;i++)
 {
  for(j=1;j<=i;j++)
  {
    printf("1");
  }
 printf("\n");
 }
printf("\n");
for(i=1;i<=n;i++)
 {
  for(j=1;j<=i;j++)
  {
    printf("%d",j);
  }
 printf("\n");
 }

printf("\n");
for(i=1;i<=n;i++)
 {
  for(j=1;j<=i;j++)
  {
    c++;
    printf("%d",c);
  }
 printf("\n");
 }
printf("\n");

for(i=1;i<=n;i++)
 {
  for(j=1;j<=i;j++)
  {
    printf("%d",((i+j)%2));
  }
 printf("\n");
 }
}
