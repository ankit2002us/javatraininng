package StringQuestions;

import java.util.ArrayList;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myInputString = "this is the first string tring";
		
		printduplicates(myInputString);
//This comment is newly added
	}

	private static void printduplicates(String myInputString) {
		// TODO Auto-generated method stub
		int count = 0;
		char ch = 0;
		
		ArrayList <Character> charlist = new ArrayList<>();
		
		for(int i=0;i<myInputString.length();i++)
		{
			 ch = myInputString.charAt(i);
			
			for(int j=1;i<myInputString.length();j++) {
				
				if(myInputString.charAt(j)!=ch)
					continue;
			}
			
			count++;

			
		}
	
		if(!charlist.contains(ch)) {
			if (count > 1 && ch != ' ') {
				 
                System.out.println("Char: " + ch + ", Count: " + count + " times.");
                charlist.add(ch);
			
		}
	
		}
	}
}
