package String;

public class AllStringMethods
{

	public static void main(String[] args) 
	{
		String S1="Hiiii Dear";
		String s2="  How Are You  ";
		String A1="Hiiii Dear";
		String A2="";
		
		System.out.println("------1-toLowerCase()---------");//the String, converted to Lowercase.
		System.out.println(S1.toLowerCase());
		
		System.out.println("------2-toUppercase()---------"); // the String, converted to uppercase.
		System.out.println(S1.toUpperCase());
		
		System.out.println("--------3-trim() method--------------"); //a string whose value is this string, with all leadingand trailing space removed, or this string if ithas no leading or trailing space.
		System.out.println(s2.trim());
		
		System.out.println("----------------startsWith() and endsWith() method---------------"); //true if the character sequence represented by theargument is a prefix of the character sequence represented bythis string; false otherwise.
		System.out.println(S1.startsWith("Hi"));
		
		System.out.println("----------------4-endsWith() method---------------"); // true if the character sequence represented by theargument otherwise false.
		System.out.println(s2.endsWith("You"));
		
		System.out.println("----------------5-charAt() method------------------------"); //the char value at the specified index of this string.The first char value is at index 0.
		System.out.println(S1.charAt(1));
		System.out.println(s2.charAt(3));
		
		System.out.println("-------------6-lenghth() method--------------------------"); // the length of the sequence of characters represented by thisobject.
		System.out.println(S1.length());
		System.out.println(s2.length());
		
		System.out.println("-------------7-intern() method----------------------------"); //a string that has the same contents as this string, but isguaranteed to be from a pool of unique strings
		String S3=s2.intern();
		System.out.println(S3);
		
		System.out.println("-------------8-valueOf() method----------------------------");  // a string representation of the int argument.
		int a=25;
		String S4=String.valueOf(a);
		System.out.println(S4+10);
		
		System.out.println("-------------9-replace() method----------------------------");  // The resulting string
		System.out.println(S1.replace("Hiiii","Hey"));
		System.out.println(S1.replaceFirst("Hiiii","byyyyyy"));
		System.out.println(S1.replaceAll("i","n"));
		
		System.out.println("-------------10-concat() method----------------------------"); // a string that represents the concatenation of this object'scharacters followed by the string argument's 
		System.out.println(S1.concat(s2));
		
		System.out.println("-------------11-equals() method----------------------------"); //true if the given object represents a Stringequivalent to this string, false otherwise
		System.out.println(S1.equals(s2));
		
		System.out.println("-------------12-contains() method----------------------------"); // true if this string contains s, false otherwise
		System.out.println(S1.contains("H"));
		
		System.out.println("-------------13-substring() method----------------------------");  // the specified substring.
		System.out.println(S1.substring(2));
		
		System.out.println("-------------14-getBytes() method----------------------------"); // The resultant byte array
		System.out.println(S1.getBytes());
		
		System.out.println("-------------15-indexOf() method----------------------------"); //the index of the first occurrence of the character in thecharacter sequence represented by this object, or -1 if the character does not occur
		System.out.println(s2.indexOf('w'));
		
		System.out.println("-------------16-CompareTo() method----------------------------");		
		System.out.println(S1.compareTo(s2));
		//the value 0 if the argument string is equal tothis string;
		//a value less than 0 if this stringis lexicographically less than the string argument; 
		//and avalue greater than 0 if this string islexicographically greater than the string argument.
		
		System.out.println("-------------17-toCharArray() method----------------------------"); //a newly allocated character array whose length is the lengthof this string and whose contents are initialized to containthe character sequence represented by this string
		System.out.println(S1.toCharArray());
		
		System.out.println("-------------18-hashCode() method----------------------------"); //a hash code value for this object.
		System.out.println(S1.hashCode());
		
		System.out.println("-------------19-subSequence() method----------------------------"); //the specified subsequence.
		System.out.println(S1.subSequence(3,5));
		
		System.out.println("------------20-contentEquals() method----------------------------");//true if this String represents the samesequence of char values as the specified sequence, false otherwise
		System.out.println(S1.contentEquals(s2));
		System.out.println(S1.contentEquals(A1));
		
		System.out.println("------------21-isEmpty() method----------------------------");//true if length() is 0, otherwise false
		System.out.println(A1.isEmpty());
		System.out.println(A2.isEmpty());
		
		System.out.println("------------22-split() method----------------------------");  // the array of strings computed by splitting this stringaround matches of the given regular expression
		System.out.println(s2.split("  "));
		
		System.out.println("------------23-format() method----------------------------");   // return formated string
		System.out.println(String.format(" value is %f",30.15245));
		System.out.println(String.format(" value is %30.12f",30.15245));
		
		System.out.println("------------24-join() method----------------------------");    // joining given Strings
		System.out.println(String.join(s2,A1,A2,S1));
		
		
		
		
	}

	

	

}
