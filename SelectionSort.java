package sorting;

public class SelectionSort {
	static void performSelectionSort(int []arr){
		int size=arr.length;
		int temp;
		for (int i=0;i<size;i++){
			int smallest = i;		//---- at first, smallest=i=0 index
			for(int j=i+1;j<size;j++){
				if(arr[smallest]>arr[j]){
					smallest=j;
					/*temp=arr[j];
					arr[j]=arr[smallest];
					arr[smallest]=temp;*/
					
				}
			}
			//swapping
			temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = { 9, 5, 8, 6,1, 15, 7 };

		System.out.println("before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		performSelectionSort(arr);
		System.out.println("after sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
