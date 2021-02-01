package programs;

public class LargestNumber {

	public static void main(String[] args) {

		int a = 50;
		int b = 20;
		int c = 30;
		if (a > b && a > c) {
			System.out.println(a + "is the largest number");
		} else if (b > c && b > a) {
			System.out.println(b + "is the largest number");
		} else {
			System.out.println(c + "is the largest number");
		}
	}

}
