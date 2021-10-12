package client.cli.demo;

import java.awt.Color;
import java.util.Scanner;

import solution.tut2.demo.Converter;
import solution.tut2.demo.Cylinder;
import solution.tut3.demo.Account;
import solution.tut3.demo.Fan;
import solution.tut3.demo.Rectangle;
import solution.tut6.demo.GeneralAccount;
import solution.tut6.demo.Savings;
import solution.tut6.demo.Checking;

public class App { 

	//Scanner 
	
	static Scanner scan = new Scanner( System.in ); //capture user-input
	
	public static void main(String[] args) {
		
		//tstConverter();
		//tstCylinder();   
		//runAccount();
		//runRectangle();
		//runFan();
		
		runAccountClassHierarchy();
		
	}
	
	static void runAccountClassHierarchy() {
		//declare-account
		GeneralAccount acc = null;
		
		/**
		 * Test with Savings account
		 */
		acc = new Savings();
		acc.setNumber(123456789);
		acc.setBalance(20000);
		acc.setAnnualInterestRate(0.005);
		
		System.out.println( "Account info >>>" );
		System.out.println( "Balance: "+acc.getBalance() );
		
		System.out.println( "\nTransaction >>> deposit(100)" );
		//in case without overriding feature, this method is being defined in GeneralAccount class so it invoked.
		//otherwise, the specific method in Savings class invoked...
		acc.deposit(100); 
		System.out.println( "\nAccount info >>>" );
		System.out.println( "Balance: "+acc.getBalance() );
		
		
	}
	
	static void runFan() {
		Fan f1 = new Fan(3);
		f1.setRadius(10);
		f1.setColor(Color.DARK_GRAY);
		f1.setOn(true);
		System.out.println( f1 );
	}
	
	static void runRectangle() {
		
		double w = 5, h = 50;
		String color = "yellow";
		
		//instanstiate objects for Rectangle
		//invoking no-arg constructor, Rectangle()
		Rectangle r1 = new Rectangle(); //empty-object
		r1.setWidth(w); 
		r1.setheight(h);
		Rectangle.setColor(color);
		System.out.println( r1 );
		
		//invoking overloaded-constructor, Rectangle(double, double, String)
		Rectangle r2 = new Rectangle( w, h, color );
		System.out.println( r2 );
		
	}
	
	static void runAccount() {
		
		//scenario: we're required to make an account object called savings account;
		//savings account object
		Account savings = new Account(); //empty object; //Account() is a constructor method-call...
		//Account savings = new Account( 1222 ); //id is set upon object instantiation...
		savings.setId(1222);
		savings.setBalance(20000);
		savings.setAnnualInterestRate(0.0045);
		System.out.println( savings );
		//deposit $5000
		savings.deposit(5000);
		System.out.println( savings );
		//withdraw $500
		savings.withdraw(500);
		System.out.println( savings );
		
		//scenario: we're required to make an account object called current account;
		Account current = new Account();
		current.setId(1333);
		current.setBalance(50000);
		current.setAnnualInterestRate(0.05);
		
		//scenario: we're required to make an account object called fixeddeposit account;
		Account fd = new Account();
		fd.setId(1444);
		fd.setBalance(1000000);
		fd.setAnnualInterestRate(0.3);
	}

	static void tstConverter() {
		
		//instantiate an object instance of Converter class
		Converter cvt = new Converter();
		
		//logic-steps
		//input; compute; output
		System.out.println( "Enter a foot: " );
		double foot = scan.nextDouble(); //capture user-input and then convert to primitive double
		
		double result = cvt.toMeter( foot );
		
		System.out.println( "you have entered: "+ foot );
		System.out.println( "\nMeter: "+ result );
	}
	
	static void tstCylinder() {
		Cylinder c = new Cylinder(); //instantiate a new Cylinder object instance
		
		//logic-steps
		//input; compute; output
		
		//input
		System.out.println( ">>> COMPUTE CYLINDER AREA & VOLUME" );
		System.out.println( "Enter radius: " );
		double radius = scan.nextDouble(); //Scanner obj captures user-input and then convert it to double typed
		System.out.println( "Enter length: " );
		double length = scan.nextDouble();
		
		//compute
		double area = c.calcArea(radius);
		double volume = c.calcVolume(radius, length);
		
		//output
		System.out.println( "\nArea: "+ area );
		System.out.println( "Volume: "+ volume );
		
		
	}
	
}
