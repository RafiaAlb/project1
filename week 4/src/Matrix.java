import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner (System.in);
int [][] A,B,C;
A= new int [3][3];
B= new int [3][3];
C= new int [3][3];
System.out.println(" Please enter 9 elements for A: ");
for(int i=0;i<3;i++) {
	for (int j=0 ;j<3 ; j++) {
		A[i][j]=in.nextInt();

	}
}

System.out.println(" Please enter 9 elements for B: ");
for(int i=0;i<3;i++) {
	for (int j=0 ;j<3 ; j++) {
		B[i][j]=in.nextInt();

	}
}

for (int i=0;i<3;i++) {
	for (int j=0 ;j<3;j++)
	 {
		C[i][j]=(A[i][j]+B[i][j]);	
}}
	System.out.println("Matrix C is :");
	for (int x=0;x<3;x++) {
		for (int y=0;y<3;y++) {
			System.out.println(C[x][y]);
		}
	}

}
	
}


