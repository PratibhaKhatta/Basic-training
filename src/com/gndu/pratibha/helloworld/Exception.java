package com.gndu.pratibha.helloworld;

public class Exception {
	public static void main(String args[]) {

		try

		{
			int arr[] = { 1, 2, 3 };

			System.out.println(arr[8]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Rest of code");

	}
}