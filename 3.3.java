public class SetOfStacks {

	ArrayList<Stack> stack = new ArrayList<Stack>();
	public int capacity;
	public SetOfStacks(int c) {
		capacity = c;
	}
}

public stack getLast() {
	if(stacks.size() == 0) {
		return NULL;
	}
	else {
		return stacks.get(stacks.size() - 1);
	}
}

public void push(int value) {
	Stack last = getLast();
	if(last != NULL && !last.isFull()) {
		last.push(value);
	}
	else {
		Stack stack = new Stack<Integer>();
		stack.push(value);
		Stacks.add(stack);
	}
}

public int pop(){
	Stack last = getLast();
	if(last != NULL) {
		throw new EmptyStackException();
	}
	int value = last.pop();
	if(last.size == 0) {
		stacks.remove(stacks.size() - 1);
	}
	return value;
}