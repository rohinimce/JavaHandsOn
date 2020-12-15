package collectionFrameworkPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RemoveNullValuesFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveNullValuesFromList remove = new RemoveNullValuesFromList();
		//remove.removeNullElementUsingIterator();
		System.out.println("--------------------------");
		//remove.removeValueFromList_RemoveAll();
		System.out.println("--------------------------");
	//	remove.removeValueFromList_Lambdas();
		System.out.println("--------------------------");
		remove.removeValueFromList_RemoveIf();
	}

	// using iterator
	public void removeNullElementUsingIterator() {
		String[] arr = { "Geeks", null, "forGeeks", null, "A computer portal" };

		List<String> l = new ArrayList<>(Arrays.asList(arr));

		System.out.println("List with null values: " + l);

		// Creating a Predicate condition checking for null
		Predicate<String> p = item -> Objects.isNull(item);

		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			// Fetching the next element
			String t = itr.next();

			if (p.test(t)) { // p and t are null remove it
				itr.remove();
			}
		}

		System.out.println("After removing null values" + l);
	}
	
	// using RemoveAll
		public void removeValueFromList_RemoveAll() {
			String[] arr = { "1", "10", "15", "10", "12", "5", "10", "20"};
			

			List<String> l = new ArrayList<>(Arrays.asList(arr));

			System.out.println("Array: " + l);

			// Creating a Predicate condition checking for null
			Predicate<String> is10 = item -> (item=="10");

			Collection<String>c=new ArrayList<>();
			 for (String t : l) {
		            if (is10.test(t)) {
		                c.add(t);
		            }
		        }
			 System.out.println("Array: ------>" + c);
			 l.removeAll(c);
			System.out.println("After removing value 10------->" +l);
		}
		
		//using Lambdas(java 8)
		public void removeValueFromList_Lambdas() {
			String[] arr = { "1", "10", "15", "10", "12", "5", "10", "20"};
			

			List<String> l = new ArrayList<>(Arrays.asList(arr));

			System.out.println("Array: " + l);

			// Creating a Predicate condition checking for null
			Predicate<String> is10 = item -> (item!="10");

			 l = l.stream().filter(is10).collect(Collectors.toList());
			 System.out.println("Array: ------>" + 1);
			
			System.out.println("After removing value 10------->" +l);
		}
		
		
		//using removeIf
		public void removeValueFromList_RemoveIf() {
		String[] arr = { "Geeks", null, "forGeeks", null, "A computer portal" };

		List<String> l = new ArrayList<>(Arrays.asList(arr));

		System.out.println("List with null values: " + l);

		// Creating a Predicate condition checking for null
		Predicate<String> p = item -> (item==null);
		 l.removeIf(x -> p.test(x));
		 
		 System.out.println("List without null values"+ l);
		}
		
}
