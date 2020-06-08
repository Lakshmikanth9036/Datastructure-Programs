package MindTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		MashUp mu = new MashUp();
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of elements");
		int n = in.nextInt();

		int[] a = new int[n];

		System.out.println("Enter the "+n+" elements");
		for(int i=0; i<n; i++){
			a[i] = in.nextInt();
		}

		ArrayList<Integer> once = mu.apperOnce(a);

		Iterator<Integer> itr = once.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

		System.out.println();
		System.out.println("Enter the substring range: ");
		int x = in.nextInt();
		
		ArrayList<List<Integer>> ss = mu.subString(once, x);
		for (int i = 0; i < ss.size(); i++) {
			System.out.print(ss.get(i)+" ");
		}
		System.out.println();

		for (int i = 0; i < ss.size(); i++) {
			List<Integer> ls = ss.get(i);
			for(int j=0 ; j<ls.size(); j++){
				if(ls.get(j)<0){
					ls.set(j, -1*ls.get(j));
				}
			}
		}
		
		for (int i = 0; i < ss.size(); i++) {
			System.out.print(ss.get(i)+" ");
		}
		System.out.println();

		for (int i = 0; i < ss.size(); i++) {
			List<Integer> ls = mu.sort(ss.get(i));
			ss.set(i, ls);
		}
		
		for (int i = 0; i < ss.size(); i++) {
			System.out.print(ss.get(i)+" ");
		}
		System.out.println();

		ArrayList<Integer> values = new ArrayList<>();
		for (int i = 0; i < ss.size(); i++) {
			List<Integer> ls = ss.get(i);
			String val = "";
			for(int j=0 ; j<ls.size(); j++){
				val=val+ls.get(j);
			}
			int value = Integer.parseInt(val);
			values.add(value);
		}


		for (int i = 0; i < values.size(); i++) {
			System.out.print(values.get(i)+" ");
		}
		System.out.println();

		int biggest = values.get(0);
		for (int i = 1; i < values.size(); i++) {
			if(values.get(i)>biggest)
				biggest = values.get(i);
		}
		
		System.out.println(biggest);
		in.close();
	}
}


