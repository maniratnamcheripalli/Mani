package com.practise.task;

import java.util.Scanner;

public class Circle extends Shape {
	
	static int radius;
	public void area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle");
		 radius=sc.nextInt();
		System.out.println("Area of circle   "+(3.14*radius*radius));
	}
	public void perimeter() {
		System.out.println("Perimeter of circle "+(float)(2 * 3.14*radius));
		
	}

}
