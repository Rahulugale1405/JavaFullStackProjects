package innerClass17thNov;

//17thNov Recorded lecture --> practiced on 11thJan2023 from 06:00 AM onwards

abstract class Computer1 {
	public abstract void config();
}


public class GHIClass {

	public static void main(String[] args) {
		 
		Computer1 c = new Computer1() 
		{	//no name for inner class so it's called anonymous inner class. Considering this we have total 3 classes				
			public void config() 
			{					
				System.out.println("something new & interesting");
			}
		};												//because method config is under Computer1 class
		c.config();

	}

}

