
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array={1,23,33,43,53,63};
		System.out.println("This is an array list" + array.length);
		try {
			for(int i=0;i<array.length+1;i++){
			System.out.println(array[i]);
			}
				
		} catch ( ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("this is it for the array");
			
		}
	
	
	}

}
