package main;

public class FalsePositionMethod
{
	
	public double func(double x) 
	{ 
	    return x*x*x- x- 1; 
	} 
	
	public boolean Solve(double a, double b) 
	{ 
	    if (func(a) * func(b) >= 0) 
	    { 
	    	//System.out.println("Incorrect: "+a +" " +b); 
	        return false; 
	    } 
	    
	    double EPSILON = 100000;
	    double c = a;
	    
	    for (int i=0; i < EPSILON ; i++)
	    {
	        c = (a*func(b) - b*func(a))/ (func(b) - func(a));
	
	        if(func(c) == 0.0) break;
	        else if (func(c)*func(a) < 0)  b = c;
	        else  a = c;
	    }
	    
	    System.out.println("The value of root is : "+c); 
	    return true;
	}
}
