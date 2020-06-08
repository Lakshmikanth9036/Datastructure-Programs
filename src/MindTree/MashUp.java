package MindTree;

import java.util.ArrayList;
import java.util.List;

public class MashUp {

	ArrayList<Integer> apperOnce(int[] a){
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j])
					count++;
			}
			if(count == 1)
				arr.add(a[i]);	
		}
		return arr;
	}
	
	ArrayList<List<Integer>> subString(ArrayList<Integer> a, int x){
	
		ArrayList<List<Integer>> ss = new  ArrayList<>();
		int len = x-1;
		
		for(int i=0; i<a.size()-x; i++){
			
			if(a.get(i)>a.get(i+len)){
				ss.add(a.subList(i, i+x));
			}	
		}
		return ss;
	}
	
	List<Integer> sort(List<Integer> ls1){
		
		List<Integer> ls = new ArrayList<>(ls1);
		
		for(int j=0 ; j<ls.size(); j++){
		
			for(int k=j+1; k<ls.size(); k++){
				
				String s1 = ""+ls.get(j);
				String s2 = ""+ls.get(k);
				
				if(s1.compareTo(s2)<0){
					
					int temp = ls.get(j);
					
					ls.set(j, ls.get(k));
					
					ls.set(k, temp);
				}
			}
		}
		return ls;
	}

}
