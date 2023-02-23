package inheritance14thNovLecture;

//14thNov recorded lecture 2ndPart from 02:09 mins --> Practiced on 07thJan2023 08:01 PM onwards

class Bhau1 {
	int age = 25;

}

class Bhau2 extends Bhau1 {
	//int age = 53;
	
	public void bhauAge() {
		System.out.println(age);
		super.age = 53;
	}
}

public class LaunchSuperKeyword {

	public static void main(String[] args) {
		Bhau2 b = new Bhau2();
		b.bhauAge();

	}

}
