
public class BubbleSortCountSwap {
	
	public static void bubbleSort(int[] list) {
		
		boolean SortedList = false;
		
		int countSwaps = 0;
		
		while(!SortedList) {
			SortedList = true;
			for(int i = 0; i < list.length - 1; i++) {
				if(list[i] > list[i + 1]) {
					int temp = list[i];
					list[i] = list[i + 1];
					list[i+1] = temp;
					
					countSwaps++;
					SortedList = false;
				}
			}
		}
		System.out.println("Number of swaps: " + countSwaps);
		System.out.println("First element in list: " + list[0]);
		System.out.println("Last element in list: " + list[list.length-1]);
	}



	public static void main(String[] args) {
		
		int[] numList = {4,10,9,3,5};
		
		bubbleSort(numList);
		
		for (int i : numList) {
			System.out.println(i + " ");
		}

	}
}