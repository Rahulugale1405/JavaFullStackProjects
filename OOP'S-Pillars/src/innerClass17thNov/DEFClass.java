package innerClass17thNov;

//17thNov Recorded lecture --> practiced on 11thJan2023 from 06:00 AM onwards

class Computer {
	public void config() {
		System.out.println("In computer config");
	}
}


public class DEFClass {

	public static void main(String[] args) {
	 
		Computer c = new Computer() 
		{	//no name for inner class so it's called anonymous inner class					
			public void config() 
			{					
				System.out.println("something new");
			}
		};												//because method config is under Computer class
		c.config();

	}

}
