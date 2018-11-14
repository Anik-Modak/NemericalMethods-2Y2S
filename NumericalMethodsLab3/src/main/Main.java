package main;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		NewtonRaphsonMethod obj = new NewtonRaphsonMethod();

		while(input.hasNext())
		{
			double a = input.nextInt();
			obj.newtonRaphson(a); 
		}
	}
}
