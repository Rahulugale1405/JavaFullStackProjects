package generics16th_19thAnd20thDec;

//19thDec recorded lecture 2ndPart --> watched on 06thFeb2023 from 09:45PM onwards


//this is our own user defined generic class
class Gen<T> {
	T obj;			//T replaced with --> Integer, String, Double, ...

	
	//Parameterized Contructor
	public Gen(T obj) {				//generate constructor using source
		super();
		this.obj = obj;
	}
	
	public void show() {
		System.out.println("This type of object is :: " + obj.getClass().getName());	
	}
	
	public T getObj() {
		return obj;
	}
}

public class LaunchEx3_19thDec {

	public static void main(String[] args) {
		
		Gen<Integer> g1 = new Gen<Integer>(1420);
		g1.show();
		System.out.println(g1.getObj());
		
		System.out.println();
		
		Gen<String> g2 = new Gen<String>("Krishna");
		g2.show();
		System.out.println(g2.getObj());
		
		System.out.println();
		
		Gen<Double> g3 = new Gen<Double>(14.05);
		g3.show();
		System.out.println(g3.getObj());
	

	}

}
