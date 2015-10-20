LinkedListNode getCircularEntrance(LinkedListNode head) {
	if (head == NULL) {
		return NULL;
	}

	Hashset<LinkedListNode> set = new Hashset<LinkedListNode>();
	while(head != NULL) {

		if(set.contains(head)){
			return head;
		}
		set.add(head);
		head = head.next;
	}
}

