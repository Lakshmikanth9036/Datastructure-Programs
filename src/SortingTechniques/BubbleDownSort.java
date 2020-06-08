package SortingTechniques;

import java.util.Scanner;

public class BubbleDownSort {

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
		
		for (int i = 0; i < a.length-1; i++) {
			for(int j = i+1; j<a.length; j++){
				if(a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
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
