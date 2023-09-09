package com.masai;

import java.util.Scanner;

public class DecimalToBinary {
	
	 public static String decimalToBinary(String decimalString) {
	 try {
		 
         double decimalValue = Double.parseDouble(decimalString);
		 

         int integerPart = (int) decimalValue;
         double fractionalPart = decimalValue - integerPart;
		

         StringBuilder binaryIntegerPart = new StringBuilder();

         if (integerPart == 0) {
             binaryIntegerPart.append("0");
         } else {
             while (integerPart > 0) {
                 int remainder = integerPart % 2;
                 binaryIntegerPart.insert(0, remainder);
                 integerPart /= 2;
             }
         }
             System.out.println(binaryIntegerPart.toString()+""+"firstCheck");
         StringBuilder binaryFractionalPart = new StringBuilder();
         
         int maxFractionalDigits = 8;  // to avoid infinite loop
                 System.out.println(fractionalPart);
         while (fractionalPart > 0 && maxFractionalDigits > 0) {
             fractionalPart *= 2;
             int bit = (int) fractionalPart;
             binaryFractionalPart.append(bit);
             fractionalPart -= bit;
             maxFractionalDigits--;
         }

         return binaryIntegerPart.toString() + (binaryFractionalPart.length() > 0 ? "." + binaryFractionalPart.toString() : "");
     } catch (NumberFormatException e) {
         System.err.println("Error: Input is not a valid decimal number.");
         return null;
     }
 }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String decimalString=sc.next();
        String binaryString = decimalToBinary(decimalString);

        if (binaryString != null) {
            System.out.println("Binary representation of " + decimalString + " is: " + binaryString);
        }


	}

}
