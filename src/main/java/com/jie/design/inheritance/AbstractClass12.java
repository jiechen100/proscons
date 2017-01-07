package com.jie.design.inheritance;

//interface extends interface
//interface AbstractClass12 implements Interface1 {}

//class implements interface
//abstract class AbstractClass12 extends Interface1 
//{ public boolean m1(){ return true; }}

//good, abstract class implements interface, no need to implement all methods
//abstract class AbstractClass12 implements Interface1 {}

//good, abstract class implements interface, no need to implement all methods
// abstract class Base2 implements Interface1 {
abstract class AbstractClass12 implements Interface0 {
	public boolean m1() {
		return (5 > 7);
	}

	// abstract class implements interface, no need to implement all methods
	// but Cannot reduce the visibility of the inherited method
	// abstract class AbstractClass12
	// implements Interface0 {
	// protected boolean m1() {
	// return (5 > 7);
	// }

}