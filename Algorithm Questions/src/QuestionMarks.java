/*
 * Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers,
 * letters, and question marks, and check if there are exactly 3 question marks between every pair of two
 * numbers that add up to 10. If so, then your program should return the string true, otherwise it should 
 * return the string false. If there aren't any two numbers that add up to 10 in the string, then your program 
 * should return false as well.

 For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because 
 there are exactly 3 question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.
 * */

import java.util.*; 
import java.io.*;

public class QuestionMarks {
	  	public static boolean isNumber(String letter){
		    boolean sorgu=false;
		    String[] numbers ={"0","1","2","3","4","5","6","7","8","9"};
		    for (String element : numbers) {
		    if (element.equals(letter)) {
		        sorgu= true;
		      }
		    }
		    return sorgu;

		  }
		  public static String QuestionsMarks(String str) {
		    String word="";
		    int sorgu=0;
		    int toplam=0;
		    int kac=0;
		    int count=0;
		    String newString = str.replaceAll("[^0-9?]+","");
		    String[] seperated = newString.split("");
		    for(int i = 0;i<seperated.length;i++){
		      if(isNumber(seperated[i])&&sorgu!=-1){
		        toplam+=Integer.parseInt(seperated[i]);
		        kac++;
		        if(kac==2){
		          if(toplam>=10){
		            if(count>=3){
		          sorgu=1;
		          toplam=Integer.parseInt(seperated[i]);
		          kac=1;
		          count=0;
		          }
		          else{
		            sorgu=-1;
		          }
		        }
		      }
		    }
		    else{
		      count++;
		    }
		  }
		    
		    boolean sorgu2=false;
		    if(sorgu==1){
		      sorgu2=true;
		    }
		      return String.valueOf(sorgu2);

		  }
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print(QuestionsMarks(s.nextLine())); 

	}

}
