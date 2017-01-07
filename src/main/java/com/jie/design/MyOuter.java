package com.jie.design;

public class MyOuter {

	public static class MyInner1 {
		public static void foo() {
		}
	}

	public class MyInner2 {
		public void foo() {
		}
	}

	public static void main(String[] args) {
		MyOuter.MyInner1 m = new MyOuter.MyInner1();
		MyOuter.MyInner1 mi = new MyInner1();

		MyOuter m1 = new MyOuter();
		MyOuter.MyInner2 mii = m1.new MyInner2();

		MyInner1 mmi = new MyOuter.MyInner1();

	}
}
