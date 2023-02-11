class BranchingStatementDemoOne {

	private static int[] arr = {3, 4, 5, 6, 7, 12, 2, 3};

	public static void main(String[] args) {
		
		testForLooping();
	}
  
  // FOR LOOP : 
	static void testForLoop() {

		for (int i = 0; i < arr.length;) {
			//
			System.out.println(arr[i]);
			// 
			i++;
		}
	}
  // FOR LOOP : 🤩🥳🥸😎
  // 
	static void testForLooping() {
		for (int i = arr.length-1; i>=0;) {
			System.out.println(arr[i]);
			i--;
		}
	}
  
  // WHILE LOOP
	static void testWhileLoop() {
		int size = 0;
		//Condition test first
		while (size < arr.length) {
			System.out.println(arr[size]);
			size++;
		}
	}
  
  // DO WHILE LOOP
	static void testDoWhileLoop() {
		int size = 0;
		//Do first and then condition if true do again
		do{
			System.out.println(arr[size]);
			size++;
		}
		while(size < arr.length);
	}
  
  //
	static void testBranching() {

	}
}
