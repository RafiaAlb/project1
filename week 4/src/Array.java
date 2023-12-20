import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//printing array 
int [] num = {2,3,4,5,88,66};
		for (int i =0;i<num.length;i++)
	System.out.println(num[i]);
//create scanner to take value from user
Scanner in = new Scanner (System.in);

//create new array of 10 elements and take inputs
int [] num2 = new int [10];
System.out.println(" Enter 10 elements for the array ");
for(int i=0;i<10;i++) 
	num2[i]=in.nextInt();
//printing the new array
	for(int i=0;i<num2.length;i++)
		System.out.println("The number at position "+i+" is "+num2[i]);
	
	
	int [][] matrix = new int [3][2];
	System.out.println("Enter 6 elements for the 2D array ");
	for (int i=0 ; i<3;i++) {
		for(int j=0 ; j<2;j++) {
			matrix[i][j]=in.nextInt();	
		
		
		}
	}
	
	//print the 2D array 
	for(int i=0;i<3;i++) {
		for (int j=0 ;j<2 ;j++) {
			System.out.println("The "+i+","+ j+ "elements in 2D array : "+matrix[i][j]);
		}
	}
}



	}


