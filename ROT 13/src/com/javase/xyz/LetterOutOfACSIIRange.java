package com.javase.xyz;

public class LetterOutOfACSIIRange extends Exception {
	
    public LetterOutOfACSIIRange(String errorMessage) {
    	
        super(errorMessage);
    }
}