package com.masai.ques7;

public class CmddLineInput {

	public static void main(String[] args) {
        System.out.println("Received command line inputs:");

        // Iterating  the command line arguments and printing
        for (String arg : args) {
            System.out.println(arg);
        }
	}
	
//	for text file we have to follow these step to get command line arguments==>
	
	
	//STEP 1: javac CommandLineInput.java
	//STEP 2: java CommandLineInput arg1 arg2 arg3
    //STEP 3:  Received command line inputs:
//	arg1
//	arg2
//	arg3
}
