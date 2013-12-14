

public class ColorfulRoad {
	
	public int min(int a,int b){
		if(a<b)
			return a;
		else 
			return b;
	}
	
	int[][] matrix;
	public int getMin(String road) {
		matrix = new int[30][30];
		int i,k,j;
		
		for(i=0;i<20;i++){
			for(k=0;k<20;k++){
				matrix[i][k] = 99999999;
			}
		}
		
		for(i=1;i<road.length();i++){
			for(k=0;k<i;k++){
				if((road.charAt(k) == 'R' && road.charAt(i) == 'G') || 
					(road.charAt(k) == 'G' && road.charAt(i) == 'B') ||
					(road.charAt(k) == 'B' && road.charAt(i) == 'R') ){
					matrix[k][i] = (i-k)*(i-k);
				}
			}
		}
		
		for(k=0;k<road.length();k++){
			for(i=0;i<road.length();i++){
				for(j=0;j<road.length();j++){
					matrix[i][j] = min(matrix[i][j],matrix[i][k] + matrix[k][j]);
				}
			}
		}
		
		if(matrix[0][road.length()-1] == 99999999)
			return -1;
		else
			return matrix[0][road.length()-1];
		
	}

}
