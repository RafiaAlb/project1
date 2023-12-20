package Fib;

import java.util.Scanner;

public class fib {

	static int fibbonacci (int n) {
		
		int a=0,b=1,c;
		if (n==0)
			return a;
		System.out.print("the series is "+b);
		for (int i=2 ; i<=n;i++) {
			c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
			
		}
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner (System.in);
System.out.println("Enter the number of terms you want to print: ");
int n=sc.nextInt();
fibbonacci(n);
	}

}
