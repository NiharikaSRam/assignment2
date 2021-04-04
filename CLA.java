public class CLA
{
	public static void main(String [] args){
		
		int result = 0;
		System.out.println("First argument :" + args[0]);
		System.out.println("Second argument :" + args[1]);
		System.out.println("Third argument :" + args[2]);
		
		
		switch(args[0]){
			case "+":
			result = Integer.parseInt(args[1])+Integer.parseInt(args[2]);
			System.out.println(" The result of addition is : " + result);
			break;
			case "-":
			result = Integer.parseInt(args[1])-Integer.parseInt(args[2]);
			System.out.println(" The result of subtract is : " + result);
			break;
			case "*":
			result = Integer.parseInt(args[1])*Integer.parseInt(args[2]);
			System.out.println(" The result of Multiplication is : " + result);
			break;
		}
	}
}