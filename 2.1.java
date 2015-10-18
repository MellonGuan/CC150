// method O(n) in time complexity
void deleteDups(LinkedListNode node) {
	
	HashSet<Integer> set = new HashSet<Integer>();
	LinkedListNode previous = NULL;
	while (node != NULL){
		if(set.contains(node.data)){
			previous.next = node.next;
		}
		else {
			set.add(node.data);
			previous = node;
		}
	}
}

// method two

void deleteDups(linkedListNode head) {
	linkedListNode current = head;
	while(current != NULL) {
		runner = current;
		while(runner != NULL) {
			if(runner.next.data == current.data) {
				runner.next = runner.next.next;
			}
			else {
				runner = runner.next;
			}
		}
		current = current.next;
	}
}