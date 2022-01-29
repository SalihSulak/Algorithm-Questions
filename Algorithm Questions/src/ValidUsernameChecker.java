import java.io.*;
import java.util.*;

public class ValidUsernameChecker {
    public static String[] ALPHABET = "abcdefghijklmnopqrstuvwxyz".split("");
    public static String[] NUMS = "0123456789_".split("");

    public static boolean checkLength(String username){
        
        return username.length()>=8&&username.length()<=30;
    }
    
    public static boolean isFirstCharLetter(String username){
        
        return Arrays.asList(ALPHABET).contains(String.valueOf(username.charAt(0)).toLowerCase());
    }
    
    public static boolean checkCharIsValid(String username){
        boolean request = true;
        
        for(int j = 0;j<username.length();j++){
            request =Arrays.asList(ALPHABET).contains(String.valueOf(username.charAt(j)).toLowerCase())||Arrays.asList(NUMS).contains(String.valueOf(username.charAt(j)));
            if(!request){
            	break;
            }
        }
        
        return request;
    }
    
    public static void main(String[] args) {
        
        boolean request = true;
        Scanner sc = new Scanner(System.in);
        int countOfWords = sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<countOfWords;i++){
            String username = sc.nextLine();
            request = checkLength(username);
            if(!request){
                System.out.println("Invalid");
                continue;
            }
	        request = isFirstCharLetter(username);
	        if(!request){
	            System.out.println("Invalid");
	            continue;
	        }
	        request = checkCharIsValid(username);
	        if(!request){
	            System.out.println("Invalid");
	        }
	        if(request)
	            System.out.println("Valid");
        }
    }
}
