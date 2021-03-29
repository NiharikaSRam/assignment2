public class Nineteen{

	static int binomialCoeff(int n, int j){
		if(j > n)
			return 0;
		if(j == 0 || j == n)
			return 1;
		
		return binomialCoeff(n - 1, j - 1) + binomialCoeff(n -1, j);
	
	}
	public static void main(String args[]){
		int n = 7, j = 2;
		System.out.printf("value of coeff(%d, %d) is %d", n, j, binomialCoeff(n, j));	
	}
}