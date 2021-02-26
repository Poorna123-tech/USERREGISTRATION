package com.project.userauthentication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Users {

	static Map<Integer, User> userData = new HashMap<>();

	public Users() {

	}

	public static void addUser()

	{
		Scanner sc = ScannerInstance.getScannerInstance();
		System.out.println("Enter User id:");
		String userId = sc.next();
		userId = validateInput(userId, "[0-9]+", "Numeric");
		System.out.println("Enter User Name:");
		String userName = sc.next();
		userName = validateInput(userName, "[0-9a-zA-Z]+", "String");
		System.out.println("Enter Password");
		String password = sc.next();
		System.out.println("Enter email id");
		String email = sc.next();
		email = validateInput(email, "^[A-Za-z0-9+_.-]+@+(.+)$", "valid email");
		User u = new User();
		u.setUserId(Integer.valueOf(userId));
		u.setUserName(userName);
		u.setEmail(email);
		u.setPassword(password);
		userData.put(Integer.valueOf(userId), u);
		System.out.println("User added to  List");
	}

	public static Map getAllUser() {
		return userData;
	}

	public static void login() {
		System.out.println("Enter User id:");
		Scanner sc = ScannerInstance.getScannerInstance();
		String userId = sc.next();
		userId = validateInput(userId, "[0-9]+", "Numeric");

		System.out.println("Enter Password");
		String password = sc.next();

		User u = userData.get(Integer.valueOf(userId));

		if (u == null) {
			System.out.println("User does not exist.Please login again");
		} else {
			if (u.getPassword().equals(password)) {
				System.out.println("User login success");
			} else {
				System.out.println("Invalid password please login again");
			}
		}

	}

	public static String validateInput(String input, String pattern, String type) {
		Scanner sc = ScannerInstance.getScannerInstance();
		// System.out.println("Value of pattern::"+executeRegx(input,pattern) +"
		// INput is "+input);
		while (!(executeRegx(input, pattern))) {
			System.out.println("Please enter valid " + type + " value. For example pattern " + pattern);
			input = sc.next();
		}
		;
		return input;
	}

	public static Boolean executeRegx(String input, String pattern) {

		if (input == null) {
			return Boolean.FALSE;
		}

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		if (m.matches()) {
			return Boolean.TRUE;
		}

		return Boolean.FALSE;

	}

}
