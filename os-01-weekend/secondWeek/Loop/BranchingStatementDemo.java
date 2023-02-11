class BranchingStatementDemo {

	private static int[] arr = {3, 4, 5, 6, 7, 12, 2, 3};

	public static void main(String[] args) {
		
		testLoopOne();
	}

	static void testLoopOne() {
		int size = 0;
		//Condition test first
		while (size < arr.length) {
			System.out.println(arr[size]);
			size++;
		}
	}

	static void testLoopTwo() {
		int size = 0;
		//Do first and then condition if true do again
		do{
			System.out.println(arr[size]);
			size++;
		}
		while(size < arr.length);
	}

	static void testBranching() {

	}
}
