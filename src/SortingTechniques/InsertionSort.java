package SortingTechniques;

import java.util.Scanner;

public class InsertionSort {

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
		
		for (int i = 1; i < a.length; i++) {
			int j = i-1, temp = a[i];
			while(j>=0 && temp<a[j]){
				a[j+1] = a[j];
				j--;
			}
			a[++j] = temp;
		}
		
		System.out.println("Array elements after sorting: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		in.close();
	}
}
