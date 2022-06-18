package searching;
import java.util.Scanner;

public class LinearSearchGL {
	public static int linearSearch(int arr[], int size, int element) {  //method for index
		for (int i = 0; i < arr.length; i++) {
			if (element== arr[i] );
				return i;
		}
		return 22;
		
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,50,90,70,80};
		int size = arr.length;
		System.out.println("Enter the element to be searched: ");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		int index = linearSearch(arr,size,element);
		if (index==22)
			System.out.println("element not found !!!");
		else 
			System.out.println("element found at index "+ index);
		
	}
	
}
