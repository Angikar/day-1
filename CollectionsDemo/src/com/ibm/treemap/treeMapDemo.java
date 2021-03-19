package com.ibm.treemap;

import java.util.Map;
import java.util.TreeMap;

public class treeMapDemo {
	public static void main(String[] args) {

		Map<String, String> accounts = new TreeMap<String, String>();
		accounts.put("1", "account1");
		accounts.put("2", "account2");
		System.out.println(accounts);
		
		accounts.put("4", "account4");
		accounts.put("3", "account3");   
		System.out.println(accounts); //prints all in ascending order of keys
		
		accounts.put("-1", "account-1");
		System.out.println(accounts);
	}
}
