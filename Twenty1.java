import java.util.Scanner;


public class Twenty1{
	 
   static boolean perfect_square_check(int val){
      int s = (int) Math.sqrt(val);
      return (s*s == val);
   }
   static boolean fibonacci_num_check(int n){
      return perfect_square_check(5*n*n + 4) || perfect_square_check(5*n*n - 4);
   }
   public static void main(String[] args){
	   
	  Scanner sc =  new Scanner(System.in); 
	  System.out.println("enter the number");
	  int num = sc.nextInt();
     System.out.println(fibonacci_num_check(num) ? num + " is a Fibonacci number" : num + " is a not Fibonacci number");
   }
}