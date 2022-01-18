/*
 * Have the function CodelandUsernameValidation(str) take the str parameter being passed and determine if the string is a valid username according to the following rules:

1. The username is between 4 and 25 characters.
2. It must start with a letter.
3. It can only contain letters, numbers, and the underscore character.
4. It cannot end with an underscore character.

If the username is valid then your program should return the string true, otherwise return the string false.
 * */

import java.util.*; 
import java.io.*;

public class CodelandUsernameValidation {
	public static boolean isLetter(String str){
	    String[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".split("");
	    boolean result = Arrays.asList(alphabetArray).contains(str.toLowerCase());
	    return result;
	  }
	  public static boolean isNumber(String str){
	    String[] numbers = "0123456789".split("");
	    boolean result = Arrays.asList(numbers).contains(str);
	    return result;
	  }
	  public static String codelandUsernameValidationFunc(String str) {
	    String[] chars = str.split("");
	    boolean result = true;

	    if(chars.length<4 || chars.length>25)
	      result = false;

	    if(!isLetter(chars[0]))
	      result = false;

	    if(chars[chars.length-1].equals("_"))
	      result = false;
	    
	    if(result){
	    for(int i=0;i<chars.length;i++){
	      if(isLetter(chars[i]) || isNumber(chars[i]) || chars[i].equals("_"))
	        result = true;
	      else 
	        result = false;
	    } 
	    }
	    return String.valueOf(result);
	  }
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print(codelandUsernameValidationFunc(s.nextLine())); 

	}

}
