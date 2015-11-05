boolean checkBST(TreeNode root, Integer min, Integer max) {
	
	if(root = null) {
		return false;
	}

	if ((min != null && root.data < min)||(max != null && root.data > max)) {
		return fasle;
	}

	if(!checkBST(root.left, min root.data) || !checkBST(root.right, root.data, max)) {
		return false;
	}
	return true;
}

