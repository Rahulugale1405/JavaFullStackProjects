package methodOverloading;

class Display {
	
	void disp () {
		System.out.println("iNeuron");
	}
	
	void disp (String name) {
		System.out.println(name);
	}
	
	void disp (int age) {
		System.out.println(age);
	}
}
public class LaunchEx4 {

	public static void main(String[] args) {
		
		Display d = new Display();
		d.disp();
		d.disp(14);
		d.disp("DevaRa");
	}

}
