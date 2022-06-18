package solutions;

import java.util.Scanner;

public class BubbleSort {
	public int array[];		
	public int NUM_ELEMENTS, temp, len, i, j;
	public boolean status = true;//-------------------------status
	Scanner sc = new Scanner(System.in);

	public void implmentationOfBubbleSort() {//--------------------------------------implmentationOfBubbleSort()
		System.out.println("Enter the number of elements to sort");//------------------------printing
		NUM_ELEMENTS = sc.nextInt();
		array = new int[NUM_ELEMENTS];
		System.out.println("Enter the elements now.");//-------------------------------------printing

		// Insert values
		insertValues();

		// Sort values();
		do {
			sortValues();//-----------??????????????????????????   what is this block doing???
			status = checkForStatus();
		} while (status == false);
	}

	public void insertValues() {	//-----------------------------------------------------insertValues()
		for (int i = 0; i < NUM_ELEMENTS; i++) {
			System.out.print("Enter element at position " + i + ": ");
			array[i] = sc.nextInt();
		}
	}

	public boolean checkForStatus() {//---------------------------------------------------checkForStatus()
		for (i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {			//----------???????????????????????
				return false;
			}
		}
		return true;

	}

	public void sortValues() {//--------------------------------------------------------------sortValues()
		len = array.length - 1;
		for (int i = 0; i < len; i++) {
			//j = i + 1;
			if (array[i] > array[i+1]) {
				temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
				printValues();
			}
		}
		len -= 1;//------------??? does it mean len is decreasing by -1 after every iteration   ????
	}

	public void printValues() {//-------------------------------------------------------------printValues()
		for (int i = 0; i < array.length; i++) {
			System.out.println("Value at position " + i + " is:" + array[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {//----------------------------------------------------main
		BubbleSort bubblesort = new BubbleSort();//--------- object
		bubblesort.implmentationOfBubbleSort(); //---------- invoking
	}
}
