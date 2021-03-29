public class Forty4{
	public static void main(String args[]){
		int num = 345215;
		int checkDigit = 5;
		int count = 0;
		int digit;
		while(num > 0){
			digit = num % 10;
			if(checkDigit == digit){
				count++;
			}		
			num = num / 10;
		}
		System.out.println("count of "+checkDigit+" : "+count);
	}
}