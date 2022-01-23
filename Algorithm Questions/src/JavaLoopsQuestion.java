/*
 * We use the integers , , and  to create the following series:
 * 
 * (a+2^0*b),(a+2^0*b+2^1*b),....(a+2^0*b+2^1*b+....+2^n-1*b)
 * 
 * You are given  queries in the form of , , and . For each query, print the series corresponding to 
 * the given , , and  values as a single line of  space-separated integers.
 * 
 * 
 * Sample Input
 * 2
 * 0 2 10
 * 5 3 5
 * 
 * Sample Output
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98
 * */


import java.util.*;
import java.io.*;
import java.util.stream.*;

public class JavaLoopsQuestion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            List<String> results = new ArrayList<>();
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int top;
            for(int k = 0;k<n;k++){
                top=a;
                for(int j = 0;j<=k;j++){
                    top+=Math.pow(2,j)*b;
                }
                results.add(String.valueOf(top));
            }
            System.out.println(results.stream().collect(Collectors.joining(" ")));
        }
        in.close();

	}

}


