package MindTree;

import java.util.Arrays;

public class MashUp2 {
	
	static int fun(int[] a, int x){
		int[] unique = new int[a.length];
		int k = 0;
		for(int i = 0; i < a.length; i++){
			boolean uq = true;
			for(int j = 0 ; j < a.length; j++){
				if(a[i]==a[j]&&i!=j){
					uq = false;
					break;
				}
			}
			if(uq)
				unique[k++]=a[i];
		}
		System.out.println(Arrays.toString(unique));
		if(k==0)
			return -1;
		
		int max=-2;
		for(int i =0 ;i<k-x;i++){
			String st[] = new String[x];
			if(unique[i]>unique[i+(x-1)]){
				for(int j=0; j<x; j++){
					int ar= unique[i+j];
					if(ar<0)
						ar=ar*-1;
					st[j]=""+ar;
				}
				System.out.println(Arrays.toString(st));
				for(int j = 0 ;j<st.length;j++){
					for(int j2 = j+1; j2<st.length; j2++){
						if(st[j].compareTo(st[j2])<0){
							String t = st[j];
							st[j] = st[j2];
							st[j2] = t;
						}
					}
				}
				System.out.println(Arrays.toString(st));
				
				String num = "";
				for (int j = 0; j < st.length; j++) {
					num = num+st[j];
				}
				System.out.println(num);
				int no = Integer.parseInt(num);
				if(no>max)
					max=no;
				}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		int[] fun = {-20,20,-10,20,0,4,8,-20, 10, -10, 8, 6, 15, 9 ,18 ,35, 40 ,-30, -90 ,99};
		System.out.println(fun(fun,4));
	}
}
