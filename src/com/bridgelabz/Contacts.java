package com.bridgelabz;
import java.util.Scanner;
public class Contacts {
	public static void Contact(String f_name, String l_name, String address, String city, String state, long zip, long phoneNo, String email ) {
		System.out.println(f_name);
		System.out.println(l_name);
		System.out.println(address);
		System.out.println(city);
		System.out.println(state);
		System.out.println(zip);
		System.out.println(phoneNo);
		System.out.println(email);
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First name: ");
		String f_name = sc.next();
		System.out.println("Enter your Last name: ");
		String l_name = sc.next();
		System.out.println("Enter your Home Address: ");
		String address = sc.next();
		System.out.println("Enter your City name: ");
		String city = sc.next();
		System.out.println("Enter your State: ");
		String state = sc.next();
		System.out.println("Enter your Zip code: ");
		long zip = sc.nextInt();
		System.out.println("Enter Your Phone Number: ");
		long phoneNo = sc.nextLong();
		System.out.println("Enter your Email: ");
		String email = sc.next();
		
		Contact(f_name, l_name, address, city, state, zip, phoneNo, email);
	}
}
