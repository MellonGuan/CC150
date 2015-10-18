LinkedListNode nthToLast(LinkedListNode head, int k){

	LinkedListNode p1 = head;
	LinkedListNode p2 = head;

	for(int i = 0;i < k;i++){
		if(p2 == NULL) {
			return NULL;
		}
		p1=p1.next;
	}

	while(p1 != NULL) {
		p1 = p1.next;
		p2 = p2.next;
	}

	return p2.data;
}