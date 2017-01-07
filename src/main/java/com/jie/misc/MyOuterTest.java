package com.jie.misc;

import com.jie.misc.MyOuter.MyInner1;

public class MyOuterTest {

	public static void main(String[] args) {
		MyOuter.MyInner1 m = new MyOuter.MyInner1();
		MyOuter.MyInner1 mi = new MyInner1();

		MyOuter m1 = new MyOuter();
		MyOuter.MyInner2 mii = m1.new MyInner2();

		MyInner1 mmi = new MyOuter.MyInner1();

	}
}
