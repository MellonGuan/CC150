int checkHight(TreeNode root) {
	if(root == null) {
		return 0;
	}
	int leftHight = checkHight(root.left);
	int rightHight = checkHight(root.left);

	if(leftHight == -1 || rightHight == -1){
		return -1;
	}
	else{
		if(math.abs(leftHight - rightHight) > 1) {
			return -1;
		}
		else {
			return math.max(leftHight, rightHight) + 1;
		}
	}
}

boolean checkBlance(TreeNode root) {
	if(checkHight(root) = -1) {
		return false;
	}
	else {
		return true;
	}
}