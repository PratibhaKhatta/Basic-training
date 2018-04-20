package com.gndu.pratibha.helloworld;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStream {
	public static void main(String args[]) {
		try {
			FileOutputStream file = new FileOutputStream("E:\\Abc.txt");
			file.write(65);
			file.close();
			System.out.println("Hello How are you?");
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}