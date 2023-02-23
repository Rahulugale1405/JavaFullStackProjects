package encapsulation;

//9thNov recorded lecture 2nd part from 01:54 mins of video --> Practiced on 05thJan2023 from 10:28 AM onwards

class Dog1 {
	
	private String name;
	private int cost;
	
	public Dog1 () {
		this("Tillu", 1405);
	}
	
	public Dog1 (String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	
	//getters methods generated from source
	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}
	
	
}


public class Launch9UsingThisAndConstructors {

	public static void main(String[] args) {
		
		Dog1 d1 = new Dog1();
		System.out.println(d1.getCost());
		System.out.println(d1.getName());

		System.out.println("=====================1======================");
		Dog1 d2 = new Dog1("Robo", 10000);
		System.out.println(d2.getName());
		System.out.println(d2.getCost());
	}

}
