package main;

public class BisectionFunction {
	
	public double func(double x) 
	{ 
	    return x * x * x - x - 1; 
	} 
	
	public boolean Solve(double a, double b) 
	{ 
	    if (func(a) * func(b) >= 0) 
	    { 
	    	//System.out.println("Incorrect: "+a +" " +b); 
	        return false; 
	    } 
	    
	    double EPSILON = 0.00000001;
	    double c = a;
	   
	    while (Math.abs(b-a) >= EPSILON) 
	    {
	        c = (a+b)/2.0; 
	        
	        if (func(c) == 0.0) break; 
	        else if (func(c)*func(a) < 0)  b = c; 
	        else a = c; 
	    } 
	    System.out.println("The value of root is : "+c); 
	    return true;
	} 
}
