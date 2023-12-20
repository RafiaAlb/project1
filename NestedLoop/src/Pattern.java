
public class Pattern {

	String Name;
	
	public void LowerTri(int lines) {
		for(int i=0;i<=lines;i++) // for the lines
		{
			for(int j=0;j<=i;j++) {
System.out.print(j+1+"");
			}
				System.out.println();
		}
}
	
public void RevTri(int lines) {
	
	for(int i=0;i<lines;i++)
	{
		for(int j=0;j<lines-i;j++) {
			System.out.print(j+1);
			
		}
		System.out.println();
	}
}
public void CompTri(int lines) {
	for(int i=0;i<=lines;i++) // for the lines
	{
		for(int j=0;j<=i;j++) {
System.out.print(j+1+"");
		}
			System.out.println();
	}
	for(int i=0;i<lines;i++)
	{
		for(int j=0;j<lines-i;j++) {
			System.out.print(j+1);
			
		}
		System.out.println();

}
}
public void FullTri(int lines) {
	for(int i=0;i<lines;i++) {//for the lines
		for(int j=0;j<lines-i;j++)//for the spaces
		{	System.out.print(" ");}
	
	for (int j=i;j>0;j--) { //for the reverse characters on each line
		System.out.print(j+1);
	}
	for(int j=0;j<=i;j++) {
		System.out.print(j+1); //for the characters of the last triangle
	}
	System.out.println();
	
}
	}
public void FlipTri(int lines) {
	for(int i=lines-1;i>=0;i--) {
		for(int j=0;j<lines-i;j++)
		{	System.out.print(" ");}
	
	for (int j=i;j>0;j--) { 
		System.out.print(j+1);
	}
	for(int j=0;j<=i;j++) {
		System.out.print(j+1); 
	}
	System.out.println();
	
}
	}

public void Diamond(int lines) {
	for(int i=0;i<lines;i++) {//for the lines
		for(int j=0;j<lines-i;j++)//for the spaces
		{	System.out.print(" ");}
	
	for (int j=i;j>0;j--) { //for the reverse characters on each line
		System.out.print(j+1);
	}
	for(int j=0;j<=i;j++) {
		System.out.print(j+1); //for the characters of the last triangle
	}
	System.out.println();
	
}
	for(int i=lines-1;i>=0;i--) {
		for(int j=0;j<lines-i;j++)
		{	System.out.print(" ");}
	
	for (int j=i;j>0;j--) { 
		System.out.print(j+1);
	}
	for(int j=0;j<=i;j++) {
		System.out.print(j+1); 
	}
	System.out.println();
	
}
}
	
}



