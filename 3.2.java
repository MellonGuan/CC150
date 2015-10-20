public class StackWithMin extends Stack<Integer> {
	Stack<Integer> min;

	public StackWithMin() {
		min = new Stack<Integer>();
	}	

}

public void push(int value) {

	if(value < getMin()) {
		min.push(value);
	}
	super.push(value);
}

public int pop() {
	int value = super.pop();
	if(value == getMin()){
		min.pop();
	}
	return value;
}

public getMin() {
	if(min.isEmpty()) {
		return Integer.MAX_VALUE;
	}
	else {
		return min.peek();
	}
}

