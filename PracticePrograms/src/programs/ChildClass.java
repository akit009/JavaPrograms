package programs;

public class ChildClass extends ParentClass {

	public static void main(String[] agrs) {
		
		ParentClass p = new ParentClass();
		p.add(0, 0);		
		ChildClass c = new ChildClass();
		c.add(0, 0);		
		c.test();
		c.hellotest();
		p.hellotest();
		
		newtest();
		
		c.newtest();
	}

	 public void add(int a, int b) {
		System.out.println("return a & b");

	}

	 public void test() {
		 System.out.println("This is test child class methd");


	 }
	 
	 public static void newtest() {
		 
		 System.out.println("This is new Test");
	 }
}