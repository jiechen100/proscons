package com.jie.design.inheritance;

//interface extends interface
//interface Base2 implements Base {}

//class implements interface
//abstract class Base2 extends Base 
//{ public boolean m1(){ return true; }}

//good, abstract class implements interface, no need to implement all methods
//abstract class Base01 implements Base0 {}

//good, abstract class implements interface, no need to implement all methods
// abstract class Base2 implements Base {
// public boolean m1() {
// return (7 > 4);
// }
// }

// abstract class implements interface, no need to implement all methods
// but Cannot reduce the visibility of the inherited method
// abstract class Base2 implements Base {
// protected boolean m1() {
// return (5 > 7);
// }
// }

public class Class012 extends AbstractClass01 implements Interface0, Interface1 {
	public boolean m1() {
		return true;
	};

	public byte m2(short s) {
		return 1;
	};

	public static void main(String[] args) {
		if (new Class012() instanceof Interface1) {
			System.out.println("is Base1");
		}
		
		if (new Class012() instanceof Class012) {
			System.out.println("is Base012");
		}
		
		if (new Class012() instanceof AbstractClass01) {
			System.out.println("is Base2");
		}
		
		System.out.println(new Class012().getClass());
	}
}