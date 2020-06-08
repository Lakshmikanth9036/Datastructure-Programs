package SortingTechniques;

public class MergeSort {

	static void merge(int[] a, int l, int m, int h){
		int[] b = new int[h-l+1];
		int k = 0, i = l, j = m+1;
		
		while(i<=m && j<=h){
			if(a[i]<a[j])
				b[k++] = a[i++];
			else
				b[k++] = a[j++];
		}
		
		while(i<=m){
			b[k++] = a[i++];
		}
		
		while(j<=h){
			b[k++] = a[j++];
		}
		
		for (int j1 = 0; j1 < b.length; j1++) {
			a[l+i] = b[i];
		}
	}
	
	void mergSort(int[] a, int l, int h){
		if(l<h){
			int m = (l+h)/2;
			mergSort(a, l, m);
			mergSort(a, m+1, h);
			merge(a, l, m, h);
		}
	}
	public static void main(String[] args) {
		
	}

}
