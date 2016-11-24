class longestCommonSubstring{
	public static void main(String args[]){
		int a[] = {1, 1, 1, 1, 1, 2, 3, 3, 4};
		int b[] = {5, 5, 6, 6, 7, 2, 2,1,1, 1, 1, 1};
		int maxLength = 0;
		int table[][] = new int[a.length][b.length];
		for (int i = 0; i < b.length; i++){
			if (a[0] == b[i]){
				table[0][i] = 1;
				maxLength = 1;
			}
		}
		for (int j = 1; j < a.length; j++){
			if (a[j] == b[0]){
				table[j][0] = 1;
				maxLength = 1;
			}
		}
		for (int i = 1; i < a.length; i++){
			for (int j = 1; j < b.length; j++){
				if (a[i] == b[j]){
					table[i][j] = table[i-1][j-1] + 1;
					if (table[i][j] > maxLength)
						maxLength = table[i][j];
				}else{
					table[i][j] = 0;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++){
			for (int j = 0; j < b.length; j++){
				System.out.print(table[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println(maxLength);
	}
}