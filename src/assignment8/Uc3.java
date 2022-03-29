package assignment8;

import java.util.Scanner;

public class Uc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	      System.out.println("enter value of x1 ");
	    int x1 = sc.nextInt();
	    System.out.println("enter value of x2 ");
	    int x2 = sc.nextInt();
	    System.out.println("enter value of y1 ");
	    int y1 = sc.nextInt();
	    System.out.println("enter value of y2 ");
	    int y2 = sc.nextInt();
	    double length1 = Math. sqrt( ( ( x2 - x1 ) * ( x2 - x1 ) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) );
	    System.out.println("the length of the line is  "+ length1);
	    
	    System.out.println("please enter the details for next line");
	      System.out.println("enter value of a1 ");
	    int a1 = sc.nextInt();
	    System.out.println("enter value of a2 ");
	    int a2 = sc.nextInt();
	    System.out.println("enter value of b1 ");
	    int b1 = sc.nextInt();
	    System.out.println("enter value of b2 ");
	    int b2 = sc.nextInt();
	    double length2 = Math. sqrt( ( ( a2 - a1 ) * ( a2 - a1 ) ) + ( ( b2 - b1 ) * ( b2 - b1 ) ) );
	    System.out.println("the length of the second  line is  "+ length2);
	    
	    
	      if(length1>length2) {
	         System.out.println("length of first line is big");
	      } else if(length1<length2) {
	         System.out.println("length of second line is big");
	      } else {
	         System.out.println("both are equal");
	}
	}
}
