package SortingTechniques;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = in.nextInt();
		int[] a = new int[n];
		System.out.println("Enter "+n+" elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		System.out.println("Array elements before sorting: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for(int j = i+1; j < a.length; j++){
				if(a[min] > a[j])
					min = j;
				}
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
		}
		
		System.out.println("Array elements after sorting: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		in.close();
	}

}
