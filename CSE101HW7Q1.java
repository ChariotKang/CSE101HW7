
class maxSum{
	static int max = 0;
	static int maxL = 0;
	static int maxR = 0;
	static int l = 0;
	public static void main(String args[]){
		int a[] = {5, 15, -30, 10, -5, 40, 10};
		findMaxSum(a, a.length-1);
		System.out.println(max + " " + maxL + " " + maxR);
	}
	static int findMaxSum(int a[], int j){
		if (j == 0){
			return 0;
		}else{
			//int currentMax = Math.max((findMaxSum(a, j-1)+a[j]), a[j]);
			int currentMax;
			int pre = findMaxSum(a, j-1)+a[j];
			if (pre > a[j]){
				currentMax = pre;
			}else{
				currentMax = a[j];
				l = j;
			}
			if (max < currentMax){
				max = currentMax;
				maxR = j;
				maxL = l;
			}
			return currentMax;
		}
	}
}