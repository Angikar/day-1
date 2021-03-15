package com.ibm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class arrays {
	public static void main(String[] args) {

		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			Account account = new Account("Ram" + i, (float) 100 * i);
			accounts[i] = account;
		}
		for (int i =0;i<accounts.length;i++) {
			System.out.println(accounts[i].getName() + " ," + accounts[i].getBalance());
		}
		//System.out.println(accounts.toString();
		System.out.println("****************");

		List<Account> list = new ArrayList<Account>();
		for (Account iter : accounts) {
			list.add(iter);
		}
		 System.out.println(list);
		 System.out.println("***************************");

			for (Iterator iterator = (Iterator) list.iterator();iterator.hasNext(); ) {
				Integer integer = (Integer)iterator.next();
				System.out.println(integer);
			}
	}
}
