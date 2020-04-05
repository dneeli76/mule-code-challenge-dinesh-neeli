package com.mule.util;

public class ConvertCamelCase {
	
	public static String convertCamelCase(String str) {
	    if (str == null || str.isEmpty()) {
	        return str;
	    }
	 
	    StringBuilder stringBuilder = new StringBuilder();
	 
	    boolean convertNext = true;
	    for (char ch : str.toCharArray()) {
	        if (Character.isSpaceChar(ch)) {
	            convertNext = true;
	        } else if (convertNext) {
	            ch = Character.toTitleCase(ch);
	            convertNext = false;
	        } else {
	            ch = Character.toLowerCase(ch);
	        }
	        stringBuilder.append(ch);
	    }
	 
	    return stringBuilder.toString();
	}

}
