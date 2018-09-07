#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int n,m,a[1111],b,w,q=0,sum=0,mi=0;
	cin>>n>>w>>b;
	if(w<b)
	{
		mi = w;
	}
	else mi = b;
	for(int i =1;i<=n;i++)
	{
		cin>>a[i];
	}
	for(int i =1;i<=n;i++)
	{
		
		if(a[i]==2)
		{
			if(a[n-i+1]==0)
			{
				sum+=w;
				a[i]=0;
			} 
			else if(a[n-i+1]==1)
			{
				sum+=b;
				a[i]=1;
			}
			else if(a[n-i+1]==2)
			{
				sum+=mi;
				if(w<b)
				{
					a[i]=0;
				}
				else if (w>=b)
				{
					a[i]=1;
				}
			}
		}
	}
	for(int i =1;i<=n;i++)
	{
		if(a[i]!=a[n-i+1]) 
		{
			q++;
		}
	}
	if(q!=0)
	{
		cout<<-1;
	}
	else if(q==0) cout<<sum;
	
	return 0;
}
