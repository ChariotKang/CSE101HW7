class palindromicSubsequence{
	static int b[][] = new int[14][14];
	public static void main(String args[]){
		char a[] = {'A', 'C', 'G', 'T', 'G', 'T', 'C', 'A', 'A', 'A', 'A', 'T', 'C', 'G'};
		
		System.out.println(findLongest(a, 0, a.length - 1));
	}
	static int findLongest(char a[], int l, int r){
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
	}		
}