package week3;

	import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 

	public class List_test {

		public static void main(String[] args) {
			ArrayList <String> friends = new ArrayList<>();
			
			friends.add("Meerah");
			friends.add("Hamad");
			friends.add("Maryam");
			friends.add("Manayer");
			friends.add("Rashed");
			
			System.out.println(friends); 
			
			//add element to the list
			friends.add(3, "Ahmed"); 
			System.out.println(friends);
			
			ArrayList<String>friends2 = new ArrayList<>();
			friends2 = (ArrayList<String>) friends.clone();
			System.out.println("The Second List " + friends2);
			//remove the second element
			friends2.remove(1);
			
			//print the size
			System.out.println(	"the size of list 1 is : "+friends.size());
			System.out.println(	"the size of list 2 is : "+friends2.size());
			
			//split the list
			System.out.println("The first part is " + friends.subList(0, 3));
			System.out.println("The second part is " + friends.subList(3, 6));
			System.out.println("The original list is " + friends);
			
			//print all the names with hi
			for(int i=0;i<friends.size();i++) {
				System.out.println("Hi "+friends.get(i));
			}
			
			//for each loop to print hi
			for(String s :friends) {
				System.out.print(" Hello "+s);
			}
			//another way to print hi
			System.out.println();
			
			friends.forEach(s->{
				System.out.println("Hi "+s);
				System.out.println("How are you? "+s);
				
				
			});
List ls= friends.stream().filter(s->s.length()<5).collect(Collectors.toList());
System.out.print(ls);
		}

	}