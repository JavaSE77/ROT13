package com.javase.xyz;

import java.util.Scanner;

public class Fetcher {

	public Fetcher() {
		
	}
	
	public String FetchDataFromUser(String prompt) {
		StringBuilder output = new StringBuilder();
		
		System.out.println(prompt);
		Scanner scanner = new Scanner(System.in);

		output.append(scanner.nextLine());
		
		scanner.close();
		return output.toString();
	}
	
}
