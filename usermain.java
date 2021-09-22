import java.io.*;
import java.util.*;
import java.lang.Math;
public class usermain {
    int findAverage(int[]input1,int n) {
    	int i;
    	int sum=0;
    	float avg;
	   for(i=0;i<n;i++) {
		   sum = sum + input1[i];
	   }
	   avg = sum/n;
	   int y = Math.round(avg);
	   return y;
    }
    public static void main(String args[]) {
       int n,i;
 	   Scanner sc = new Scanner(System.in);
 	   System.out.println("enter no of element");
 	   n = sc.nextInt();
 	   int input1[] = new int[n];
 	   System.out.println("enter all the element");
 	   for (i=0;i<n;i++) {
 		   input1[i] = sc.nextInt();
 	   }
    	usermain u = new usermain();
    	System.out.println(u.findAverage(input1, n));
    }
}
