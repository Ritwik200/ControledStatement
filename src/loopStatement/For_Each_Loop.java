package loopStatement;

public class For_Each_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Java" , "C" , "C++" , "Phython" , "Javascript" };
		
			System.out.println("Printing the content of the array names:\n");
			
			for(String name:names) {
				System.out.println(name);
			}
 	}

}
