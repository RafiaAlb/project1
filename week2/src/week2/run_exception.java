package week2;

public class run_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test_exception te = new Test_exception();
int[] a= {22,33,44,55,66,77};

try {
	

System.out.println(a[6]);
}
catch (Exception e) {
	e.printStackTrace();
	System.out.print(e.getMessage());
}
//try {
//te.div(24, 0);
	//}catch (Exception e) {
		
	//	System.out.println(e.getMessage());
		//te.div(24, 1);
	//}

}}
