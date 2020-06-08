package SortingTechniques;

import java.util.Scanner;

public class SortStringUsgInsertionSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = in.nextLine();
		char[] ch = s.toCharArray();
		for (int i = 1; i < ch.length; i++) {
			int j = i-1;
			char temp = ch[i];
			while(j>=0 && temp < ch[j]){
				ch[j+1] = ch[j];
				j--;
			}
			ch[++j] = temp;
		}
		System.out.println("String element after sorting: "+new String(ch));	
		in.close();
	}

}
