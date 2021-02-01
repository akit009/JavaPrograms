package programs;

public class Part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int flag =0;
		int i = 0;
		for ( i = 2; i < n; i++) {

			if (n % i == 0) {
				System.out.println( "Not a prime");
				flag =1;
				break;
			}
			
			

		}
		if (flag == 0){
			System.out.println( " prime");
		}
	}

}
