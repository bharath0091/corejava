package org.bharath0091.split;

public class TestSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String stringValue = "3176765";
		System.out.println(stringValue.replaceAll("^", "+"));
		
		String stringValue2 = " ,:";
		String[] array = stringValue2.split(",");
		for (String string : array) {
			System.out.println("array value :" + string + ":");
		}
		
		
		System.out.println(stringValue2.replaceAll("^", "+"));
	}
}