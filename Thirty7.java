public class Thirty7{
	public static void main(String args[]){
		int num = 2, numCpy;
		int count = 0;
		System.out.println("Hamming numbers");
		System.out.println(1);
		while(count < 20){
			numCpy = num;
			while(num % 2 == 0){
				num = num / 2;
			}
			while(num % 3 == 0){
				num = num / 3;
			}
			while(num % 5 == 0){
				num = num / 5;
			}
			if( num == 1){
				System.out.println(numCpy);
				count++;
			}
			
			num = numCpy;
			num++;
		}			
	}
}