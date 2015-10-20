boolean deleteNode(LinkedListNode node){
	if(n == NULL || n.next = NULL) {
		return false;
	}

	LinkedListNode next = n.next;
	n.data = next.data;
	n.next = n.next.next;
	return true;
}

