package main;

import java.util.Scanner;

public class AssumptionRandomNumber 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		FalsePositionMethod obj = new FalsePositionMethod();
		
		while(true) 
		{
			double a = Math.random()+1;
			double b = Math.random()+1;
			
			/*double a = input.nextInt();
			double b = input.nextInt();*/
			if(obj.Solve(a,b)==true) break;
		}
	}
}
