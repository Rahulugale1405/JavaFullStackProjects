package polyAndAbs15thNovLecture;

//15thNov recorded lecture 2ndPart from 02:15 mins onwards --> Practiced on 08thJan2023 12:53 PM onwards

import java.util.Scanner;

abstract class Shapes {
	
	float area;
	abstract public void input();
	abstract public void compute();
	public void disp() {
		System.out.println("The area is : " + area);
	}
}

class Rectangle1 extends Shapes {
	float length;
	float breadth;

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of rectangle");
		length=scan.nextFloat();
		System.out.println("Please enter the breadth of rectangle");
		breadth=scan.nextFloat();
	}
	public void compute() {
		area = length*breadth;
	}

}

class Square1 extends Shapes {
	float length;

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of square");
		length=scan.nextFloat();
	}
	public void compute() {
		area = length*length;
	}
}

class Circle1 extends Shapes {
	float radius;
	final float pi = 3.1414f;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the radius of a circle");
		radius=scan.nextFloat();
	}
	public void compute() {
		area = pi*radius*radius;
	}
}

class Geometry {
	void permit(Shapes s) {
	s.input();
	s.compute();
	s.disp();
	}
}
public class LaunchBasicJavaProject2 {

	public static void main(String[] args) {
		Rectangle1 rr = new Rectangle1();
		Square1 ss = new Square1();
		Circle1 cc = new Circle1();
		Geometry g = new Geometry();
		g.permit(rr);
		g.permit(ss);
		g.permit(cc);

	}

}
