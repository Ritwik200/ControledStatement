package DicisonMakingStatements;
import java.util.Scanner;
public class If_Else_lader_user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter user name :");
		
		String username = input.next();
		
		System.out.println("Enter password: ");
		String password =  input.next();
		
		
		if(username=="" || password=="") {
			System.out.println("try again!,Please fill all section");
		} else if(username== "ritwik" && password == "rit") {
			System.out.println("logged in successfully!!");
		} else if(username != "ritwik" || password != "rit") {
			System.out.println("Username or password is incorrect");
		} else if(username == "riwik" && password != "rit") {
			System.out.println("Please enter valid password");
		} else if(username != "ritwik" && password == "rit") {
			System.out.println("Invalid username");
		} else {
			System.out.println("Please try again!!");
		}
	}

}
