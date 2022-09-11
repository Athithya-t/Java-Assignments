import java.util.Arrays;
public class SearchingandSorting {
	public void LinearSearch(int arr[],int key) {
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==key) {
				System.out.println(key+" found at "+(i+1)+" position");
			}
		}
	}
	
	public void BinarySearch(int arr[], int key) {
		int low = 0;
		int high = (arr.length-1);
		Arrays.sort(arr);
		while (high>=low){
			int mid = (int)((high+low)/2);
			if (key>arr[mid]) {
				low = mid+1;
			}
			else if(key<arr[mid]) {
				high = mid-1;
			}
			else if(key==arr[mid]) {
				System.out.println(key+" Found at "+mid+" in list "+Arrays.toString(arr));
				break;
			}
		}
	}
	
	public void InsertionSort(int arr[]) {
		for (int i=0;i<(arr.length-1);i++) {
			int key = arr[i];
			for (int j=i;j<arr.length;j++) {
				System.out.println(arr[j]);
				if (arr[j]>arr[j+1]) {
					arr[j+1] = arr[j];
				}
			key = arr[j+1];
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void SelectionSort(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			for (int j=i;j<arr.length;j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String args[]) {
		SearchingandSorting S1 = new SearchingandSorting();
		int arr[] = {12,33,22,0,8};
	}
}
