package QA_Practise;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Array {

	public static void main(String[] args) {
		
		//1. Reverse an Array
		int[] arr = {1, 2, 3, 4, 5};
		for (int i = arr.length-1; i>= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		//2. find duplicates
		int[] arr1 = {1, 1, 3, 2, 3, 2, 4, 5, 4};
		for (int i = 0; i <arr1.length; i++) {
			for (int j = i+1; j<arr1.length; j++) {
				if(arr1[i] == arr1[j]) {
					System.out.println("Duplicate: " + arr1[i]);
				}
				
			}
		}
		
		//3. Copy of array
		int[] a = {1,2,3};
		int[] b = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(b));  // to print an array we need to use Arrays.toString(arr);
					// OR
		int[] c = new int [a.length];
		System.arraycopy(a, 0, c, 0, a.length);
		
		//4. Sum and Average of an array
		int[] num = {1, 2, 3, 4, 5};
		int sum = 0;
		for (int x : num) sum += x;
		System.out.println("Sum: "+ sum);
		double avg = (double)sum/num.length;
		System.out.println("Average: " + avg);
		
		//5. Linear Search
		int[] num1 = {1, 2, 3, 4, 5, 6};
		int key = 6, idx = -1;
		for (int i = 0; i < num1.length; i++) {
			if (num1[i]==key) {
				idx=i;
				System.out.println("Linear Search for value 6 ---> value found at index: "+idx);
				break;
			}
		}
		
		//6. Binary Search
		System.out.println("Found index of value 6 using Binary Search: " + Arrays.binarySearch(num1, 6));
		
		//7. Index of first/last
		int first = -1, last = -1;
		for(int i =0; i<num1.length; i++) {
			if (num1[i] == key) {
				first = i;
				System.out.println("First: " +first);
				break;
			}
		}
		for(int i = num1.length-1; i>=0;i--) {
			if(num1[i]==key) {
				last=i;
				System.out.println("Last: " +last);
				break;
			}
		}
		
		//8. Sort Asc/Desc
		Arrays.sort(num1);   // Learning: Arrays.sort is void method it don't return anything so don't assign to variable
		System.out.println("Ascending: " + Arrays.toString(num1));
		
		//Arrays.sort(num1, Collections.reverseOrder()); //Learning: reverseOder will work for objects integer[] not for int[]
		int[] desc = Arrays.stream(num1).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
		System.out.println("Descendnig using Styeams: " + Arrays.toString(desc));
		                           //OR
		Arrays.sort(num1);
		for(int i = 0; i < num1.length/2; i++) {
			int temp = num1[i];
			num1[i] = num1[num1.length-1-i];
			num1[num1.length-1-i] = temp;
		}
		System.out.println("Descending using loop: "+ Arrays.toString(num1));
		
		
		//Desc using Collections with Integer[] not int[]
		Integer[] num2 = {2,1,3,5,4};
		Arrays.sort(num2, Collections.reverseOrder());
		System.out.println("Desending: " + Arrays.toString(num2));
		
		
		
		
		
		
	}

}
