public class Forty1{
	public static void main(String args[]){
		double distance = 400; // in meters
		int sec = 20;
		int min = 45;
		int hour = 2;
		
		double totalSec= (double)(sec + (min * 60) + ( hour * 60 * 60));
		double mps = distance/ totalSec;
		double kmph = 3.6 * mps;
		double mph = 2.23694 * mps;
		
		System.out.println("mps : "+mps+"  kmph : "+kmph+"  mph : "+mph); 
		
	}
}