public class TrafficCongestion {
	long[] table = new long[1000001];
	public long theMinCars(int treeHeight) {
		table[0] = 1;
		table[1] = 1;
		for(int i=2;i<=treeHeight;i++){
			table[i] = (2*table[i-2]+table[i-1])% 1000000007;
		}
		
		return table[treeHeight];
		
	}
};
