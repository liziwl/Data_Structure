package ex3;

public class Stack_Sy {
	protected int capacity;// 数组的实际容量
	protected char[] S;// 对象数组
	protected int top = -1;// 栈顶元素的位置
	// 按指定容量创建栈对象

	public Stack_Sy(int cap) {
		capacity = cap;
		S = new char[capacity];
	}

	// 测试栈是否为空
	public boolean isEmpty() {
		return (top < 0);
	}

	public int getSize() {
		return top;
	}
	// 入栈
	public void push(char obj) throws Exception{
		if(getSize()==capacity){
			throw new Exception("意外：栈溢出");}
		S[++top]=obj;
	}

	// 取栈顶元素
	public char top() throws Exception {
		if(isEmpty())
			throw new Exception("意外：栈空");
		return S[top];
	}

	// 出栈
	public char pop() throws Exception {
		char elem;
		if(isEmpty())
			throw new Exception("意外：栈空");
		elem=S[top];
		top--;
		return elem;
	}
}