import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class ProbA {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n,k,i,t,count;
		Set<String> searchEngines = new HashSet<>();
		ArrayList<String> searchEngineList = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("D:\\Github_Topcoder\\Codejam\\2008QA\\in.txt"));
		int caseNumber = 0;
		t = Integer.parseInt(br.readLine());
		while((t--)>0) {
			count=0;
			searchEngines.clear();
			searchEngineList.clear();
			caseNumber++;
			n = Integer.parseInt(br.readLine());
			for(i=0;i<n;i++){
				searchEngineList.add(br.readLine());
			}
			
			k = Integer.parseInt(br.readLine());
			searchEngines.addAll(searchEngineList);
			for(i=0;i<k;i++){
				String query = br.readLine();
				if(searchEngines.contains(query)){
					searchEngines.remove(query);
				}
				if(searchEngines.size() == 0) {
					count++;
					searchEngines.clear();
					searchEngines.addAll(searchEngineList);
					searchEngines.remove(query);
				}
			}
			
	
			System.out.println("Case #"+caseNumber+": "+count);
			
		}

	}

}
