public class Forty2{

	void age(int i, int s)
	{
		int c = i+s-s-12;
		System.out.println("Nachi is 12 years younger than Bujji");
		System.out.println("Nachi's age is "+c);
	}

	public static void main(String[] args) {
		
		Forty2 obj = new Forty2();
		obj.age(14,11);
	}
}