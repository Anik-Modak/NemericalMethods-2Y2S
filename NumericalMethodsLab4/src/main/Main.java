package main;

import java.util.Scanner;

public class Main 
{
	public static void main(String argv[]) 
	{
	    double del = 1e-6;
	    double dx = 1, x = 0, x1 = 1;
	    
	    Scanner input = new Scanner(System.in);
	    SecantMethods  obj = new SecantMethods ();
		
	    int n = input.nextInt();
	    
	    System.out.println("Root obtained: " + obj.secant(n, del, x,x1, dx));
	 
	}
}
