package com.jie.collection;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class JustForInterview {
	public static void main(String[] args) {
		// node table, linked list, hash(key)-key-value
		// not thread safe
		// all one null key, allow null values
		// iterater fail-fast, throws java.util.ConcurrentModificationException
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Chen", "Jie");
		printKV("HashMap", hm.entrySet().iterator());
		System.out.println("HashMap Chen=" + hm.get("Chen"));

		// node table, linked list, hash(key)-key-value
		// thread safe due to synchronized method
		// not all null key/value
		// iterater not fail-fast
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("Chen", "Jie");
		print("Hashtable", ht.elements());
		System.out.println("Hashtable Chen=" + ht.get("Chen"));

		// node binary tree, parent-left-right
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("Chen", "Jie");
		printKV("HashMap", tm.entrySet().iterator());
		System.out.println("TreeMap Chen=" + tm.get("Chen"));

		// ***************
		// SET - HashSet, TreeSet
		// ***************

		// HashSet has-a HashMap, hash(key)-key-PRESENT
		// iterater fail fast, throws java.util.ConcurrentModificationException
		// allow null
		// faster than TreeSet
		// not thread safe
		// fail-fast
		HashSet<String> hs = new HashSet<String>();
		hs.add("Chen");
		hs.add("Jie");
		print("HashSet", hs.iterator());
		System.out.println("Hashtable Chen=" + hs.contains("Chen"));

		// TreeSet has-a TreeMap
		// comparator to sorting, entry has to implement java.lang.Comparable
		// not allow null since comparing
		// not thread safe
		// fail-fast
		TreeSet<String> ts = new TreeSet<>(hs);
		print("TreeSet", ts.iterator());
		System.out.println("TreeSet Chen=" + ts.contains("Chen"));

		// thread safe
		// not allow null key/value

		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<String, String>();
		chm.put("Chen", "Jie");
		printKV("ConcurrentHashMap", chm.entrySet().iterator());
		System.out.println("ConcurrentHashMap Chen=" + chm.get("Chen"));
	}

	static void print(String msg, Iterator<String> iter) {
		System.out.println();
		System.out.println(msg + "----------------");
		while (iter.hasNext()) {
			System.out.print(iter.next());
			System.out.print(",");
		}
		System.out.println();
		System.out.println(msg + "----------------");
	}

	static void printKV(String msg, Iterator<Entry<String, String>> iter) {
		System.out.println();
		System.out.println(msg + "----------------");
		while (iter.hasNext()) {
			Entry<String, String> entry = iter.next();
			System.out.print(entry.getKey());
			System.out.print("-");
			System.out.print(entry.getValue());
			System.out.print(",");
		}
		System.out.println();
		System.out.println(msg + "----------------");
	}

	static void print(String msg, Enumeration<String> enumer) {
		System.out.println();
		System.out.println(msg + "----------------");
		while (enumer.hasMoreElements()) {
			System.out.print(enumer.nextElement());
			System.out.print(",");
		}
		System.out.println();
		System.out.println(msg + "----------------");
	}
}
