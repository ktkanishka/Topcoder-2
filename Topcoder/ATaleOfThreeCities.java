/*
250 point problem.
Bruteforce and calculate the minimum distance between AB, AC and BC and select the sum of two minimum values
*/

public class ATaleOfThreeCities {
	public double connect(int[] ax, int[] ay, int[] bx, int[] by, int[] cx, int[] cy) {
        double miniAB = 9999;
        for(int i=0;i<ax.length;i++){
            for(int j=0;j<bx.length;j++){
            	miniAB = Math.min(miniAB, dist(ax[i],ay[i],bx[j],by[j])); 
            }
        }
        double miniBC = 9999;
        for(int i=0;i<bx.length;i++){
            for(int j=0;j<cx.length;j++){
            	miniBC = Math.min(miniBC, dist(bx[i],by[i],cx[j],cy[j])); 
            }
        }
        double miniAC = 9999;
        for(int i=0;i<ax.length;i++){
            for(int j=0;j<cx.length;j++){
            	miniAC = Math.min(miniAC, dist(ax[i],ay[i],cx[j],cy[j])); 
            }
        }
        return res(miniAB, miniBC, miniAC);
    }
    
    private static double dist(int ax, int ay, int bx, int by){
        return Math.sqrt((bx-ax)*(bx-ax) + (by-ay)*(by-ay));
    }
    
    private static double res(double a, double b, double c) {
    	double maxi = -9999;
        if(a > b) maxi = a; else maxi = b;
        if(c > maxi) maxi = c;
        return a + b + c - maxi;
    }
}