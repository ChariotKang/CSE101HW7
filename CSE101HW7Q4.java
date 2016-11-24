class change{
	public static void main(String args[]){
		int v = 30;
		int coins[] = {3, 5, 10};
		boolean t[] = new boolean[v+1];
		t[0] = true;
		for (int i = 1; i < v + 1; i++){
			for(int j = 0; j < coins.length; j++){
				if (coins[j] <= i){
					if (t[i-coins[j]] == true){
						t[i] = true;
						break;
					}
				}
			}
		}
		for (int i = 0; i < v+1; i++){
			System.out.println(i + " " + t[i]);
		}
	}
}