public class FindMaxNumber {
  
	//Multi D Array
	//History State Declaration
	private static int[][] history = new int[0][0];

	public static int findMax(int d1, int d2) {

		//Create array object
		var array = new int[]{d1, d2};
		
		//Add to History
		addToHistory(array);

		//Compare and return result
		//If d1 is greater than d2.  d1 > d2 ? d1 : d2;
		return innerFind(array);
	}

	private static void addToHistory(int [] array) {
		
		//Copy array 0 +1 =1
		var copy = new int[history.length + 1][2];

		//Looped Copy to History
		for(var i = 0; i < history.length; i++) {
			copy[i] = history[i];
		}

		//Copied Array length 1 to -1 = 0
		copy[copy.length - 1] = array;
		
		//Equality Assign
		history = copy;
	}

	private static int innerFind(int [] array) {
									//If Big.  if small
		return array[0] > array[1] ? array[0] : array[1];
	}

	public void history() {
		//Show History Method invocation
		for (var data : history) {
			System.out.printf("D1 = %d, Max Value is %d.%n", 
				data[0], data[2], innerFind(data));
		}
	}
}
