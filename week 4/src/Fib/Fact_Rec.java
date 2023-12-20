package Fib;

import java.util.Scanner;

public class Fact_Rec {
	
static int fact(int f) {
	
	if (f==0||f==1)
		return 1;
		return  f *fact(f-1);
}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number to find factorial : ");
		int f=sc.nextInt();
		System.out.println("the factorial of "+f+" is "+fact(f));
			}

		}
