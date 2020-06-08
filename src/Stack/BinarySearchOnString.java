package Stack;

public class BinarySearchOnString {
	
	static int binarySearch(String[] s, String word,int low, int high){
		if(low>high)
			return -1;
		int mid = (low+high)/2;
		int val = word.compareTo(s[mid]);
		if(val == 0)
			return mid;
		if(val > 0)
			low = mid+1;
		else
			high = mid-1;
		return binarySearch(s, word, low, high);
	}

	public static void main(String[] args) {
		String[] s = {"abhi" , "bhama" , "cathrein"	, "dollow" , "east" , "fanny"};
		int i = binarySearch(s, "dollow", 0, s.length-1);
		if(i>=0){
			System.out.println("Word is present in "+i+" index");
		}
		else
			System.out.println("Word is not present");
	}
}
