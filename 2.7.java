class Result {
	
	LinkedListNode tail;
	int size;
	Result(LinkedListNode t, int s){
		tail = t;
		size = s;
	}
}

linkedListNode findIntersection(LinkedListNode list1, LinkedListNode list2) {
	if (list1 == NULL || list2 == NULL) {
		return NULL;
	}

	Result result1 = getResult(list1);
	Result result1 = getResult(list1);

	if(result1.tail != result2.tail) {
		return NULL;
	}

	LinkedListNode shorter = result1.size < result2.size ? list1 : list2;
	LinkedListNode longer = result1.size < result2.size ? list2 : list1;

	int diff = math.abs(result1.size - result2.size);

	for(int i = 0; i < diff; i++){
		longer = longer.next;
	}

	while(shorter != longer){
		shorter = shorter.next;
		longer = longer.next;
	}

	return shorter;

}