import java.util.*;

public class MyArrayList {
	public static void main(String[] args) {
		// ArrayList can only use objects of classes
		//Integer,Float,String,Boolean are classes of int,float datatype in java.
		//defining an ArrayList
		ArrayList<Integer>list = new ArrayList<>();
		//Adding elements in ArrayList using .add() function
		list.add(0);
		list.add(1);
		list.add(2);
		System.out.println("Printing ArrayList here:");
		System.out.println(list);
		//Get elements
		//Using  .get(index)  function
		int element = list.get(1);
		System.out.println(element);

		//Add element in particular index
		//Using  .add(index,element) function
		list.add(1, 5);
		System.out.println(list);

		//set elements in particular index
		//Using   .set(index,element);
		list.set(0, 10);
		System.out.println(list);

		//Delete element
		//Using  .remove(index) function to delete element from list
		list.remove(3);
		System.out.println(list);

		//Finding size of ArrayList using  .size() function.
		System.out.println("The size of ArrayList is:" + list.size());

		//loops in ArrayList
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		//Sorting in ArrayList()
		System.out.println("After using sort function:");
		Collections.sort(list);
		System.out.println(list);
	}
}
