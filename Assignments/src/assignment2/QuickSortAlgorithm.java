package assignment2;

public class QuickSortAlgorithm {

	public static void main(String[] args) {
		
		int[] arr = {15,9,7,13,12,16,4,18,11};
		
		int leng = arr.length;
		
		QuickSortAlgorithm qsa = new QuickSortAlgorithm();
		qsa.quickStartRecursion(arr,0,leng-1);
		qsa.printArray(arr);
		
	}
		int partition(int[] arr, int low, int high) {
			
			int pivot = arr[(low+high)/2];
			while (low<=high) {
				while (arr[low]<pivot) {
					low++;
				}
				while (arr[high]>pivot) {
					high--;
				}
				if(low<=high) {
					int temp = arr[low];
					arr[low] = arr[high];
					arr[high] = temp;
					low++;
					high++;
				}
			}
			return low;
		}
		
		void quickStartRecursion(int[] arr, int low, int high) {
			int pi = partition(arr, low, high);
			
			if (low<pi-1) {
				quickStartRecursion(arr,low,pi-1);
			}
			if (pi<high) {
				quickStartRecursion(arr,pi,high);
			}
		}
		
		void printArray (int[] arr) {
			for (int i:arr) {
				System.out.println(i + " ");
			}
		}
	
	}


