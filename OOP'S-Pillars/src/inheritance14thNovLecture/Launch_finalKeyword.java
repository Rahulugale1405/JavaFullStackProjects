package inheritance14thNovLecture;

//14thNov recorded lecture 2ndPart from 02:11 mins --> Practiced on 07thJan2023 08:13 PM onwards

//If we make this class as final then we cannot inherit it
class Vehicle {
	
	//If we make variable as final, it will act as constant. We can't change the value
	final int i = 10;
	final double pi = 3.1414;
			
	// final methods can be inherited
	final void disp() {
		//i = 20;
		System.out.println(i);
		System.out.println("It's a vehicle");
	}
}

class Car extends Vehicle {
	
	//final method can be inherited but we cannot override
	//		void disp() {	
	//		System.out.println("display")
	//	}
}


public class Launch_finalKeyword {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.disp();
	}

}
