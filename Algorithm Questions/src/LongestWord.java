/*
 * Algorithm Question
 * 
 * Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string. 
 * If there are two or more words that are the same length, return the first word from the string with that length. 
 * Ignore punctuation and assume sen will not be empty. Words may also contain numbers, 
 * for example "Hello world123 567"
 * 
 * */

import java.util.*; 
import java.io.*;

public class LongestWord {
	
	  public static String findLongestWord(String sen) {
		    String[] seperated = sen.split(" ");
		    String[] alphabet = "abcdefghijklmnopqrstuvwxyz0123456789".split("");
		    String biggest ="";
		    for(int i=0;i<seperated.length;i++){
		      String[] letters = seperated[i].split("");
		      String word ="";
		      for(int j=0;j<letters.length;j++){
		        boolean query=false;
		        for(int z=0;z<alphabet.length;z++){
		          if(letters[j].equals(alphabet[z])){
		              word+=letters[j];
		              query=true;
		          }
		        }
		      }
		      if(word.length()>biggest.length()){
		        biggest=word;
		      }
		    }
		    return biggest;
		  }
	
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print(findLongestWord(s.nextLine())); 

	}

}
