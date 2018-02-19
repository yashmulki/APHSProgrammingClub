public class Arrays {

	public static void main(String[] args) {
		/*
		 * An Array is an object that holds other objects and
		 * variables. You must define the length of the array 
		 * while you are declaring the array. All objects in an array must be 
		 * the same type. So, all ints or all strings, or all doubles.
		 */
		
		int[] arr = {4,5,6};
		
		//now we've created an array of ints
		//it has values, 4, 5, and 6
		//now we're going to access the values in the array
		
		//to access the 1st value, we'll call the index labeled 0
		//we'll also use the name of the array, nums
		
		System.out.println(arr[0]);
		
		//we cannot call an index that doesnt exist, however
		//that will result in an exception, which is basically,
		//the computer telling you that there is an error
		
		System.out.println("this will result in an exception");
		System.out.println(arr[3]);
		
		//you can create an array with a preset amount of spaces
		//and then assign values as needed
		
		int[] arr2 = new int[5];
		arr2[0] = 5;
		arr2[2] = 7;
		//now we have two values set, th 1st and 3rd, indexes
		//0 and 2 respectively,
		//what happens when we try to access index 1?
		
		
		
		//(this will result in exception) System.out.println(arr2[1]);
		
		
		
	}
	
}