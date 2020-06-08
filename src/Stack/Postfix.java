package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
	
	static int evaluate(String s){
		Stack<Integer> operands = new Stack<>();
		for(int i=0 ;i<s.length(); i++){
			char operand =s.charAt(i);
			if(operand == '+' || operand == '-' || operand == '*' || operand == '/' ){
				if(operands.isEmpty()){
					return -1;
				}
				int op2 = operands.pop();
				if(operands.isEmpty()){
					return -1;
				}
				int op1 = operands.pop();
				
				int result = 0;
				switch(operand){
				case '+': result = op1+op2;
						  break;
				case '-': result = op1-op2;
				  		  break;
				case '*': result = op1*op2;
				          break;
				case '/': result = op1/op2;
				          break;
				default: System.exit(0);
				}
				operands.push(result);
			}
			else{
				operands.push(s.charAt(i)-48);
			}
		}
		int finalres = operands.pop();
		if(operands.isEmpty())
			return finalres;
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the postfix expression: ");
		String s = in.next();
		int res = evaluate(s);
		if(res == -1)
			System.out.println("Enter valid expression....");
		else
			System.out.println(res);
		in.close();
	}

}
