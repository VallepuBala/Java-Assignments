package QA_Practise;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsArrayList {

	public static void main(String[] args) {
		
		// ArrayList Declaration
		 ArrayList<Object> list = new ArrayList<>();
		 // Adding elements to created list
		 list.add("Bala");
		 list.add(25);
		 list.add(25500.50);
		 list.add(25); // ArrayList allows duplicate values
		 System.out.println("Before Remove: " + list);
		 
		 //remove object from a list
		 list.remove(1); // removes value at index 1
		 System.out.println("After Remove: " + list);
		 
		 //add element at specific index, Note: moves the element present at the specified index to right
		 list.add(2, 27000);
		 System.out.println("After adding element at specific index: " + list);
		 
		 // replace the existing value in a list
		 list.set(0, "Durgesh");
		 System.out.println("After Replace: " + list);
		 
		 // looping through the list and print the elements one by one
		 // Simple loop
		 System.out.println();
		 System.out.println("Simple For Loop:");
		 for(int i = 0; i<list.size(); i++) {
			 System.out.println(list.get(i));   // to extract the values from list we need to use .get method
		 }
		 
		 
		 //For-each loop
		 System.out.println();
		 System.out.println("For-Each Loop:");
		 for(Object ele : list) {
			 System.out.println(ele);
		 }
		 
		 //Iterator
		 System.out.println();
		 System.out.println("Loop using Iterator:");
		 Iterator<Object> iterate = list.iterator();
		//Note: We need to use [WHILE] when we are using Iterator
		 while(iterate.hasNext()) {      // .hasNext() will check is elements available                
			 System.out.println(iterate.next()); //.next() will extract the available next element
		 }
		 
		 
		 //To remove multiple elements from a ArrayList we don't have any direct method, but we can do as below
		 ArrayList<Object> removeHelper = new ArrayList<>();
		 removeHelper.add("Durgesh");
		 removeHelper.add(27000);
		 list.removeAll(removeHelper);
		 System.out.println();
		 System.out.println("After multiple elements removal: " + list);
		 
		 
		 
		 
	}

}
