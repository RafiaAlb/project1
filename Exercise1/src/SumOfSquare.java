
public class SumOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//square of the sum
     int num=1;
     int sum=0; // set sum to 0 and then add with the square
     int square;
     int x=2;
     int total=0;  //total for sum of square
     int i=1;
     while (num<=10)
     {
    	 square=(num*num);
    	 sum=sum+num;
    	 num++;
     }
    double SOS=Math.pow(sum, x);
		System.out.println("the square of the sum is : "+SOS);
		
		
		//sum of square
		
		while (i<=10) {
		 total+=i*i;
		 i++;
		}
		System.out.println("the sum of the square is : "+total);
		
		System.out.println("the difference between them is : "+(SOS-total));
	}

}
