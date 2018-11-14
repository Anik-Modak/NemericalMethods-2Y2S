package main;

public class SecantMethods 
{
	public static double secant(int n, double del,
			double x,double x1, double dx) 
	{
		int k = 0;
		double x2=0;
		
		while ((Math.abs(dx)>del) && (k<n) && f(x2)!=0)
		{
			double d = f(x1)-f(x);
			x2 = x1-f(x1)*(x1-x)/d;
			x  = x1;
			x1 = x2;
			dx = x1-x;
			k++;
		}
		
		if (k==n) System.out.println("Convergence not" + " found after " + n + " iterations");
		System.out.println("iterations: " + k);
		return x1;
	}


	public static double f(double x) 
	{
		return x * x * x - x * x + 2; 
	}
}
