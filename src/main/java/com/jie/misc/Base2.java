package com.jie.misc;

//interface extends interface
//interface Base2 implements Base {}

//class implements interface
//abstract class Base2 extends Base 
//{ public boolean m1(){ return true; }}

//good, abstract class implements interface, no need to implement all methods
abstract class Base2 implements Base {}

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