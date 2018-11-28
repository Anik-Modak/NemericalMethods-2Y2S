package main;

public class DividedDifferenceInterpolation 
{

	double dividedDifference(double x[], double f[],int a, int n) 
	{ 
		int i, j;
		double mult, sum = 0.0;
		
		for(j=0; j<n-1; j++)
		{
			for(i=n-1; i>j; i--)
				f[i]=(f[i]-f[i-1])/(x[i]-x[i-j-1]);
		}
		
		for(i=n-1; i>=0; i--)
		{
			mult=1;
			for(j=0; j<i; j++)
				mult*=(a-x[j]);

			mult*=f[j];
			sum+=mult;
		}

		return sum;
	} 
}
