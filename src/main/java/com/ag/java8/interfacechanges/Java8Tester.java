/**
 * @(#)Java8Tester.java Oct 11, 2016 7:37:40 PM
 */

package com.ag.java8.interfacechanges;

/**
 * @author <a href="aravindan.guna@gmail.com">Aravindan G.</a>
 * @since
 * @version 1.0
 * @created date: Oct 11, 2016 7:37:40 PM
 */
public class Java8Tester {
	
	public static void main(String args[]) {
		Vehicle vehicle = new Car();
		vehicle.print();
	}
}

interface Vehicle {

	//It need not be always void
	default void print() {
		System.out.println("I am a vehicle!");
	}

	static void blowHorn() {
		System.out.println("Blowing horn!!!");
	}
}

interface FourWheeler {
	default void print() {
		System.out.println("I am a four wheeler!");
	}
}

class Car implements Vehicle, FourWheeler {
	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("I am a car!");
	}
}
