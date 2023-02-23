package theInterface17thNovLec;

//17thNov Recorded lecture 2ndPart --> practiced on 11thJan2023 from 07:45 AM onwards

public interface Account {

	//Interface is 100% abstract class. there can or cannot be abstract keyword in methods during declaration
	//The methods are by default public & abstract
	public abstract void withdraw();
	public void deposit();
	void checkBalance();

	public class TestApp {
		public static void main (String[] args) {
			System.out.println();
		}
	}
} 

