package inheritance14thNovLecture;

//14thNov recorded lecture 1stPart from 57mins --> Practiced on 07thJan2023 06:24 PM onwards

class Plane {
	public void takeOff() {									//this is the inherited method
		System.out.println("Plane is ready to TakeOff");
	}
	public void fly() {
		System.out.println("Plane is flying");
	}
	public void land() {
		System.out.println("Plane is landing");
	}
}

class CargoPlane extends Plane {
	
	//this below method is overridden as it's called with a new requirement
	public void fly() {	
		System.out.println("Cargo Plane flies at lower height");
	}
	
	//below method is only in this child class so it's called as a Specialized Method
	public void carryGoods() {
		System.out.println("Cargo Plane carries goods");
	}
	
}

class PassengerPlane extends Plane {
	
	//this below method is overridden as it's called with a new requirement
	public void fly() {
		System.out.println("Passenger Plane flies at medium height");
	}
	
	//below method is only in this child class so it's called as a Specialized Method
	public void carryPassengers() {
		System.out.println("Passenger Plane carries passengers");
	}
	
}


public class LaunchPlane {

	public static void main(String[] args) {
	
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		
		cp.takeOff();
		cp.carryGoods();
		cp.fly();
		cp.land();
		
		System.out.println("======================================");
		
		pp.takeOff();						//inherited method
		pp.carryPassengers();				//specialized method
		pp.fly();							//inherited method
		pp.land();							//inherited method
	}

}
