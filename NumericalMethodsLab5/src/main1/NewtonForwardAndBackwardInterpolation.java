package main1;

public class NewtonForwardAndBackwardInterpolation 
{
	public double u_cal(double u, int n) 
	{ 
	    double temp = u; 
	    for (int i = 1; i < n; i++) 
	        temp = temp * (u - i); 
	    return temp; 
	} 
	  
	public int fact(int n) 
	{ 
	    int f = 1; 
	    for (int i = 2; i <= n; i++) 
	        f *= i; 
	    return f; 
	} 
	
	public void forward_difference_table(int n, double x[], double y[][], double value)
	{
	    for(int j=1; j<n; j++)
	        for(int i=0; i<(n-j); i++)
	            y[i][j] = y[i+1][j-1] - y[i][j-1];

	    System.out.println("***********Forward Difference Table ***********");

	    for(int i=0; i<n; i++)
	    {
	        System.out.print(String.format("\t%.2f",x[i]));

	        for(int j=0; j<(n-i); j++)
	        	 System.out.print(String.format("\t%.2f",y[i][j]));
	        System.out.println();
	    }
	    
	    double sum = y[0][0]; 
	    double u = (value - x[0]) / (x[1] - x[0]); 
	    for (int i = 1; i < n; i++) 
	    { 
	        sum = sum + (u_cal(u, i) * y[0][i]) /fact(i); 
	    } 
	    System.out.println(sum);
	}
}
