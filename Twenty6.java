import java.util.Scanner;

public class Twenty6 {

   // method to check duck number
   public static boolean isDuck(int number) {

      // loop to repeat the process
      while(number != 0) {

         // check last digit
         if(number%10 == 0)
            return true;

         // remove last digit
         number /= 10;
      }

      // else it is not a duck number
      return false;
   }

   public static void main(String[] args) {

      // declare variables
      int number = 0;

      // read the input 
      Scanner scan =  new Scanner(System.in);
      System.out.print("Enter an integer number:: ");
      number = scan.nextInt();

      // check the number is duck number or not
      if(isDuck(number))
	 System.out.println(number+" is a"
		    	+ " duck number");
      else
         System.out.println(number+" is not a"
	      	  	+ " duck number");

      // close Scanner class object
      scan.close();
   }
}