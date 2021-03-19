package com.ibm.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFileInfo {
	public static void main(String[] args) {
		demo();
		readingLine();
}

	private static void readingLine() {
		try {
		Reader reader = new FileReader("./input.txt"); //reads one character at a time
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line = bufferedReader.readLine();
		while(line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
		
	}

	private static void demo() {
		
		try {
		Reader reader = new FileReader("./input.txt"); //reads one character at a time
		int character  =  reader.read(); //reads hashcode
		System.out.println((char)character);
		while( character != -1) {  // to ptint all the characters one by one
			System.out.println((char)character);
			character = reader.read();
		}
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
}
