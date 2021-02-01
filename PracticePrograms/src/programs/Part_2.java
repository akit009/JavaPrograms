package programs;

public class Part_2 {
	

	public static void main(String[] args) {
		int []arr = {1,2,3,2,5,4,5};
	//	System.out.println(arr.length);
//		int []arr1 = new int[arr.length];
		for(int i=0; i < arr.length ; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] ==arr[j]) {
					System.out.println(arr[j]);
				}
				}
				
			
		}
		
	}

}
