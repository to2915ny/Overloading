package edu.handong.csee.java.lab08;

public class Overloading {
	public static double getAverage (double first , double second)
	{
		return (first + second)/2;
	}
	public static double getAverage (double first , double second , double third)
	{
		return (first + second + third)/3;
	}
	public static char getAverage (char first, char second)
	{
		return (char)(((int)first + (int)second)/2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double average1 = getAverage(40.0 ,50.0);
		double average2 = getAverage(1.0 ,2.0 , 3.0);
		char average3 = getAverage('a','d');
		
		System.out.println("average1 = " + average1);
		System.out.println("average2 = " + average2);
		System.out.println("average3 = " + average3);

	}

}
