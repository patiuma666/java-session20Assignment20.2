package collections; 
//creating package name as collections 
//In this program we are trying to copy the elements from set2 to set1
//so that the set1 becomes the union of set2 as set1
import java.util.HashSet;
import java.util.Set;

//creating the class name as Sets 
public class Sets { 
	
 //created main method 
	public static void main(String[] args) {
		
		//creating the object of the Set using HashSet as set1
		Set set1 = new HashSet();
		
		//adding four string elements in the set1 object
		set1.add("The wings of fire");  
		set1.add("you can win");
		set1.add("Harry Potter");
		set1.add("Mahabharta");
		
		//creating the object of the Set using HashSet as set2
	    Set set2 =new HashSet(); 
	    
	  //adding four string elements in the set2 object
	    set2.add("Lie of Pi");
	    set2.add("A Thousand splendid suns");
	    set2.add("The incredible Hulk");
	    set2.add("Sherlock Holmes");
	 
	    //printing the elements of the set1 and set2 
		System.out.println("The set1 elements are : "+set1 );
		System.out.println("The set2 elements are : "+set2 );
		
		//adding all the elements from the set2 to set1 
		//after adding all the elements it shows as one set 
		set1.addAll(set2);
		
		System.out.println("After adding all the elements of set2 to set1 are : " ); 
		//prints as the statement is
		System.out.println(set1 );  //as it prints all the elements
		
		
	}

}
