package com.gndu.pratibha.helloworld;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String args[]) {
		try {
			FileInputStream file = new FileInputStream("E:\\Abc.txt");
			int sentence = file.read();
			System.out.print((char) sentence);

			file.close();
		} catch (Exception e) {
			System.out.println(e);

		}
	}

}
