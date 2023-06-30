package java_code_challenges;

public class ReverseEachWordsOfString {

	public static void main(String[] args) {

//Approach1
		String s1 = "Java object oriented concepts";
		String[] arr = s1.split(" ");
		String reversString = "";
		
		for(int i=arr.length-1; i>=0; i--) {
			String reversWord = "";
			for(int j=arr[i].length()-1; j>=0; j--) {
				reversWord += arr[i].charAt(j);
			}
			reversString += reversWord+" ";
		}
		System.out.println("before reverse: "+s1);
		System.out.println("after reverse: "+reversString);
		
//Approach2
		String s = "Hello";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		s = sb.toString();
		System.out.println("after reversing: "+ s);
		
	}
}
