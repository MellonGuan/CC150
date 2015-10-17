void zeroMatrix(int[][] matrix) {

	boolean zeroFirstLine = isFirstLineZero(matrix);
	boolean zeroFirstcolm = isFirstcolmZero(matix);

	for (int i = 0; i < matrix.length; i++){
		for (int j = 0; j < matrix[0].length; j++) {
			if (matrix[i][j] == 0) {
				matrix[i][0] = 0;
				matrix[0][j] = 0;
			}
		}
	}

	for(int i = 0; i < matrix.length; i++) {
		if(matrix[i][0] == 0){
			rowZerofy(matrix, i);
		}
	}

	for(int j = 0; j < matrix[0].length; j++) {
		if(matrix[0][j] == 0){
			colmZerofy(matrix, i);
		}
	}

	if(zeroFirstLine) {
		rowZerofy(matrix, 0);
	}

	if(zeroFirstcolm) {
		colmZerofy(matrix, 0);
	}

}

boolean isFirstcolmZero(int[][] matrix) {
	for (int i = 0; i < matrix.length; i++) {
		if (matrix[i][0] == 0){
			return true;
		}
	}
	return false;
}

boolean isFirstLineZero(int[][] matrix) {
	for (int i = 0; i < matrix[0].length; i++) {
		if (matrix[0][i] == 0){
			return true;
		}
	}
	return false;
}

void rowZerofy(int[][] matrix, int row) {
	for (int i = 0; i < matrix[0].length; i++) {
		matrix[row][i] = 0;
	}
}

void colmZerofy(int[][] matrix, int colm) {
	for (int i = 0; i < matrix.length; i++) {
		matrix[i][colm] = 0;
	}
}