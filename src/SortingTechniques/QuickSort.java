package SortingTechniques;

import java.util.Arrays;

public class QuickSort {
	
	static int partition(int[] a, int l, int h){
		int pivot = a[l];
		int i = l+1, j = h;
		while(i<j){
			while(i<h && a[i]<pivot)
				i++;
			while(j>l && a[j]>pivot)
				j++;
			if(i<j){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		a[l] = a[j];
		a[j] = pivot;
		return j;
	}
	
	static void quickSort(int[] a, int l, int h){
		if(l<h){
			int p = partition(a, l, h);
			quickSort(a, l, p-1);
			quickSort(a, p+1, h);
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int[] a = {5, 4, 1, 2, 9};
		quickSort(a, 0, 4);
	}

}
