package SortingTechniques;

import java.util.Scanner;

public class BobbleUpSort {

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
		int n1 = a.length-1;
		for (int i = 0; i < n1; i++) {
			for(int j = 0; j<n1-i; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("Array elements after sorting: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		in.close();
	}

}
