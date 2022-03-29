package assignment8;

import java.util.Scanner;

public class Uc1 {

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
	    double length = Math. sqrt( ( ( x2 - x1 ) * ( x2 - x1 ) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) );
	    System.out.println("the length of the line is  "+ length);
	}

}
