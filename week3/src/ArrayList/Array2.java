package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer> numbers = new ArrayList<>();

numbers.add(5);
numbers.add(4);
numbers.add(17);
numbers.add(20);
numbers.add(8);
numbers.add(33);
numbers.add(27);
numbers.add(10);
numbers.add(2);
numbers.add(42);
System.out.println(numbers);
numbers.add(6, 23);
System.out.println(numbers);

ArrayList <Integer> numbers2 = new ArrayList<>();

numbers2= (ArrayList<Integer>)numbers.clone();
System.out.println(numbers2);
numbers2.remove(2);
System.out.println(numbers2);
System.out.println("The size of list 1 is : "+numbers.size());
System.out.println("The size of list 2 is : "+numbers2.size());


	
numbers2.forEach(s->{
	System.out.print(s*s+" ");
	
});
System.out.println();

List ls = numbers.stream().filter(s->s%2==0).collect(Collectors.toList());
		System.out.println("Even numbers in List 1 is: "+ls);
		
		System.out.print("The total cube of all numbers is: ");
		numbers2.forEach(s->{	
			System.out.print(s*s*s+" ");
			
		});
}
	
}

