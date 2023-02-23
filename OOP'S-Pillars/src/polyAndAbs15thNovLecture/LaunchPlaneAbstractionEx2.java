package polyAndAbs15thNovLecture;

//15thNov recorded lecture 1stPart from 01:20 mins onwards --> Practiced on 08thJan2023 10:18 AM onwards

// Notes:
//	1. Abstract keyword is not applicable to variables.
//	2. Abstract methods only have method signature & they don't have method declaration.
//	3. Abstract class can have abstract methods as well as concrete methods or normal methods.
//	4. Abstract class must have at least one abstract method.
//	5. Whenever the abstract class is inherited, it is compulsory to write the method declaration.
//	6. We cannot create object of Abstract class.
//	7. We cannot make constructors as abstract.
//	8. We cannot make abstract class as final because final class can't be inherited.
//	9. final methods can be inherited but those can't be overridden.
// 10. We can have constructors in Abstract class.
// 11. Abstraction & Polymorphism are dependent on Inheritance.

abstract class Planee {
	
	//below are abstract methods which don't have method body or method implementation. 
	//They have only method signature(); So it's 100% abstraction
	abstract public void takeOff();
	abstract public void fly();
	abstract public void land();
	
	//if one of the methods is public or normal concrete method, then it's called partial abstraction
	public void airport() {			
		System.out.println("All planes need airports");
	}
}

class CargoPlanee extends Planee {
	public void takeOff( ) {
		System.out.println("Cargo Plane needs longer runway to takeoff");
	}
	public void fly() {	
		System.out.println("Cargo Plane flies at lower height");
	}
	public void land() {
		System.out.println("Cargo Plane needs longer runway to land");
	}
}
	
class PassengerPlanee extends Planee {
	public void takeOff( ) {
		System.out.println("Passenger Plane needs medium size runway to takeoff");
	}
	public void fly() {
		System.out.println("Passenger Plane flies at medium height");
	}
	public void land() {
		System.out.println("Passenger Plane needs medium size runway to land");
	}
}

class Airportt {
	public void permit(Planee p) {
		p.takeOff();
		p.fly();
		p.land();
	}	
}

public class LaunchPlaneAbstractionEx2 {

	public static void main(String[] args) {
	
		CargoPlanee cp = new CargoPlanee();
		PassengerPlanee pp = new PassengerPlanee();
		Airportt a = new Airportt();					
		a.permit(cp);
		a.permit(pp);
	
	}

}
