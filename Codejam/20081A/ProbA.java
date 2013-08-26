import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.text.html.MinimalHTMLWriter;


public class ProbA {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int t = Integer.parseInt(br.readLine());
	
	while((t--)>0){
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		int n=Integer.parseInt(br.readLine());
		String x[] = br.readLine().split("[ ]");
		String y[] = br.readLine().split("[ ]");
		
		for(int i=0;i<x.length;i++)
		list1.add(Integer.parseInt(x[i]));
		
		for(int i=0;i<y.length;i++)
			list2.add(Integer.parseInt(y[i]));
		
		Collections.sort(list1 , new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2){
					return 1;
				} else if(o1 > o2) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		
		Collections.sort(list2);
		int product1 = 0;
		for(int i=0;i<list1.size();i++){
			product1 = product1 +( list1.get(i) * list2.get(i) );
		}
		
		

		Collections.sort(list2 , new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2){
					return 1;
				} else if(o1 > o2) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		
		Collections.sort(list1);
		int product2 = 0;
		for(int i=0;i<list2.size();i++){
			product2 = product2 +( list1.get(i) * list2.get(i) );
		}
		
		
		if(product1 < product2)
			System.out.println(product1);
		else
			System.out.println(product2);
			
			
	}

	}

}
