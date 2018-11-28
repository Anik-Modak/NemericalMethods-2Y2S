package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of observations: ");
		int n = in.nextInt();
		
		double [] x = new double[n];
		System.out.print("Enter the different values of x: ");
		for(int i=0; i<n; i++)
		{
			x[i] = in.nextDouble();
		}
		
		double [] y = new double[n];
		System.out.print("Enter The corresponding values of y: ");
		for(int i=0; i<n; i++)
		{
			y[i] = in.nextDouble();
		}
		
		System.out.print("Enter the value of 'k' in f(k) you want to evaluate: ");
		int k = in.nextInt();
		
		DividedDifferenceInterpolation obj = new DividedDifferenceInterpolation();
		double ans = obj.dividedDifference(x, y, k, n);
		System.out.println(ans);	
	}

}
