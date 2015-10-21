public class Myqueue<T> {
	Stack in;
	Stack out;

	public Myqueue(){
		in = new Stack<T>();
		out = new Stack<T>();
	}	
}

public void push(T value) {
	while(out.size() != 0) {
		in.push(out.pop());
	}
	in.push(value);
}

public T pop() {
	while (in.size() != 0) {
		out.push(in.pop());
	}
	return out.pop();
}

public T peak() {
	while (in.size() != 0) {
		out.push(in.pop());
	}
	return out.peak();
}