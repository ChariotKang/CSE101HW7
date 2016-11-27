class palindromicSubsequence{
	static int table[][] = new int[14][14];
	public static void main(String args[]){
		char a[] = {'A', 'C', 'G', 'T', 'G', 'T', 'C', 'A', 'A', 'A', 'A', 'T', 'C', 'G'};
		for (int i = 0; i < a.length; i++){
			table[i][i] = 1;
		}
		for (int i = 1; i < a.length; i++){
			for (int j = 0; j < a.length - i;j++){
				if (a[j] == a[i+j]){
					table[j][i+j] = table[j+1][i+j-1] + 2;
				}else{
					table[j][i+j] = Math.max(table[j+1][i+j], table[j][i+j-1]);
				}
			}
		}
		for(int i = 0; i < a.length; i++){
			for (int j = 0; j < a.length; j++){
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(table[0][a.length-1]);
	}
}