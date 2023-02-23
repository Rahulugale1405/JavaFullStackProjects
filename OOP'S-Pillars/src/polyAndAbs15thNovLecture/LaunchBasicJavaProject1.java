package polyAndAbs15thNovLecture;

//15thNov recorded lecture 2ndPart from 02:15 mins onwards --> Practiced on 08thJan2023 12:53 PM onwards

import java.util.Scanner;

class Rectangle {
	float length;
	float breadth;
	float area;
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
	public void disp() {
		System.out.println("The area of a rectangle is: " + area);
	}
}

class Square {
	float length;
	float area;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of square");
		length=scan.nextFloat();
	}
	public void compute() {
		area = length*length;
	}
	public void disp() {
		System.out.println("The area of a square is: " + area);
	}
}

class Circle {
	float radius;
	final float pi = 3.1414f;
	float area;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the radius of a circle");
		radius=scan.nextFloat();
	}
	public void compute() {
		area = pi*radius*radius;
	}
	public void disp() {
		System.out.println("The area of a circle is: " + area);
	}
}

public class LaunchBasicJavaProject1 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Square s = new Square();
		Circle c = new Circle();
		
		r.input();
		r.compute();
		r.disp();
		
		s.input();
		s.compute();
		s.disp();
		
		c.input();
		c.compute();
		c.disp();
		

	}

}
