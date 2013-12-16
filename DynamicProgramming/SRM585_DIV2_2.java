public class TrafficCongestionDivTwo {
	long[] table = new long[100];
	public long theMinCars(int treeHeight) {
if(table[treeHeight] > 0)
	return table[treeHeight];
		if(treeHeight == 0 || treeHeight == 1)
			return 1;
		else {
			long sum= 0;
			
			for(int i=0;i<=treeHeight - 2;i++){
				sum = sum + theMinCars(i);
				
			}
			table[treeHeight] = 1 + 2*(sum);
			return table[treeHeight];
		}
	}

}
