package com.jie.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class IterationAndEnumeration {

	public static void main(String[] args) {
		// All have iterator
		// but Vecotr, Hashtable, ConcurrentHashMap have Enumeration
		
		Object x;
		x = new Vector().iterator();
		x = new Vector().elements();

		x = new Hashtable<String, String>().elements();
		x = new Hashtable<String, String>().entrySet().iterator();

		x = new ArrayList<String>().listIterator();
		x = new ArrayList<String>().iterator();

		x = new HashMap<String, String>().entrySet().iterator();

		x = new TreeMap<String, String>().entrySet().iterator();

		x = new HashSet<String>().iterator();

		x = new TreeSet<>(new HashSet<String>()).iterator();

		x = new ConcurrentHashMap<String, String>().elements();
		x = new ConcurrentHashMap<String, String>().entrySet().iterator();

	}

}
