package StringQuestions;

import java.util.Arrays;

public class ArrayToString {
	
	public static void main(String[] args) {
		
		String[] stringArray = {"My", "name", "is","Jain"};
		
		String string1 = convertArrayToStringUsingToString(stringArray);
        System.out.println("An array converted to string using Arrays.toString(): " + string1);
 
        // 2. Using the StringBuilder.append() method
        String string2 = convertArrayToStringUsingAppend(stringArray);
        System.out.println("An array converted to string using StringBuilder.append(): " + string2);
 
        // 3. Using the String.join() method
        String string3 = convertArrayToStringUsingJoin(stringArray);
        System.out.println("An array converted to string using String.join(): " + string3);
 
        // 4. Using the Collectors.joining() method
        String string4 = convertArrayToStringUsingJoining(stringArray);
        System.out.println("An array converted to string using Collectors.joining(): " + string4);
		
	}

	private static String convertArrayToStringUsingJoining(String[] stringArray) {
		// TODO Auto-generated method stub
		return Arrays.toString(stringArray);
	}

	private static String convertArrayToStringUsingJoin(String[] stringArray) {
		String str = String.join(" ", stringArray);
        return str;
	
	}

	private static String convertArrayToStringUsingAppend(String[] stringArray) {
		StringBuilder stringBuilder = new StringBuilder();
		 
        for (int i = 0; i < stringArray.length; i++) {
            stringBuilder.append(stringArray[i]);
        }
        return stringBuilder.toString();
	}

	private static String convertArrayToStringUsingToString(String[] stringArray) {
		// TODO Auto-generated method stub
		return null;
	}

}
