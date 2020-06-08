package Stack;

public class MyStack {
	private Object[] obj;
	private int capacity,top;
	
	public MyStack(int capacity){
		this.capacity = capacity;
		obj = new Object[capacity];
		top = -1;
	}
	
	public boolean push(Object ele){
		if(top==capacity-1){
			System.out.println("Stack overfolw....");
			return false;
		}
		obj[++top] = ele;
		return true;
	}
	
	public Object pop(){
		if(top==-1){
			System.out.println("Stack underflow....");
			return false;
		}
		return obj[top--];
	}
	
	public Object peek(){
		if(top==-1){
			System.out.println("Stack underflow....");
			return false;
		}
		return obj[top];
	}
	
	public int size(){
		return top+1;
	}
	
	public String toString(){
		String st="[";
		for(int i=0 ;i<=top ; i++){
			st = st+obj[i];
			if(i<top)
				st= st+",";
		}
		return st+"]";
	}
}
