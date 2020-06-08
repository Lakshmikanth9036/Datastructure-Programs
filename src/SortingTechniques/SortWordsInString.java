package SortingTechniques;

import java.util.Scanner;

public class SortWordsInString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of words you want: ");
		int n = in.nextInt();
		String[] s = new String[n];
		System.out.println("Enter "+n+" words");
		for (int i = 0; i < s.length; i++) {
			s[i] = in.next();
		}
		
		System.out.println("String elements before sorting: ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < s.length; i++) {
			int j = i-1;
			String temp = s[i];
			while(j>=0 && temp.compareTo(s[j])<0){
				s[j+1] = s[j];
				j--;
			}
			s[++j] = temp;
		}
		

		System.out.println("String elements after sorting: ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		in.close();
	}

}
