package programs;

public class Swap2Numbers {

	public static void main(String[] args) {

		System.out.println("with temp");
		int a = 10;
		int b = 3;

		int temp = (a * b) / a;
		b = (a * b) / b;
		a = temp;
		System.out.println(a);
		System.out.println(b);

		System.out.println("without temp");
		int c = 10;
		int d = 30;

		c = c - d;
		d = c + d;
		c = d - c;

		System.out.println(c);
		System.out.println(d);

	}
}
