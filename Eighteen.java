public class Eighteen{
	public static void main(String args[]){
		int power = 9;
		int base = 2;
		int temp = base;
		while(power > 1){
			temp = temp * base;
			System.out.println(temp);
			power--;
		}
		System.out.println("Ans : " + temp);
	}
}