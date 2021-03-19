package com.ibm.sortedsets;

import java.util.Set;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();	
		names.add("Ram");
		names.add("Ajay");
		names.add("ajay");   
		//duplicate values are omitted in a sortedset
		System.out.println(names); //sorted in ascending order of Strings
	
	}		
}
