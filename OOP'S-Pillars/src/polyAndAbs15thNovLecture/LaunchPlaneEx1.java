package polyAndAbs15thNovLecture;

//15thNov recorded lecture 1stPart from 35mins --> Practiced on 08thJan2023 09:04 AM onwards
//Polymorphism explained in this code

class Plane {
	public void takeOff() {
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
	public void fly() {	
		System.out.println("Cargo Plane flies at lower height");
	}
}
	

class PassengerPlane extends Plane {
	public void fly() {
		System.out.println("Passenger Plane flies at medium height");
	}
}

class FighterPlane extends Plane {
	public void fly() {
		System.out.println("FighterPlane flies at high speed");
	}
}
class Airport {
	public void permit(Plane p) {	//here Plane is parent of all the classes. So creating here ParentTypeRef
		p.takeOff();
		p.fly();
		p.land();
	}	
}

public class LaunchPlaneEx1 {

	public static void main(String[] args) {
	
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Airport a = new Airport();					//code size reducibility is performed because of Polymorphism
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
		
	}

}
