
public class Main {

	public static void main(String[] args) {
		System.out.println("Day 1, ReCap Demo2: Array");
		
		double sumOfmyList = 0.0;
		double [] myList = {1.2,1.3,14.3,5.6};
		double greatestOfmyList = myList[0];
		
		
		for (double d : myList) {
			System.out.println(d);
			sumOfmyList = sumOfmyList + d;
			
			if(greatestOfmyList<d) {
				greatestOfmyList = d;
			}
			
		}
		
		System.out.println("the sum of my list : " + sumOfmyList);
		System.out.println("the greatest number of my list: " + greatestOfmyList);
		
		
	
		
	}

}
