package com.classobject;

import java.util.Scanner;

public class StudentsInput {
	int stuid;
	String name;
	float marks1;
	float marks2;
	float marks3;
	float marks4;
	float per;
	char grade;

	void calPercentage() {
		per = ((marks1 + marks2 + marks3 / 300) * 100);
	}

	void calcGrade() {
		if (per >= 90)
			grade = 'A';
		else if (per >= 75)
			grade = 'B';
		else if (per >= 60)
			grade = 'c';
		else if (per >= 40)
			grade = 'd';
		else
			grade = 'f';

	}

	void display() {
		System.out.println("Id:" + stuid + "name:" + name + "percentage:" + per + "%");
		if (grade == 'f')
			System.out.println("you have failed....try hard next time");
		else
			System.out.println("congratulation!! you have passed with grade:" + grade);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StudentsInput s1 = new StudentsInput();
		System.out.println("Enter student id: ");
		s1.stuid = sc.nextInt();
		System.out.println("Enter student name: ");
		s1.name = sc.next();
		System.out.println("Enter student marks1: ");
		s1.marks1 = sc.nextFloat();
		System.out.println("Enter student marks2: ");
		s1.marks2 = sc.nextFloat();
		System.out.println("Enter student marks3: ");
		s1.marks3 = sc.nextFloat();

		s1.calPercentage();
		s1.calcGrade();
		s1.display();
		sc.close();

	}

	{

	}
}
