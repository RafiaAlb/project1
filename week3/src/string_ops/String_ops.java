package string_ops;

public class String_ops {
String str;
public String_ops(String str) {
	
	super();
	this.str=str;
	
}

public void showChar(int x) {
	
	System.out.println("the character at "+x+" is "+str.charAt(x));
	
}

public void printEvenChar() {
	for(int i=0;i<str.length();i++) {
		if((i+1)%2==0) {
			System.out.print(str.charAt(i)+" ");
		}
	}
}
public void joinStr(String s1,String s2) {
	String s3=s1.concat(s2);
	System.out.print(s3);
}

public void RevStr(String str) {
	String rstr="";
	for(int i=str.length()-1;i>=0;i--){
	 rstr=rstr+str.charAt(i);

}
	System.out.println("The reverse String is : "+rstr);	
	//Check if palendrome
	if(str.equals(rstr)) {
		System.out.println("The String  "+str+" is a palendrome");
	}
	else {
		System.out.println("The String  "+str+" is not a palendrome");
	}
}

}
