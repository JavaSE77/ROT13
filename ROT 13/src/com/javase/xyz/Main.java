package com.javase.xyz;

public class Main {

	public static void main(String[] args) throws LetterOutOfACSIIRange {
		Rotter rot13 = new Rotter(13);
	
		//FYI, GUI framework will handle rotting
		GUIframework gui = new GUIframework(rot13);
		
//		//This is for the non GUI based version
//		
//		Fetcher fetcher = new Fetcher();
//		String s1 = fetcher.FetchDataFromUser("Please input data to be rotted:\n");
//		String s2 = rot13.rotate(s1);
//		String s3 = rot13.rotate(s2);
//		
//		System.out.println("S1: " + s1 + "\n");
//		System.out.println("S2: " + s2.toUpperCase() + "\n");
//		System.out.println("S3: " + s3.toLowerCase() + "\n");
	}
	
}
