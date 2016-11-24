class palindromicSubsequence{
	static int b[][] = new int[14][14];
	public static void main(String args[]){
		char a[] = {'A', 'C', 'G', 'T', 'G', 'T', 'C', 'A', 'A', 'A', 'A', 'T', 'C', 'G'};
		for (int i = 0; i < a.length; i++){
			b[i][i] = 1;
		}
		for (int i = 1; i < a.length; i++){
			for (int j = 0; j < a.length - i;j++){
				if (a[j] == a[i+j]){
					b[j][i+j] = b[j+1][i+j-1] + 2;
				}else{
					b[j][i+j] = Math.max(b[j+1][i+j], b[j][i+j-1]);
				}
			}
		}
		for(int i = 0; i < a.length; i++){
			for (int j = 0; j < a.length; j++){
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(b[0][a.length-1]);
		//System.out.println(findLongest(a, 0, a.length - 1));
	}
	/*static int findLongest(char a[], int l, int r){
		if (b[l][r] != 0){
			return b[l][r];
		}
		if (l > r){
			return 0;
		}
			
		if (a[l] == a[r]){
			b[l][r] = findLongest(a, l+1, r-1) + 2;
			return b[l][r];
		}else{
			System.out.println("l:"+l+" r " + r);
			b[l][r] = Math.max(findLongest(a, l+1, r), findLongest(a, l, r-1));
			return b[l][r];
		}
	}	*/	
}