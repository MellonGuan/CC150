boolean isPalindrome(LinkedListNode head) {
	LinkedListNode slow = head;
	LinkedListNode fast = head;
	Stack<Integer> stack = new Stack<Integer>();

	while(fast != NULL && fast.next !=NULL) {
		stack.push(slow.data);
		slow = slow.next;
		fast = fast.next.next;
	}

	if (fast != NULL) {
		slow = slow.next;
	}

	while(slow != NULL){
		int top = stack.pop().intValue();

		if(top != slow.data) {
			return false;
		}
		sl0w = slow.next;
	}
	return true; 
}