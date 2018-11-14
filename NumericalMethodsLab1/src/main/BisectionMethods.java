package main;

import java.util.Scanner;

public class BisectionMethods {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		BisectionFunction obj = new BisectionFunction();
		
		while(true) {
			
			double a = 0;
			double b = Math.random()+1;
			
			/*double a = input.nextInt();
			double b = input.nextInt();*/
			if(obj.Solve(a,b)==true) break;
		}
	}
}
