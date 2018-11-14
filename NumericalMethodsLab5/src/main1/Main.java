package main1;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		NewtonForwardAndBackwardInterpolation obj = new NewtonForwardAndBackwardInterpolation ();

		int n = input.nextInt();
		double x[] = new double[10];
		double y[][] = new double[10][15];
		
		for(int i=0; i<n; i++)
		{
	         x[i]=input.nextDouble();
	         y[i][0]=input.nextDouble();
		}
		
		System.out.println("Enter the value of x for which the value of y is wanted: ");
		double value = input.nextDouble();
		
		obj.forward_difference_table(n, x, y, value);

	}

}
