package com.ibm.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileDemo {
	public static void main(String[] args) {
		demo();
	}

	private static void demo() {
		try {
			Writer file = new FileWriter("output.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(file);
			bufferedWriter.write("Writing into a file!");
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
