public class Fifteen
{ 
	
	
	static int product(int x, int y) 
	{ 
	
		if (y != 0) 
			return (x + product(x, y - 1)); 
	
		 
		else
			return 0; 
	} 
	
	
	public static void main (String[] args) 
	{ 
		int x = 2, y = 9; 
		System.out.println(product(x, y)); 
	} 
} 

