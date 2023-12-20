package Fib;

import java.util.Scanner;

public class Fib_Rec {
static int fib (int n) {
	if (n<=1)
		return n;
	return fib(n-1)+fib(n-2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number of terms you want to print : ");
int n=sc.nextInt();
System.out.println(n+"th Fibonacci number: "+fib(n));
	}

}
