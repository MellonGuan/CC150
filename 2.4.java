void partition(linkedListNode head, int p) {

	linkedListNode current = head;
	if(current.next.data < p) {
		linkedListNode temp = current.next;
		temp.next = head;
		current.next = current.next.next;
	}
	current = current.next;
}
