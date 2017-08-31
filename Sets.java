package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		
		Set set1 = new HashSet();
		set1.add("The wings of fire");
		set1.add("you can win");
		set1.add("Harry Potter");
		set1.add("Mahabharta");
		
		
	    Set set2 =new HashSet();
	    set2.add("Lie of Pi");
	    set2.add("A Thousand splendid suns");
	    set2.add("The incredible Hulk");
	    set2.add("Sherlock Holmes");
	 
		System.out.println("The set1 elements are : "+set1 );
		System.out.println("The set2 elements are : "+set2 );
		
		set1.addAll(set2);
		System.out.println("After adding all the elements of set2 to set1 are : " );
		System.out.println(set1 );
		
		
	}

}
