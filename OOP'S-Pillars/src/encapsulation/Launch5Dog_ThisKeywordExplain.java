package encapsulation;

//9thNov recorded lecture 1st part --> Practiced on 05thJan2023 from 08:00 AM onwards

class Dog {
	
	private String name;
	private int cost;
	
	public String getName() {					//this getters&setters are used using source option
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}


public class Launch5Dog_ThisKeywordExplain {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.setName("Tillu");
		System.out.println(d.getName());
		d.setCost(9000);
		int cost = d.getCost();					//used int because we are collecting the value of cost
		System.out.println(cost);

	}

}
