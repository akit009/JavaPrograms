package programs;

public class Demo {

	public static void main(String[] args) {
		// add();
		addSumOfDigits(12345);

	}

	public static int addSumOfDigits(int number) {
		int sum = 0;
		if (number < 10) {
			return number;
		}
		while (number > 0) {
			sum += (number % 10);
			number /= 10;
		}
		return (sum > 9) ? addSumOfDigits(sum) : sum;
	}

//	public static void add() {
//		int num = 1234567;
//		int x = 0;
//		int y=0;
//		while (num != 0) {
//			x = x + num % 10; // =3
//			num = num / 10;// 12
//			
//		}
//		System.out.println(x);
//		if(x>11) {
//		while(x!=0) {
//			y = y+ x%10;
//			x=x/10;
//			
//		}System.out.println(y);
//		
//		}	
//
//	}
}
