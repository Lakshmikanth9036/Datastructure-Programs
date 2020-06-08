package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedrNot {

	static boolean isBalnced(String s){
		Stack<Character> stk = new Stack<>();
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(ch == '{' || ch == '[' || ch == '(')
				stk.push(ch);
			else{
				if(stk.isEmpty())
					return false;
				switch (ch) {
				case '}' : if(stk.pop()!='{')
								return false;
							break;
				case ']' : if(stk.pop()!='[')
								return false;
							break;
				case ')' : if(stk.pop()!='(')
								return false;
							break;
				}
			}	
		}
		
		return stk.isEmpty();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = in.next();
		boolean res = isBalnced(s);
		if(res)
			System.out.println("Balanced......");
		else
			System.out.println("Not Balanced.......");
		in.close();
	}

}
